import java.util.Scanner;

public class BrokenDevice extends Device{
    private String symptoms;
    private int repairDays;

    public BrokenDevice(String br, String mod, double pr, String sym, int rep) {
        super(br, mod, pr);
        this.symptoms = sym;
        this.repairDays = rep;
    }
    @Override
    public void show(){
        System.out.printf("Device --> brand : %s | model : %s | price : %.2f", getBrand(), getModel(), getPrice(), getSymptoms(), getRepairDays());
    }
    public static BrokenDevice createBrokenDevice(Scanner sc){
        System.out.println("Enter brand, model and price, symptoms and repair days of the broken device: ");
        return new BrokenDevice(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()));
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getRepairDays() {
        return repairDays;
    }

    public void setRepairDays(int repairDays) {
        this.repairDays = repairDays;
    }
}

