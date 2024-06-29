import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Voter> voters = new ArrayList<>();
        voters.add(new Voter("Ivan","Sofia","Dunav", "10"));
        voters.add(new Voter("Iordan","Sofia","Dunav", "20"));
        voters.add(new Voter("Ivan","Gotse Delchev","Dunav", "30"));
        voters.add(new Voter("Stefan","Pleven","Ivan Vazov", "20"));
        voters.add(new Voter("Ivan","Sofia","Dunav","200"));
        voters.add(new Voter("Ivan","Pleven","Ivan Vazov", "100"));

        voters = voters.stream().filter(v -> v.getCity() != "Sofia").collect(Collectors.toList());
        voters = voters.stream().sorted(Comparator.comparing(Voter::getStreet).thenComparing(Voter::getAddress)).collect(Collectors.toList());
        for (Voter a : voters) {
            System.out.printf("%s | %s | %s | %s\n", a.getName(), a.getCity(), a.getStreet(), a.getAddress());
        }

    }
}

