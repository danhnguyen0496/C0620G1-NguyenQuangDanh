package bai_2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SNTDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng số nguyên tố cần in ra: ");
        int number = scanner.nextInt();
        int count = 0;
        boolean check = true;
        while (count <= number) {
            int N = 0;
            if (N < 2) {
                check = false;
            } else if (N >= 2) {
                for (int i = 2; i <= Math.sqrt(N); i++) {
                    if (N % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    count++;
                    System.out.print(N + " ");
                }
            }
        }
    }
}
