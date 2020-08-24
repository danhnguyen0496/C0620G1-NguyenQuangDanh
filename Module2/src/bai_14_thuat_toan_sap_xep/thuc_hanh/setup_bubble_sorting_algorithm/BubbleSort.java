package bai_14_thuat_toan_sap_xep.thuc_hanh.setup_bubble_sorting_algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public static void bubbleSort(int[] list) {
        for (int i = 1; i < list.length ; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j + 1] < list[j]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
}
