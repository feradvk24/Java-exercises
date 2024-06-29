public interface ValidatePhone {
    static boolean validatePhone(String phoneNumber) throws WrongPhoneNumber {
        if (phoneNumber.matches("^[0-9]{9}$"))
            throw new WrongPhoneNumber();
        return true;
    }
}
