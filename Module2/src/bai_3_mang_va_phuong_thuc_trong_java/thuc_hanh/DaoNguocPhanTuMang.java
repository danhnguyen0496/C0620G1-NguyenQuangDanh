package bai_3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        // Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.print("Size does not exceed 20");
            }
        } while (size > 20);
        // Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        // In ra mảng đã nhập
//        System.out.print(Arrays.toString(array));   // Lệnh in mảng ra trực tiếp

        System.out.printf("%-20s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Đảo ngược thứ tự các phần tử trong mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%-20s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
