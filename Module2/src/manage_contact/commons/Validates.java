package manage_contact.commons;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validates {
    // name
    public static String VALIDATE = "^[A-Z]([A-Z]|[^A-Z])+([A-Z]([A-Z]|[^A-Z])+)*$";

    public static boolean isContact(String properties) {
        boolean isProperties = Pattern.matches(VALIDATE, properties);
        if (isProperties) {
            return true;
        } else {
            System.out.println("Input is not correct in the required format (" + VALIDATE + "), enter again: ");
            return false;
        }
    }

    public static String GENDER = "^(Male|Female|Unknown)$";
    public static boolean isGender(String properties) {
        boolean isProperties = Pattern.matches(GENDER, properties);
        if (isProperties) {
            return true;
        } else {
            System.out.println("Input is not correct in the required format (" + GENDER + "), enter again: ");
            return false;
        }
    }


    public static String POSITION_NUMBER = "\\d{10,11}";

    public static boolean isNumbers(String positiveNumbers) {
        boolean isNumber = Pattern.matches(POSITION_NUMBER, positiveNumbers);
        if (isNumber) {
            return true;
        } else {
            System.out.println("The number is not correct (\\d{10,11}), enter again: ");
            return false;
        }
    }
}
