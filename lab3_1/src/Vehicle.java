public abstract class Vehicle {
    private float maxSpeed;
    private String model;
    private double price;

    public Vehicle(){
        this.maxSpeed = 0;
        this.model = "";
        this.price = 0;
    }

    public Vehicle(float msp, String m, double pr) {
        this.maxSpeed = msp;
        this.model = m;
        this.price = pr;
    }

    public void setMaxSpeed(float spd) {
        this.maxSpeed = spd;
    }
    public void setModel(String m) {
        this.model = m;
    }
    public void setPrice(double pr) {
        this.price = pr;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }

    public abstract double checkPromo();
}
