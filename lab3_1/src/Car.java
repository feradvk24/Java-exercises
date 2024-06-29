public class Car extends Vehicle implements isLandVessel {
    float kW;

    Car() {
        super();
        this.kW = 0;
    }

    @Override
    public double checkPromo() {
        return this.getPrice() * 0.8;
    }

    Car(float msp, String m, double pr, float i) {
        super(msp, m, pr);
        this.kW = i;
    }

    @Override
    public void enterLand() {
        System.out.println("The car is a land vehicle");
    }

}
