public class Student extends Person{
    private String fNum;
    private int pik;
    private int te;
    private int ppe;

    public Student(){
        super();
        this.fNum = "";
        this.pik = 0;
        this.te = 0;
        this.ppe = 0;
    }

    public Student(String name, String birth, String n, int grade_1, int grade_2, int grade_3){
        super(name,birth);
        this.fNum = n;
        this.pik = grade_1;
        this.te = grade_2;
        this.ppe = grade_3;
    }

    public void setfNum(String n) {
        this.fNum = n;
    }
    public String getfNum(){
        return fNum;
    }
    public void setPik(int n) {
        this.pik = n;
    }
    public int getPik(){
        return pik;
    }
    public void setTe(int n) {
        this.te = n;
    }
    public int getTe(){
        return te;
    }
    public void setPpe(int n) {
        this.ppe = n;
    }
    public int getPpe(){
        return ppe;
    }


    public void changeGrade(String c_name, int new_grade){
        int old_grade = 0;
        switch (c_name){
            case "pik":
                old_grade = this.pik;
                this.pik = new_grade;
                break;
            case "te":
                old_grade = this.te;
                this.te = new_grade;
                break;
            case "ppe":
                old_grade = this.ppe;
                this.ppe = new_grade;
                break;
            default:
                System.out.println("Wrong info!\n");
        }
        System.out.printf("%s's %s grade changed: %d --> %d\n",getName(),c_name,old_grade,new_grade);
    }

    public void showStudent(){
        System.out.printf("Student %s\nfNum: %s\nPIK: %d\nTE: %d\nPPE: %d\n",getName(),this.fNum,this.pik,this.te,this.ppe);
    }
}
