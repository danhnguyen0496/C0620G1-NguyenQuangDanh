package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

public class TestAddElementArray {


    public static int[] insertToArray(int[] arr, int value, int index) {
        for (int i = arr.length - 1; i >= index; i--) {
            arr[i] = arr[i - 1];
            if (i == index) arr[i] = value;
        }
        return arr;
    }
}