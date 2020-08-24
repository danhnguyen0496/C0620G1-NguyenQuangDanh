package bai_15_xu_ly_ngoai_le_debug.thuc_hanh.use_class_numberformatexception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = scanner.nextInt();
        System.out.print("Nhập y: ");
        int y = scanner.nextInt();
        calc(x, y);
    }

    public static void calc(int x, int y) {
        try {
            int tong = x + y;
            System.out.println("Tổng hai số " + x + " và " + y + " là: " + tong);
            int hieu = x - y;
            System.out.println("Hiệu hai số " + x + " và " + y + " là: " + hieu);
            int tich = x * y;
            System.out.println("Tích hai số " + x + " và " + y + " là: " + tich);
            int thuong = x / y;
            System.out.println("Thương hai số " + x + " và " + y + " là: " + thuong);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
