package common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateName {

    public static boolean isValidName(String name) {

        Pattern pattern = Pattern.compile("^[a-zA-Z]+(([a-zA-Z ])?[a-zA-Z]*)*$");
        Matcher matcher = pattern.matcher(name);

        return matcher.matches();
    }

//    public static void main(String[] args) {
//        System.out.println(ValidateName.isValidName("tien"));
//    }
}
