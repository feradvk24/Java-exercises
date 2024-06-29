public class Book extends Stock{
    private String author;
    private String title;

    public Book(){
        super();
        author = "";
        title = "";
    }

    public Book(double p, String n, String a, String t) throws PriceException{
        super(p,n);
        this.author = a;
        this.title = t;
    }



    @Override
    public double checkPromo() {
        return getPrice()*0.85;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

