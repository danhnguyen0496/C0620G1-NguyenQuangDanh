package bai_2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SNTDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng số nguyên tố cần in ra: ");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count <= number) {
            if (isPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
    public static boolean isPrime(int n) {
        boolean check = true;
        if (n < 2) {
            return false;
        } else if (n >= 2) {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}


