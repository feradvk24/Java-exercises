import java.util.Scanner;

public class Device {
    private String brand;
    private String model;
    private double price;

    public Device(String br, String mod, double pr){
        this.brand = br;
        this.model = mod;
        this.price = pr;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void show(){
        System.out.printf("Device --> brand : %s | model : %s | price : %.2f", getBrand(), getModel(), getPrice());
    }

    public static Device createDevice(Scanner sc) {
        System.out.println("Enter brand, model and price of the device: ");
        return new Device(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
    }
}

