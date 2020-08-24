package bai_14_thuat_toan_sap_xep.thuc_hanh.setup_select_sorting_algorithm;

public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        System.out.println("List be sorted:");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }

    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            // Tim min trong chuoi ben phai
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // Hoan doi vi tri min trong chuoi ben phai va min
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
