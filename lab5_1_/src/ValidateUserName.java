public class ValidateUserName {
    static boolean validateUsername(String Uname){
            if (Uname.matches("^[a-z0-9_-]{3,15}$")) {
                return true;
            }
            else return false;
        }
}


