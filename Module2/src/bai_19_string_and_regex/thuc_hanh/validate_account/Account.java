package bai_19_string_and_regex.thuc_hanh.validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    public static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public Account() {
    }

    public boolean validates(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher  matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
