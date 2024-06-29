public class Person {
    private String name;
    private String birth;


    public Person(){
        this.name = "";
        this.birth = "";
    }
    public Person(String n, String b){
        this.name = n;
        this.birth = b;
    }

    public void setName(String n) {
        this.name = n;
    }
    public void setEgn(String n) {
        this.birth = n;
    }

    public String getName(){
        return this.name;
    }
    public String getBirth(){
        return this.birth;
    }
}
