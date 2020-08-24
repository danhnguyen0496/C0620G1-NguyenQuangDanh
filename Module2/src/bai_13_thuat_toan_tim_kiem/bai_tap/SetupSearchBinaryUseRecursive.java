package bai_13_thuat_toan_tim_kiem.bai_tap;

import java.util.Scanner;

public class SetupSearchBinaryUseRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key want to search: ");
        int key = scanner.nextInt();
        int high = arr.length - 1;
        System.out.println(searchBinary(arr, key, 0, high));
    }

    public static int searchBinary(int[] array, int key, int low, int high) {
        if (low <= high) {
            int mid =  (low + high) / 2;
            if (key == array[mid]) return mid;
            else if (key > array[mid]) return searchBinary(array, key, mid + 1, high);
            else if (key < array[mid]){
                return searchBinary(array, key, low, mid - 1);
            }
        }
        return -1;
    }
}
