public class User implements ValidatePhone{
    private String username;
    private String password;
    private String number;

    public User(){
        this.username = "" ;
        this.number = "";
        this.password = "";
    }
    public User(String u, String p, String n) throws WrongUserException{
        try {
            this.username = u ;
            ValidatePhone.validatePhone(n);
            if (!(ValidateUserName.validateUsername(u) || ValidatePassword.validPassword(p))) {
                throw new WrongUserException();
            }
            this.password = p;
            this.number = n;
        } catch (WrongPhoneNumber e) {
            System.out.println(e.getMessage());
        } catch (WrongUserException e){
            System.out.println(e.getMessage());
        }

    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}

