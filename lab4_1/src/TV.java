public class TV extends Stock implements ElectricalAppliance{
    private String maker;
    private String model;
    private double power;

    public TV(){
        super();
        this.maker = "";
        this.model = "";
        this.power = 0;
    }

    public TV(double p, String n, String m, String mod, double pow) throws PowerException,PriceException{
        super(p, n);
        this.maker = m;
        this.model = mod;
        if (pow < 0.0) {
            throw new PowerException();
        }
        this.power = pow;
    }

    @Override
    public double checkPromo() {
        return getPrice()*0.91;
    }
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public double electricBill() {
        return getPower()*0.5;
    }
}

