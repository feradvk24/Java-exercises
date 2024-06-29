public class Product2 implements GetProductsTo, DeliveryAPI{
    private String type;
    private double price;
    private int idOfProvider;
    private int number;

    public Product2(String t, double pr, int id, int num) {
        this.type = t;
        this.price = pr;
        this.idOfProvider = id;
        this.number = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getNumber(int idOfProvider) {
        return this.number;
    }

    @Override
    public String getType(int idOfProvider) {
        return null;
    }

    public int getIdOfProvider() {
        return idOfProvider;
    }

    public void setIdOfProvider(int idOfProvider) {
        this.idOfProvider = idOfProvider;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
