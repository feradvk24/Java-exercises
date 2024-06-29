import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(1111);
            Socket clientSocket = serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Customer c1 = new Customer("1234");
        Support s1 = new Support("Gosho");
        c1.start();
        s1.start();
    }
}

