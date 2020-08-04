package bai_1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        final float VND = 23000;
        float change;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of USD to change: ");
        float USD = scanner.nextFloat();
        change = USD * VND;
        System.out.printf("The amount of %.2f USD to change %.2f VND", USD, change);
    }
}
