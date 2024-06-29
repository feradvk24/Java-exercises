import java.util.Scanner;

public abstract class Patient {
    private String name;
    private String address;
    private String id;

    public Patient(){
        this.name = "";
        this.address = "";
        this.id = "";
    }
    public Patient(String n, String a, String i){
        this.name = n;
        this.address = a;
        this.id = i;
    }
    public void setName(String n) {
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public void setAddress(String n) {
        this.address = n;
    }
    public String getAddress(){
        return this.address;
    }
    public void setId(String n) {
        this.id = n;
    }
    public String getId(){
        return this.id;
    }

    public void enter(Scanner sc){
        System.out.println("Enter name: ");
        this.name = sc.nextLine();
        System.out.println("Enter address: ");
        this.address = sc.nextLine();
        System.out.println("Enter ID: ");
        this.id = sc.nextLine();
    }

    public String toString(){
        return this.name + " | " + this.address + " | " + this.id;
    }


}
