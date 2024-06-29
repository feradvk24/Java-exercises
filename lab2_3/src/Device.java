public class Device {
    public float volt;
    public String processor;
    public boolean on_off;

    public Device(){
        this.volt = 0;
        this.processor = "";
        this.on_off = false;
    }

    public Device(float v,String p,boolean st){
        this.volt = v;
        this.processor = p;
        this.on_off = st;
    }

    public void turn_on(){
        if (!this.on_off) {
            this.on_off = true;
            System.out.println("Device turned on!\n");
        } else {
            System.out.println("Device already on!\n");
        }
    }
    public void turn_off(){
        if (this.on_off) {
            this.on_off = false;
            System.out.println("Device turned off!\n");
        } else {
            System.out.println("Device already off!\n");
        }
    }

}
