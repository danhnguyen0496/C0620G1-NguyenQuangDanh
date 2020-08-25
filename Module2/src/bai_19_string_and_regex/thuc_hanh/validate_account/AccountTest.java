package bai_19_string_and_regex.thuc_hanh.validate_account;

public class AccountTest {
    private static Account account;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        account = new Account();
        for (String account1 : validAccount) {
            boolean isValid = account.validates(account1);
            System.out.println("Account is " + account1 +" is valid: "+ isValid);
        }
        for (String account2 : invalidAccount) {
            boolean isValid = account.validates(account2);
            System.out.println("Account is " + account2 +" is valid: "+ isValid);
        }
    }
}
