package common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {


    public static final String REGEX_NAME = "";



    public static boolean isValidName(String name) {

        Pattern pattern = Pattern.compile("^[a-zA-Z]+(([a-zA-Z ])?[a-zA-Z]*)*$");
        Matcher matcher = pattern.matcher(name);

        return matcher.matches();
    }

}
