import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("Str1");
        strs.add("Strs222");
        strs.add("Strs999999");
        strs.add("Strs1999191919191");

        Search maximum = () -> {
            String l = strs.get(0);
            for (String i: strs) {
                if (i.length() > l.length()) l = i;
            }
            return l;
        };

        Search minimum = () -> {
            String l = strs.get(0);
            for (String i : strs) {
                if (i.length() < l.length()) l = i;
            }
            return l;
        };



        System.out.println("Max: " + maximum.search());
        System.out.println("Min: " + minimum.search());
    }
}

