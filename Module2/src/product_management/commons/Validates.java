package product_management.commons;

import java.util.regex.Pattern;

public class Validates {

    // code
    public static String CODE_PRODUCT = "SP(\\d){5}";

    public static boolean isCodeProduct(String code) {
        boolean isCode = Pattern.matches(CODE_PRODUCT, code);
        if (isCode) {
            return true;
        } else {
            System.out.println("Input is not correct in the required format (" + CODE_PRODUCT + "), enter again: ");
            return false;
        }
    }


    // name
    public static String VALIDATE_PRODUCT = "^[A-Z]([A-Z]|[^A-Z])+([A-Z]([A-Z]|[^A-Z])+)*$";

    public static boolean isProduct(String properties) {
        boolean isProperties = Pattern.matches(VALIDATE_PRODUCT, properties);
        if (isProperties) {
            return true;
        } else {
            System.out.println("Input is not correct in the required format (" + VALIDATE_PRODUCT + "), enter again: ");
            return false;
        }
    }

    // so duong
    public static String POSITION_NUMBER = "^[1-9](\\d+)?(\\.?)((\\d+)?)$";

    public static boolean isPositiveNumbers(String positiveNumbers) {
        boolean isNumber = Pattern.matches(POSITION_NUMBER, positiveNumbers);
        if (isNumber) {
            return true;
        } else {
            System.out.println("The area is not correct (>0), enter again: ");
            return false;
        }
    }
}
