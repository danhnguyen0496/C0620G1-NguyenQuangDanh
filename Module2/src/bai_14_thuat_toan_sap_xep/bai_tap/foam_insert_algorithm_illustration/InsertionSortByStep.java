/*
package bai_14_thuat_toan_sap_xep.bai_tap.foam_insert_algorithm_illustration;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of list: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("List before sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("Program insert sort: ");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int k;
            int currentElement = list[i];
            System.out.println("List after the  " + i + "' sort: ");
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                System.out.println("Move " + list[k + 1] + " to " + list[k]  );
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
        System.out.println("List after sort: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");
        }
        System.out.println();
    }
}
*/
