import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SickPatient no_1 = new SickPatient("Ivan", "Sofia", "0101010101","Coronavirus", "Sick", 10);
        System.out.println(no_1);
        System.out.println(no_1.cure("Antibiotic", 500));
        no_1.enter(sc);
        System.out.println(no_1);
    }
}