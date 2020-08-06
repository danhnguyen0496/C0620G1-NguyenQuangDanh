package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimGTNNMang {
    public static void main(String[] args) {
        // Khởi tạo, nhập và in ra mảng
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter the size: ");
        size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Element min of array: " + minArray(array));
    }

    public static int minArray(int[] myArray) {
        int min = myArray[0];
        for (int element : myArray) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
