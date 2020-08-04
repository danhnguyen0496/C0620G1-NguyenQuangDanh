package bai_2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double money = input.nextDouble();
        System.out.println("Enter interest rate: ");
        double interestRate = input.nextDouble();
        System.out.println("Enter number of months: ");
        int month = input.nextInt();
        double totalInterest = 1.0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total interest is received " + totalInterest);
    }
}
