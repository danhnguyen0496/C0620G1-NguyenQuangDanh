package bai_14_thuat_toan_sap_xep.bai_tap.foam_insert_algorithm_illustration;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(10);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);
        insertionSort(arr);
    }

    public static void insertionSort(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            int selectedNum = arr.get(i);
            System.out.println("key " + selectedNum);
            int currentMaxIndex = i - 1;
            while (currentMaxIndex > -1) {
                int comparedNum = arr.get(currentMaxIndex);
                if (selectedNum < comparedNum) {
                    System.out.println(selectedNum + " < " + comparedNum);
                    currentMaxIndex--;
                } else {
                    System.out.println(selectedNum + " > " + comparedNum);
                    System.out.println("Move " + selectedNum + " to position after " + comparedNum);
                    break;
                }
            }
            if (currentMaxIndex == -1) System.out.println("Move " + selectedNum + " to first position");
            arr.add(currentMaxIndex + 1, selectedNum);
            arr.remove(i + 1);
            System.out.println(arr);
        }
    }
}
