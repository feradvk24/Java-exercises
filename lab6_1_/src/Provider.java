public class Provider {
    private String name;
    private String number;

    public Provider(String n, String num) throws WrongPhoneNumberException{
        try {
            this.name = n;
            if (ValidatePhone.validatePhoneNumber(num) == false) throw new WrongPhoneNumberException();
            this.number = num;
        } catch  (WrongPhoneNumberException exc) {
            System.out.println(exc.getMessage());
        }

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}

