package bai_14_thuat_toan_sap_xep.bai_tap.setup_insert_sorting_algorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {15, 12, 11, 8, 2, 9, 4, 5, 6};
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int k;
            int currentElement = list[i];
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }
}
