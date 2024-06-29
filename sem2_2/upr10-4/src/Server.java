import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static int LISTENING_PORT = 3331;

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(LISTENING_PORT);
		System.out.println("Server started...");
		while (true) {
			Socket socket = serverSocket.accept();
			new MyThread(socket).start();

		}
	}
}
