import models.Villa;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

        Villa villa = new Villa();
        Scanner scanner = new Scanner(System.in);
        boolean isMaxAmountPeople;
        do {
            final String AMOUNT_VILLA = "^([1-9]|([1][0-9]))$";
            String maxAmountPeople;
//            try {
                System.out.print("Enter the MaxAmountPeople: ");
                maxAmountPeople = scanner.nextLine();
                isMaxAmountPeople = Pattern.matches(AMOUNT_VILLA, maxAmountPeople);
                if (isMaxAmountPeople) {
                    villa.setMaxAmountPeople(Integer.parseInt(maxAmountPeople));
                } else {
                    System.out.print("Input the information is not right, input again" + "\n");
                }
//            } catch (InputMismatchException e) {
//                System.out.print("Enter not right, enter again" + "\n");
//                isMaxAmountPeople = false;
//            }
        } while (!isMaxAmountPeople);
    }
}
