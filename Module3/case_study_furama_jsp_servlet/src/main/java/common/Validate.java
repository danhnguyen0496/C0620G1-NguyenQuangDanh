package common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    //    KH-XXXX
    public static final String REGEX_CUSTOMER_ID = "^KH-[\\d]{4}$";

    //    DV-XXXX
    public static final String REGEX_SERVICE_ID = "^DV-[\\d]{4}$";

    //    Tên
    public static final String REGEX_NAME = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";

    //    Số điện thoại
    //    090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx
    public static final String REGEX_PHONE = "^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)[\\d]{7}$";

    //    public static final String REGEX_PHONE = "^(090|091|[(]84[)][+]90|[(]84[)][+]91)[\\d]{7}$";

    //    CMND 9 số và 12 số
    public static final String REGEX_ID_CARD = "^([\\d]{9}|[\\d]{12})$";

    //    Email
    //    public static final String REGEX_EMAIL = "^[\\w.]+@[\\w&&[^_]]+([.][\\w&&[^_]]+){1,2}$";
    public static final String REGEX_EMAIL = "^[\\w.]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+){1,2}$";

    //    số dương
    public static final String REGEX_POSITIVE_NUMBER = "^([1-9][\\d]*(\\.[\\d]*)?)|(0\\.[\\d]+)$";

    //    số nguyên dương
    public static final String REGEX_POSITIVE_INTEGER = "^[1-9][\\d]*$";


    public static boolean isValidCustomerID(String id) {
        Pattern pattern = Pattern.compile(REGEX_CUSTOMER_ID);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public static boolean isValidServiceID(String id) {
        Pattern pattern = Pattern.compile(REGEX_SERVICE_ID);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public static boolean isValidPhone(String id) {
        Pattern pattern = Pattern.compile(REGEX_PHONE);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public static boolean isValidIDCard(String id) {
        Pattern pattern = Pattern.compile(REGEX_ID_CARD);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public static boolean isValidEmail(String id) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public static boolean isValidNumber(String id) {
        Pattern pattern = Pattern.compile(REGEX_POSITIVE_NUMBER);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
      public static boolean isValidNumberX(String id) {
        Pattern pattern = Pattern.compile(REGEX_POSITIVE_INTEGER);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
}
