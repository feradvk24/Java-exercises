public class Laptop extends Device{
    private int RAM;
    private int memory;

    public Laptop(){
        super();
        this.RAM = 0;
        this.memory = 0;
    }
    public Laptop(float v, String p, boolean state, int r, int mem){
        super(v,p,state);
        this.RAM = r;
        this.memory = mem;
    }

    public boolean isBetter(Laptop laptop){
        if (this.RAM > laptop.RAM && this.memory > laptop.memory) {
            return true;
        } else {
            return false;
        }
    }

    public String ToString(){
        return "Laptop info: Volage:" +this.volt + "| Processor: " + this.processor + " | RAM : "  + this.RAM + " | Memory : " +  this.memory + "\n";
    }
}
