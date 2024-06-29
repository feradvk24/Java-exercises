import java.util.ArrayList;

public class PresentStore {
    private ArrayList<GetProductsTo> products;
    private ArrayList<DeliveryAPI> devApi;

    public PresentStore(ArrayList<GetProductsTo> prod, ArrayList<DeliveryAPI> dev) {
        this.products = prod;
        this.devApi = dev;
    }

    public ArrayList<GetProductsTo> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<GetProductsTo> products) {
        this.products = products;
    }
    public ArrayList<DeliveryAPI> getDevApi() {
        return devApi;
    }
    public void setDevApi(ArrayList<DeliveryAPI> devApi) {
        this.devApi = devApi;
    }

    public ArrayList<GetProductsTo> lowerPrice(double pr){
        ArrayList<GetProductsTo> withLowerPrice = new ArrayList<>();
        for(GetProductsTo a: getProducts()) {
            if (a.getPrice() < pr) {
                withLowerPrice.add(a);
            }
        }
        return withLowerPrice;
    }

    public ArrayList<DeliveryAPI> productsFromId(int id){
        ArrayList<DeliveryAPI> dev = new ArrayList<>();

        for (DeliveryAPI a: getDevApi()){
            if (a.getIdOfProvider() == id) {
                dev.add(a);
            }
        }
        return dev;
    }

}

