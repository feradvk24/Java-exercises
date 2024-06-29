public class Main {
    public static void main(String[] args) {
        Laptop lenovo = new Laptop(12, "Intel Core i5", true, 16, 512);
        Laptop asus = new Laptop(12, "Intel Core i5", true, 8, 256);
        lenovo.turn_on();
        lenovo.turn_off();
        System.out.println(lenovo.isBetter(asus));
        System.out.println(lenovo.toString());

    }
}