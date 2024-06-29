abstract public class Stock {
    private double price;
    private String num;

    public Stock(){
        this.price = 0;
        this.num = "";
    }

    public Stock(double p,String n) throws PriceException{
        if (p < 0.0) {
            throw new PriceException();
        }
        this.price = p;
        this.num = n;
    }

    public void setPrice(double p){
        this.price = p;
    }

    public void setNum(String n){
        this.num = n;
    }

    public double getPrice(){
        return this.price;
    }

    public String getNum(){
        return this.num;
    }
    public abstract double checkPromo();

}

