import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MyThread extends Thread {
	private Socket socket;
	private PrintWriter socketWriter;

	public MyThread(Socket socket) throws IOException {
		this.socket = socket;
		this.socketWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
	}

	public synchronized void print() {
		try {
			socketWriter.println("Hello!");
			socketWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		print();
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}
}