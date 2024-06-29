public class Ticket {
    private String message;
    private int id;

    public Ticket(String msg) {
        this.message = msg;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setId(int id) {
        this.id = id+1;
    }
}
