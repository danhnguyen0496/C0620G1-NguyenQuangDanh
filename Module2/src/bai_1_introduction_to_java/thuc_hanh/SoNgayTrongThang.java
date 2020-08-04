package bai_1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the month you want to calculator total day: ");
        int month = scanner.nextInt();
        String dayInMonth;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dayInMonth = "31";
                break;
            case 4: case 6: case 9: case 11:
                dayInMonth = "30";
                break;
            case 2:
                dayInMonth = "28 or 29";
                break;
            default:
                dayInMonth = "";
        }
        if (dayInMonth != "") {
            System.out.printf("The month %d has %s days", month, dayInMonth);
        } else {
            System.out.print("Invalid input");
        }
    }
}

