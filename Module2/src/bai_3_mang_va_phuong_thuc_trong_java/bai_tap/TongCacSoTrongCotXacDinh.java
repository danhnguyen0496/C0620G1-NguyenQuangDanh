package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoTrongCotXacDinh {
    public static void main(String[] args) {
        // Khơi tạo, nhập và in mảng 2 chiều

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = scanner.nextInt();
        System.out.print("Enter the column: ");
        int column = scanner.nextInt();
        float[][] array = new float[row][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter the element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextFloat();
            }
        }
        // In ra mảng
        System.out.println("Array: " + Arrays.deepToString(array));
        // In ra tổng cột cần tính
        System.out.println("Total the column:" + totalColumn(array));
    }
    // Nhập vào thứ tự của một cột và tính ra tổng các phần tử của cột đó.

    public static float totalColumn(float[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the column you want to sum: ");
        int selectColumn = scanner.nextInt();
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
//            loop:
            for (int j = 0; j < array[i].length; j++) {
                if (j == selectColumn) {
                    sum += array[i][j];
//                    break loop;
                }
            }
        }
        return sum;
    }
}
