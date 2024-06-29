public class elemIsNull extends Exception {
    public String getMessage() {
        return "Can't edit this element because it doesn't have a value!";
    }
}