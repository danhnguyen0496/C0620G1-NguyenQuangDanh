package bai_2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("The number is not prime");
        } else if (number >= 2) {
            int i = 2;
            boolean check = true;
            for (i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.printf("The number %d is prime", number);
            } else {
                System.out.printf("The number %d is not prime", number);
            }
        }
    }
}
