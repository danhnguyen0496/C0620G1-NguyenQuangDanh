package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TestAddElementArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 3, 5, 7, 9};
        System.out.print("mang cu la: ");
        System.out.println(Arrays.toString(array));
        System.out.print("gia tri phan tu muon them: ");
        int element = input.nextInt();
        System.out.print("vi tri muon them: ");
        int index = input.nextInt();
        System.out.print("Mang moi la: ");
        System.out.println(Arrays.toString(themPhanTu(array, index, element)));
    }

    private static int[] themPhanTu(int[] arr, int index, int val) {
        int[] arrayNew = new int[arr.length + 1];
        for (int i = 0; i <= arr.length; i++) {
            arrayNew[i] = (i < index ? arr[i] : (i == index ? val : arr[i - 1]));
        }
        return arrayNew;
    }
}

   /* public static int[] insertToArray(int[] arr, int value, int index) {
        for (int i = arr.length - 1; i >= index; i--) {
            arr[i] = arr[i - 1];
            if (i == index) arr[i] = value;
        }
        return arr;
    }*/
