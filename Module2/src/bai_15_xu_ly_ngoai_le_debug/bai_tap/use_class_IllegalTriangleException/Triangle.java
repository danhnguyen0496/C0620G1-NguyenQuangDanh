package bai_15_xu_ly_ngoai_le_debug.bai_tap.use_class_IllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try {
            inputInfoTriangle();
        } catch (IllegalRightTriangleException e) {
            System.err.println("a, b, c phải là số dương và phải thoải điều kiện (a + b) < c hoặc (a + c) < b hoặc (b + c) < a ");
        }
    }

    static void inputInfoTriangle() throws IllegalRightTriangleException, InputMismatchException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập cạnh a: ");
            double a = scanner.nextDouble();
            System.out.println("Nhập cạnh b: ");
            double b = scanner.nextDouble();
            System.out.println("Nhập cạnh c: ");
            double c = scanner.nextDouble();
            if (a < 0 || b < 0 || c < 0 || (a + b) < c || (a + c) < b || (b + c) < a)
                throw new IllegalRightTriangleException("a, b, c phải là số dương và phải thoải điều kiện (a + b) < c hoặc (a + c) < b hoặc (b + c) < a ");
        } catch (InputMismatchException e) {
            System.err.println("a, b, c nhập vào phải là một số ");
        }
    }
}