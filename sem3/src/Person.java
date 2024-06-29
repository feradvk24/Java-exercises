import java.io.*;
import java.time.LocalDate;
import java.time.Period;

class Person implements Externalizable {
    private String name;
    private LocalDate birth;
    private int age;

    public Person() {
    }

    public Person(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
        recalculateAge();
    }

    void recalculateAge() {
        LocalDate currentDate = LocalDate.now();
        age = Period.between(birth, currentDate).getYears();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(birth);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        birth = (LocalDate) in.readObject();
        age = in.readInt();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", age=" + age +
                '}';
    }
}
