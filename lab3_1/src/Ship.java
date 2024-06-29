public class Ship extends Vehicle implements isSeaVessel {
    float deadWeight;

    Ship() {
        super();
        this.deadWeight = 0;
    }

    @Override
    public double checkPromo() {
        return this.getPrice() * 0.997;
    }

    Ship(float msp, String m, double pr, float i) {
        super(msp, m, pr);
        this.deadWeight = i;
    }

    @Override
    public void enterSea() {
        System.out.println("The ship is a sea vehicle");
    }

}

