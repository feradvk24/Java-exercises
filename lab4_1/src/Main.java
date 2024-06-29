
public class Main {
    public static void main(String[] args) throws PriceException, PowerException {
        TV bbb = new TV(10, "1111", "LG", "Galaxy 7", 22);
        try {
            TV LG = new TV(10, "1111", "LG", "Galaxy 7", 22);
            Book pod_igoto = new Book(19, "112", "Ivan Vazov", "Pod Igoto");
            Book wrong_book = new Book(-100.3, "112", "Ivan Vazov", "Pod Igoto");
            TV wrongTV = new TV(10, "1111", "LG", "Galaxy 7", -10.4);
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        } catch (PowerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(bbb.checkPromo());
        }
    }
}

