package bai_3_mang_va_phuong_thuc_trong_java.thuc_hanh;

public class TimGiaTriNhoNhatMangBangPhuongThuc {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.print("Element min of array: " + index);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (min > value) {
                min = value;
            }
        }
        return min;
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (min > array[i]) {
//                min = array[i];
//            }
//        }
//        return min;
    }
}
