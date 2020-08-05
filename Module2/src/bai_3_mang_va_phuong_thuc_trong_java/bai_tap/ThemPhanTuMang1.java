package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuMang1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] array;
        do {
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        } while (n <= 0);
        array = new int[n];
        System.out.println("Input element: ");
        for (int i = 0; i < array.length - 3; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.print("Enter insert element: ");
        int addElement = scanner.nextInt();
        System.out.print("Enter index insert element: ");
        int index = scanner.nextInt();

        int m = array.length;
        if (index <= 1 || index >= m - 1) {
            System.out.print("Value is not insert");
        } else {
            for (int i = m - 1; i >= index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = addElement;
        }

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
