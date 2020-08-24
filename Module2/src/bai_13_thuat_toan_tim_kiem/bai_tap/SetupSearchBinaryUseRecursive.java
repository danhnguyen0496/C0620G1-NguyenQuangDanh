package bai_13_thuat_toan_tim_kiem.bai_tap;

public class SetupSearchBinaryUseRecursive {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 4, 2, 7, 1, 9, 5, 6, 7, 8, 9};
        System.out.println(searchBinary(arr, 8, 0, 14));

    }

    public static int searchBinary(int[] array, int key, int low, int high) {
        if (low <= high) {
            high = array.length - 1;
            int mid = (low + high) / 2;
            if (key == array[mid]) return mid;
            else if (key > array[mid]) return searchBinary(array, key, mid + 1, high);
            else {
                return searchBinary(array, key, low, mid - 1);
            }
        }
        return -1;
    }
}
