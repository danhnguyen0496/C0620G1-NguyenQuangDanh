import commons.Validates;
import controllers.MainController;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        scanner.nextLine();
        String name = Validates.nameException();
    }
}