public class ValidatePassword {
    static boolean validPassword(String pass) {
        if (pass.matches("^[a-zA-Z]{11,}$")){
            return true;
        }
        return false;
    }
}

