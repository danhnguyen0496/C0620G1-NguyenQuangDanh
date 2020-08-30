package commons;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateException {

    public static String nameException() {
        Scanner scanner = new Scanner(System.in);
        String NAME_REGEX = "^[A-Z][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵ]+(\\s[A-Z][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵ]+)*$";

        String name;
        System.out.print("Enter the name: ");
        boolean isName;
        do {
            name = scanner.nextLine();
            isName = Pattern.matches(NAME_REGEX, name);
            if (isName) {
                return name;
            } else {
                System.out.print("Client name must capitalize first letter of each word, enter name again: " + "\n");
            }
        }
        while (true);
    }

    public static String emailException() {
        Scanner scanner = new Scanner(System.in);
        String EMAIL_REGEX = "^[\\w]+\\@[\\w]+\\.[A-Za-z]{2,3}";

        String email;
        System.out.print("Enter the email: ");
        boolean isEmail;
        do {
            email = scanner.nextLine();
            isEmail = Pattern.matches(EMAIL_REGEX, email);
            if (isEmail) {
                return email;
            } else {
                System.out.print("Email must be in the correct format abc@abc.abc, enter again: " + "\n");
            }
        } while (true);
    }

    public static String genderException() {
        Scanner scanner = new Scanner(System.in);
        String GENDER_REGEX = "^(Male|Female|Unknown)$";

        String gender;
        boolean isGender;
        System.out.print("Enter the gender: ");
        do {
            gender = scanner.nextLine();
            Pattern pattern = Pattern.compile(GENDER_REGEX, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(gender);
            isGender = matcher.matches();
            if (isGender) {
                gender = gender.toLowerCase();
                gender = Character.toUpperCase(gender.charAt(0)) + gender.substring(1);
                return gender;
            } else {
                System.out.print("Enter the gender is unidentified, enter again: " + "\n");
            }
        } while (true);
    }

    public static String idCardException() {
        Scanner scanner = new Scanner(System.in);
        String ID_CARD_REGEX = "^\\d{3}\\s\\d{3}\\s\\d{3}$";
        boolean isCard;
        String identifyCardNumber;
        System.out.print("Enter the identify card number: ");
        do {
            identifyCardNumber = scanner.nextLine();
            isCard = Pattern.matches(ID_CARD_REGEX, identifyCardNumber);
            if (isCard) {
                return identifyCardNumber;
            } else {
                System.out.print("Enter identify card number is not format, enter again: " + "\n");
            }
        } while (true);
    }

    public static String birthdayException() {
        Scanner scanner = new Scanner(System.in);
        String BIRTHDAY_REGEX = "^(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\/(0[1-9]|1[0-2])\\/((190[1-9])|(19[1-9][0-9])|20[0-1]{2})$";
        String birthday;
        boolean isBirthday;
        System.out.print("Enter the birthday: ");
        do {
            birthday = scanner.nextLine();
            isBirthday = Pattern.matches(BIRTHDAY_REGEX, birthday);
            if (isBirthday) {
                return birthday;
            } else {
                System.out.print("The year of birth must be more 1900 and 18 years less than the current year," +
                        " must be correct format dd/mm/yyyy, enter again: " + "\n");
            }
        } while (true);
    }

    public static String numberPhoneException() {
        Scanner scanner = new Scanner(System.in);
        String NUMBER_PHONE_REGEX = "^\\d{10,11}$";
        String numberPhone;
        boolean isNumberPhone;
        System.out.print("Enter the number phone: ");
        do {
            numberPhone = scanner.nextLine();
            isNumberPhone = Pattern.matches(NUMBER_PHONE_REGEX, numberPhone);
            if (isNumberPhone) {
                return numberPhone;
            } else {
                System.out.print("Enter number phone is not format, enter again: " + "\n");
            }
        } while (true);
    }
}