package commons;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validates {
    private static Pattern pattern;
    private static Matcher matcher;
    private static Scanner scanner = new Scanner(System.in);


    // id
    public static String ID_SERVICES = "SV(VL|HO|RO)-\\d{4}";

    public static boolean isIdServices(String id) {
        boolean isId = Pattern.matches(ID_SERVICES, id);
        if (isId) {
            return true;
        } else {
            System.out.println("Input is not correct in the required format (" + ID_SERVICES + "), enter again: ");
            return false;
        }
    }


    // name
    public static String NAME_SERVICES = "^[A-Z][^A-Z]+([A-Z][^A-Z]+)*$";

    public static boolean isServices(String name) {
        boolean isName = Pattern.matches(NAME_SERVICES, name);
        if (isName) {
            return true;
        } else {
            System.out.println("Input is not correct in the required format (" + NAME_SERVICES + "), enter again: ");
            return false;
        }
    }


    // dien tich su dung va dien tich ho boi
    public static boolean isArea(double number, int value) {
        if (number > value) {
            return true;
        } else {
            System.out.println("The area is not correct (> 30m^2), enter again: ");
            return false;
        }
    }


    // chi phi thue
    public static boolean isRentCost(double number) {
        if (number > 0) {
            return true;
        } else {
            System.out.println("The area is not correct (>0), enter again: ");
            return false;
        }
    }

    // so luong nguoi toi da
    public static boolean isMaxNumberPeople(int number, int min, int max) {
        if (number > min && number < max) {
            return true;
        } else {
            System.out.println("The area is not correct (0 < number people < 20), enter again: ");
            return false;
        }
    }

    // so tang
    public static boolean isNumberFloor(int number) {
        if (number > 0) {
            return true;
        } else {
            System.out.println("The area is not correct (>0), enter again: ");
            return false;
        }
    }

    // dich vu di kem
    public static String ACCOMPANY_SERVICES = "^massage|karaoke|food|drink|car&";

    public static boolean isAccompanyServices(String accompany) {
        boolean isAccompanyServices = Pattern.matches(ACCOMPANY_SERVICES, accompany);
        if (isAccompanyServices) {
            return true;
        } else {
            System.out.println("Input is not correct in the required format (" + ACCOMPANY_SERVICES + "), enter again: ");
            return false;
        }
    }

    // kiem tra ten khach hang
    public static String nameException() {
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

}
