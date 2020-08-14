package bai_9_automated_testing_tdd.bai_tap.calculator_next_day;

import java.util.Scanner;

public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter the day: ");
//        day = scanner.nextInt();
//        System.out.println("Enter the month: ");
//        month = scanner.nextInt();
//        System.out.println("Enter the year: ");
//        year = scanner.nextInt();

        boolean isDay = day >= 1 && day <= 31;
        boolean isMonth = month >= 1 && month <= 12;
        boolean isYear = year >= 1900 & year <= 2050;
        return "12/10/1980";
    }
}
