import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Support extends Thread{

    private String username;

    public Support(String username){
        super(username);
    }

    @Override
    public void run(){
        String ticket = null;
        Scanner sc = new Scanner(System.in);

        try {
            Socket socket = new Socket("localhost", 1111);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            while(!ticket.equals("exit")){
                System.out.println("Send a message: ");
                ticket = sc.nextLine();
                out.println(ticket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

