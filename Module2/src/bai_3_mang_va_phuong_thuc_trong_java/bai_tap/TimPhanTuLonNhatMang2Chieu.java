package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {

        // Nhập vào mảng 2 chiều số thực và in ra màn hình

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int i = scanner.nextInt();
        System.out.print("Enter the column: ");
        int j = scanner.nextInt();

        float[][] matrix = new float[i][j];
        System.out.println("Enter: " + i + " rows and " + j + " columns");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print("Enter the index of element [" + row + "]" + "[" + column + "]: ");
                matrix[row][column] = scanner.nextFloat();
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        int rowPosition = 0;
        int columnPosition = 0;
        float max = matrix[0][0];
        for (int h = 0; h < matrix.length; h++) {
            for (int k = 0; k < matrix[h].length; k++) {
                if (max < matrix[h][k]) {
                    max = matrix[h][k];
                    rowPosition = h;
                    columnPosition = k;
                }
            }
        }
        System.out.println("Max element of array is" + max + " at position [" + rowPosition + "]" + "[" + columnPosition + "]");
    }
}
