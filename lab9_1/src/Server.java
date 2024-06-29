import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int portNumber = 5555;

        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Server is waiting for client connection on port " + portNumber);

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Client: " + inputLine);

                out.println("Server received: " + inputLine);
            }

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}