package bai_3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Nhập mảng phần tử vào mảng 2 chiều

        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[2][4];
        System.out.println("Enter " + matrix.length + " rows and " + matrix[1].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        System.out.print(Arrays.deepToString(matrix));

        // Tổng tất cả phần tử trong mảng

        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        System.out.print("Tổng tất cả phần tử trong mảng: " + total);


        // Tổng từng cột
        int totalColumn = 0;
        for (int column = 0; column < matrix[0].length; column++) {
            for (int row = 0; row < matrix.length; row++)
                totalColumn += matrix[row][column];
            System.out.println("Sum for column " + column + " is " + totalColumn);
        }
        System.out.print("Tổng cột: " + totalColumn);

        // Tìm ra dòng có tổng các phần tử là lớn nhất

        int maxRow = 0;
        int indexOfMaxRow = 0;
        // Get sum of the first row in maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++)
                totalOfThisRow += matrix[row][column];
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);

        // Xáo trộn mảng
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[i].length);

                // Swap matrix[i][j] with matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }


    }
}
