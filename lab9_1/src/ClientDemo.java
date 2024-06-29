import java.io.*;
import java.net.Socket;


public class ClientDemo {
    public static void main(String[] args) {
        int portNumber = 5555;

        try {
            Socket socket = new Socket("localhost", portNumber);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String userMessage;
            while (true) {
                System.out.print("Enter message to send to server (or 'exit' to close): ");
                userMessage = userInput.readLine();

                if ("exit".equalsIgnoreCase(userMessage)) {
                    break;
                }

                out.println(userMessage);

                System.out.println("Server response: " + in.readLine());
            }

            in.close();
            out.close();
            userInput.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
