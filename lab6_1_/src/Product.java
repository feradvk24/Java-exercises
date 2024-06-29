public abstract class Product {
    private String inventoryNumber;
    private double price;
    private int quantity;
    private Provider provider;

    public Product(String iNum, double pr, int q, Provider prov){
        this.inventoryNumber = iNum;
        this.price = pr;
        this.quantity = q;
        this.provider = prov;
    }

    abstract double getPromotionalPrice();

    abstract boolean sellProducts(int piece) throws NoMoreProductsException;

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}

