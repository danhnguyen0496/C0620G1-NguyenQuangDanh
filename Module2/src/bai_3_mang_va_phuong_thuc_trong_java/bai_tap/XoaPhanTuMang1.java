package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuMang1 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 3, 5, 6, 0, 0, 0, 0, 0, 0};
        System.out.println("Array before: " + Arrays.toString(a));
        System.out.print("Please input number remove: ");
        int x = new Scanner(System.in).nextInt();
        int pos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                pos = i;
                break;
            }
        }
        for (int i = pos; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        System.out.println("Array after: " + Arrays.toString(a));
    }
}
