package bai_2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();
        System.out.print("Enter the weight: ");
        int weight = scanner.nextInt();

        // Hình chữ nhật - hình vuông

        for (int i = 1; i < width; i++) {
            for (int j = 1; j < weight; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Hình tam giác vuông góc trái dưới
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Hình tam giác vuông góc trái trên
        for (int i = 1; i <= width; i++) {
            for (int j = i; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Hình tam giác cân

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= width - i; j++ ){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i -1; k++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}
