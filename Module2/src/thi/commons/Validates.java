package thi.commons;

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


    public static String NUMBER_PHONE = "\\d{10,11}";

    public static boolean isNumbers(String positiveNumbers) {
        boolean isNumber = Pattern.matches(NUMBER_PHONE, positiveNumbers);
        if (isNumber) {
            return true;
        } else {
            System.out.println("The number is not correct (\\d{10,11}), enter again: ");
            return false;
        }
    }

    public static String EMAIL = "^[\\w]+\\@[\\w]+\\.[A-Za-z]{2,3}";

    public static boolean isEmail(String email) {
        boolean isEmails = Pattern.matches(EMAIL, email);
        if (isEmails) {
            return true;
        } else {
            System.out.println("The email is not correct (^[\\\\w]+\\\\@[\\\\w]+\\\\.[A-Za-z]{2,3}), enter again: ");
            return false;
        }
    }

}
