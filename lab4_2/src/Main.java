import jdk.jfr.Event;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws arrayTooBig {
        Scanner scan = new Scanner(System.in);
        EventLog myArr = new EventLog();
        int i;
        int t = 1;
        int opt;
        while (t == 1) {
            System.out.print("Choose an option from the menu:\n1.Create an event array\n2.Add event\n3.Edit event\n4.Delete event\n5.Show event list\n6.Exit\n\nYour option--> ");
            opt = Integer.parseInt(scan.nextLine());


            switch (opt) {
                case 1:
                    try {
                        System.out.println("Choose array length: ");
                        i = Integer.parseInt(scan.nextLine());
                        myArr = new EventLog(i);
                    } catch (arrayTooBig e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        myArr.addEvent(scan);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Choose the index of the desired element to be edited and type its new name:");
                    i = Integer.parseInt(scan.nextLine());
                    String newEvent = scan.nextLine();
                    try{
                        myArr.editEvent(i,newEvent);
                    } catch (elemIsNull e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Choose the index of the desired element to be deleted:");
                    i = Integer.parseInt(scan.nextLine());
                    try {
                        myArr.delEvent(i);
                    } catch (elemIsNull e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    myArr.print();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    t = 0;
                    break;
                default:
                    System.out.println("Wrong input! Try again!");
            }

        }
    }
}


