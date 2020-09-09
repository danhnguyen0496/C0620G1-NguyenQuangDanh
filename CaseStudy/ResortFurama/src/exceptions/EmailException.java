package exceptions;

public class EmailException extends Exception {
    public EmailException() {
        super("Email must be in the correct format abc@abc.abc");
    }
}
