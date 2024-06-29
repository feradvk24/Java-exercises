public interface ValidatePhone {
    static boolean validatePhoneNumber(String phoneNumber){
        if (phoneNumber.matches("[0-9]{9}")) return true;
        return false;
    }
}
