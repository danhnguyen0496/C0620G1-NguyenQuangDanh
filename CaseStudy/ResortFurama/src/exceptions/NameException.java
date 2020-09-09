package exceptions;

public class NameException extends Exception {
    public NameException() {
        super("Client Name must capitalize first letter of each word");
    }
}
