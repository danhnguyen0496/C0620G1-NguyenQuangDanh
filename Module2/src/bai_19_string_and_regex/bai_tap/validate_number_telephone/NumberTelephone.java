package bai_19_string_and_regex.bai_tap.validate_number_telephone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberTelephone {
    public static final String NUMBER_TELEPHONE = "^\\([0-9]{2}\\)-\\(([0][0-9]{9})\\)$";

    public NumberTelephone() {
    }

    public boolean validate (String regex){
        Pattern pattern = Pattern.compile(NUMBER_TELEPHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        NumberTelephone numberTelephone = new NumberTelephone();
        String[] string1 = new String[]{"(84)-(0978489648)"};
        String[] string2 = new String[]{"(a8)-(22222222)"};

        for (String s : string1){
            boolean isRight = numberTelephone.validate(s);
            System.out.println("Number right: " + s + " : " + isRight);
        }
        for (String s : string2){
            boolean isRight = numberTelephone.validate(s);
            System.out.println("Number right: " + s + " : " + isRight);
        }
    }
}
