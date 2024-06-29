public class Teacher extends Person {
    private Course course;

    public Teacher(String name, String egn, Course course) {
        super(name, egn);
        this.setCourse(course);
    }

    public void setCourse(Course new_course) {
        this.course = new_course;
    }

    public Course getCourse() {
        return this.course;
    }

    public void showTeacher(){
        System.out.printf("%s | %s ", this.getName(), course.getName());
    }
}
