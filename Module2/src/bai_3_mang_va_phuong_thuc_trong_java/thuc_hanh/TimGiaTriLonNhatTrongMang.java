package bai_3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter the size:  ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.print("Size does not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Input the money " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        //  System.out.print(Arrays.toString(array));
        System.out.print("Property list array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 0;
        for (int k = 0; k < array.length; k++) {
            if (max < array[k]) {
                max = array[k];
                index = k +1;
            }
        }
        System.out.print("Element max of array is: " + max + " at position " + index);
    }
}
