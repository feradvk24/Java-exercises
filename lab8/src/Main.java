import javax.swing.event.DocumentEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product1 first = new Product1("toy", 15.00, 111, 12345);
        Product2 second = new Product2("doll", 20.00, 112, 123456);
        Product1 third = new Product1("gun", 40.00, 113, 12345);
        Product3 fourth = new Product3("ball", 5.00, 114, 123456);

        ArrayList<GetProductsTo> arr = new ArrayList<>(Arrays.asList(first,second,third,fourth));
        ArrayList<DeliveryAPI> arrAPI = new ArrayList<>(Arrays.asList(first,second,third,fourth));

        PresentStore pr = new PresentStore(arr, arrAPI);
        ArrayList<GetProductsTo> as = pr.lowerPrice(30);
        for (GetProductsTo a:
             as) {
            System.out.println(a.getPrice());
        }
    }
}
