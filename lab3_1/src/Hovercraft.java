public class Hovercraft extends Vehicle implements isLandVessel, isSeaVessel {
    int passengers;

    Hovercraft() {
        super();
        this.passengers = 0;
    }

    @Override
    public double checkPromo() {
        return this.getPrice() * 0.97;
    }

    Hovercraft(float msp, String m, double pr, int i) {
        super(msp, m, pr);
        this.passengers = i;
    }

    @Override
    public void enterLand() {
        System.out.println("The hovercraft is a land vehicle");
    }

    @Override
    public void enterSea() {
        System.out.println("The hovercraft is a sea vehicle");
    }

}