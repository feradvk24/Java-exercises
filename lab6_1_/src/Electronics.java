public class Electronics extends Product {
    private String manufacturer;
    private String model;
    public Electronics(String iNum, double pr, int q, Provider prov, String man, String mod){
        super(iNum, pr, q, prov);
        this.manufacturer = man;
        this.model = mod;
    }
    @Override
    double getPromotionalPrice() {
        return getPrice()*0.9;
    }

    @Override
    boolean sellProducts(int piece) {
        try {
            if ((getQuantity() -  piece) <= 0) {
                throw new NoMoreProductsException();
            }
        } catch (NoMoreProductsException exc) {
            System.out.println(exc.getMessage());
        }
        setQuantity(getQuantity() - piece);
        return true;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

