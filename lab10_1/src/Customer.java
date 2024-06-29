public class Customer extends Thread{

    private String client_num;
    public Customer(String client_num) {
        super(client_num);
    }

    @Override
    public void run()
    {
        System.out.println("Hello!");
    }


}

