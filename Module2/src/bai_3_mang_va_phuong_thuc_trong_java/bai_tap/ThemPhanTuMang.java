package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] array;

        do {
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        } while (n <= 0);

        array = new int[n];
        System.out.println("Input element: ");
        for (int i = 0; i < array.length - 3; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.print("Insert element: ");
        int addElement = scanner.nextInt();
        System.out.print("Index insert element: ");
        int index = scanner.nextInt();

        for (int i =array.length-1; i >= index; i--) {
            if(i == index){
                array[i] = addElement;
            }
            else {
                array[i]= array[i-1];
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
