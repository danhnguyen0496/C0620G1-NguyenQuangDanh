package bai_19_string_and_regex.bai_tap.validate_name_classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Classes {
    public static final String CLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public Classes() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Classes classes = new Classes();
        String[] validClasses = new String[]{"C0318G"};
        String[] inValidClasses = new String[]{"M0318G", "P0323A"};

        for (String s : validClasses) {
            boolean isValid = classes.validate(s);
            System.out.println("Classes " + s + " : " + isValid);
        }
        for (String s : inValidClasses) {
            boolean isValid = classes.validate(s);
            System.out.println("Classes " + s + " : " + isValid);
        }
    }

}
