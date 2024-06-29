public class Voter {
    private String name;
    private String city;
    private String street;
    private String address;

    public Voter(){
        this.name = "";
        this.city = "";
        this.street = "";
        this.address = "";
    }
    public Voter(String n, String c, String s, String a){
        this.name = n;
        this.city = c;
        this.street = s;
        this.address = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}