public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", "10.10.2020", "123456789", 5,6,3);
        s1.showStudent();
        s1.changeGrade("ppe",6);
        s1.showStudent();
    }
}