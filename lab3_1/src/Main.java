public class Main {
    public static void main(String[] args) {
        Car no_1 = new Car(200, "Mercedes", 12000, 100);
        no_1.enterLand();
        System.out.println("The car costs" + no_1.checkPromo());

        Hovercraft no_2 = new Hovercraft(250, "Toyota", 75000, 10);
        no_2.enterLand();
        no_2.enterSea();
        System.out.println("The hovercraft costs" + no_2.checkPromo());

        Ship no_3 = new Ship(200, "BMW", 750000, 10000);
        no_2.enterSea();
        System.out.println("The ship costs" + no_3.checkPromo());
    }
}