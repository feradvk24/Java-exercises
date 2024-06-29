public class Book extends Product {
    private String author;
    private String title;

    public Book(String iNum, double pr, int q, Provider prov, String a, String t){
        super(iNum,pr,q,prov);
        this.author = a;
        this.title = t;
    }
    @Override
    double getPromotionalPrice() {
        return getPrice()*0.5;
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
}

