package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;

        do {
            System.out.print("Enter the size: ");
            size = scanner.nextInt();
        } while (size <= 0);

        array = new int[size];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Element of array: ");
        for (int value : array) {
            System.out.print(value + " \t");
            //  for (int i = 0; i < array.length; i++)
            //   System.out.print(array[i]);
        }

        System.out.print("\nEnter the value need to check: ");
        int value = scanner.nextInt();
        boolean check = false;
        int i = 0;
        int j = 0;
        int n = array.length;
        for (i = 0; i < n; i++) {                        // for (int item : array) {
            if (array[i] == value) {                     // if (item == value) {
                check = true;
                for (j = i; j < n - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }
        if (!check) {
            System.out.println("Value not find");
        }
        System.out.print("Array after delete: ");
        System.out.println(Arrays.toString(array));
    }
}

