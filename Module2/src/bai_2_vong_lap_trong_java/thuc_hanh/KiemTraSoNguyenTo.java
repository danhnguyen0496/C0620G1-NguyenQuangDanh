package bai_2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.printf("The number %d is not prime", number);
        } else if (number >= 2) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.printf("The number %d is prime", number);
            } else {
                System.out.printf("The number %d is not prime", number);
            }
        }
    }
}
