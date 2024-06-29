import java.util.Scanner;

public class EventLog {
    private String[] eventArr;
    public EventLog(){
        this.eventArr = new String[1];
    }

    public EventLog(int size) throws arrayTooBig{
        if (size > 100) throw new arrayTooBig();
        this.eventArr = new String[size];
    }

    public String[] getEventArr() {
        return eventArr;
    }

    public void setEventArr(String[] eventArr) {
        this.eventArr = eventArr;
    }

    public void addEvent(Scanner sc){
        System.out.println("Enter an index in the array and the event you want to add");
        int index = Integer.parseInt(sc.nextLine());
        String event = sc.nextLine();
        if (eventArr[index] == null) {
            this.eventArr[index] = event;
        } else {
            System.out.println("Error!");
        }
    }

    public void print(){
        for (String e: eventArr) {
            if (e != null) System.out.println(e);
        }
    }

    public void editEvent(int index, String edit) throws elemIsNull {
        if (eventArr[index] == null) throw new elemIsNull();
        eventArr[index] = edit;
    }

    public void delEvent(int index) throws elemIsNull{
        if (eventArr[index] == null) throw new elemIsNull();
        eventArr[index] = null;
    }
}

