package exceptions;

public class BirthdayException extends Exception {
    public BirthdayException() {
        super("The year of birth must be > 1900 and 18 years less than the current year, in the correct format dd / mm / yyyy");
    }
}
