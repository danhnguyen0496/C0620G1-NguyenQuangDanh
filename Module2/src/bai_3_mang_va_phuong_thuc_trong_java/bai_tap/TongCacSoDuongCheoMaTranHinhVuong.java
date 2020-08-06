package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoDuongCheoMaTranHinhVuong {
    public static void main(String[] args) {

        // Nhập và in ra ma trận vuông
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();
        float[][] array = new float[width][width];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter the element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextFloat();
            }
        }
        System.out.println("Array: " + Arrays.deepToString(array));

        System.out.println("Total square diagonal line: " + totalSquareDiagonalLine(array));
    }

    public static float totalSquareDiagonalLine(float[][] myArray) {
        float sum = 0f;
//        int length = myArray.length;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i == j) {
                    sum += myArray[i][j];
                    System.out.println(myArray[i][j]);
                }
            }
        }
//        for (int i = myArray.length - 1; i >= 0; i--) {
//            for (int j = 0; j < myArray[i].length; j++) {
//                if (i == j) {
//                    sum += myArray[i][j];
//                    System.out.println(myArray[i][j]);
//                }
//            }
//        }
        return sum;
    }
}
