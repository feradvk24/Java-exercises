public class SickPatient extends Patient{
    private String epicr;
    private String status;
    private int day;

    public SickPatient(){
        super();
        this.epicr = "";
        this.status = "";
        this.day = 0;
    }
    public SickPatient(String n, String a, String i,String ep,String st,int d){
        super(n,a,i);
        this.epicr = ep;
        this.status = st;
        this.day = d;
    }


    public String getEpicr() {
        return this.epicr;
    }
    public String getStatus() {
        return this.status;
    }
    public int getDay() {
        return this.day;
    }

    public String cure(String name, int dosage){
        return this.epicr + "...  Medicine: " + name + "| Dosage taken: " + dosage;
    }
}
