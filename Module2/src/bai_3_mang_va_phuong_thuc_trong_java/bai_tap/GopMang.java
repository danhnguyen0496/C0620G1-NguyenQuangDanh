package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mảng 1
        int n;
        int[] arr1;
        do {
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        } while (n <= 0);
        arr1 = new int[n];

        System.out.println("Input element: ");
        creatArray(scanner, arr1);

        // Mảng 2
        int m;
        int[] arr2;
        do {
            System.out.print("Enter m: ");
            m = scanner.nextInt();
        } while (m <= 0);
        arr2 = new int[m];

        System.out.println("Input element:  ");
        creatArray(scanner, arr2);

        // Mảng 3
        int size = m + n;
        int[] arr3 = new int[size];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[k] = arr1[i];
            k++;
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[k] = arr2[j];
            k++;
        }
        System.out.print("Result merger 2 array: ");
        System.out.println(Arrays.toString(arr3));
    }


    private static void creatArray(Scanner scanner, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array: ");
        for (int value : arr) {
            System.out.print(value + "\t");
        }
    }
}
