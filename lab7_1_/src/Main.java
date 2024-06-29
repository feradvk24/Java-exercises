import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Device dd = Device.createDevice(sc);
        dd.show();

    }
}

