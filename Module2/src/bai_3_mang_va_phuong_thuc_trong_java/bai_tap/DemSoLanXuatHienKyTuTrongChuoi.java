package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.println("Enter the char: ");
        str = scanner.nextLine();
        int count = 0;
        char kyTu;
        for (int i = 0; i < str.length(); i++) {
            kyTu = str.charAt(i);
            count++;
            System.out.print(kyTu + "\t");
        }
        System.out.println("\nTotal char in string: " + count);

    }
}
