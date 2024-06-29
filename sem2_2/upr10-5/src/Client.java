import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost", 3331);
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String welcomeMessage = socketReader.readLine();
		System.out.println(welcomeMessage);

		socket.close();

	}

}
