import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> lowercaseList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> uppercaseList = Arrays.asList("ALPHA", "BRAVO", "CHARLIE", "DELTA", "ECHO");

        List<String> mixedCaseList = Arrays.asList("orange", "kiwi", "LIMA", "lemon", "MANGO");

        Check checkCase = (pat, s) -> {
            for (String a : s) {
                if (!a.matches(pat)) {
                    return false;
                }
            }
            return true;
        };


        if (checkCase.check("[a-z]+", lowercaseList)) {
            System.out.println("lowercase consists of only lowercase letters!");
        }
        if (checkCase.check("[a-z]+", uppercaseList)) {
            System.out.println("List consists of only lowercase letters!");
        } else {
            System.out.println("uppercaseList doesnt consist of only lowercase letters");
        }
        if (checkCase.check("[a-zA-Z]+", mixedCaseList)) {
            System.out.println("mixedCaseList consists of mixed letters!");

        }
    }
}

