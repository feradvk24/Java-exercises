import java.io.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create a Person object with name and birthdate
        Person[] person = new Person[3];
        person[0] = new Person("Ivan", LocalDate.of(1980, 5, 15));
        person[1] = new Person("Stefan", LocalDate.of(1999, 9, 15));
        person[2] = new Person("Iordan", LocalDate.of(2003, 5, 29));

        final String filePath = "person.bin";
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
            out.writeInt(person.length);
            for (int i = 0; i<person.length;i++) {
                out.writeObject(person[i]);
            }
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath));
            int numPersons = in.readInt();
            Person[] de_persons = new Person[numPersons];
            for (int i = 0; i < numPersons; i++) {
                de_persons[i] = (Person) in.readObject();
            }
            in.close();
            for (int i = 0; i< de_persons.length; i++) {
                System.out.println("Deserialized Person: " + de_persons[i]);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

