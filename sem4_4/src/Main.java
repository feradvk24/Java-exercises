import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lettersList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> numberList = Arrays.asList("123", "33", "444", "244", "234324");

        List<String> specialList = Arrays.asList(".//??", "\\,.,//", "!@#$", "++++____", "))))(((");

        Check checkLetters = (l) -> {
            for (String a: l) {
                if (!a.matches("[a-zA-Z]+")) {
                    System.out.println("The list doesnt consist of only lowercase letters!");
                    return;
                }
            }
            System.out.println("The list consists of only lowercase letters!");
        };
        Check checkDigits = (l) -> {
            for (String a: l) {
                if (!a.matches("[0-9]+")) {
                    System.out.println("The list doesnt consist of only digits!");
                    return;
                }
            }
            System.out.println("The list consists of only digits!");
        };
        Check checkSpecial = (l) -> {
            for (String a: l) {
                if (!a.matches("[^a-zA-Z0-9]+")) {
                    System.out.println("The list doesnt consist of only special characters!");
                    return;
                }
            }
            System.out.println("The list consists of only special characters!");
        };

        checkLetters.check(lettersList);
        checkDigits.check(numberList);
        checkSpecial.check(specialList);
        checkSpecial.check(numberList);
        checkDigits.check(specialList);
    }

}

