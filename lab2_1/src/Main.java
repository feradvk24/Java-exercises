public class Main {
    public static void main(String[] args) {
        Course cc = new Course("Matematika");
        Person one = new Person("Ivan", "1234567890");
        System.out.println(cc.getName());
        System.out.println(one.getName());

        Teacher first = new Teacher(one.getName(),"0101010101", cc);
        first.showTeacher();

    }
}