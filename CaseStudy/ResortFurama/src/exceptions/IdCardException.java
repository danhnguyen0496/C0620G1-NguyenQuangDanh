package exceptions;

public class IdCardException extends Exception{
    public IdCardException (){
        super("The Id Card must have 9 digits and be in the format XXX XXX XXX");
    }
}
