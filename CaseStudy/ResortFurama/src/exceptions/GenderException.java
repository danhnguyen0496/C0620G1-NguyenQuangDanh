package exceptions;

public class GenderException extends Exception {
    public GenderException() {
        super("User must enter Male, Female or Unknow");
    }
}
