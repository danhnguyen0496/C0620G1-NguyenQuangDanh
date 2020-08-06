package bai_3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter the total number of student points: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the element of array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(array));

        int count = 0;
        System.out.print("List of mark: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }
}
