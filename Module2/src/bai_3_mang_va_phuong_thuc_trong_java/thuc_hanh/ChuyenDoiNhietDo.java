package bai_3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Celsius To Fahrenheit ");
            System.out.println("2. Fahrenheit To Celsius ");
            System.out.println("3. Exit ");
            System.out.print("Enter the choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius To Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Enter the Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit To Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Invalid input");
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit;
        fahrenheit = (5.0 / 9) * (celsius + 32);
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius;
        celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
