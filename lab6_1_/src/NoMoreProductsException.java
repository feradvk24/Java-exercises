public class NoMoreProductsException extends Exception {
    public String getMessage(){
        return "There aren't that many products left!";
    }
}

