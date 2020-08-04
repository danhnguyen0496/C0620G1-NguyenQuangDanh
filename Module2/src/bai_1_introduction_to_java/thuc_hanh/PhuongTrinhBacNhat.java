package bai_1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

// Phương trình bậc nhất ax + b = 0

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number a: ");
        a = scanner.nextDouble();
        System.out.print("Enter the number b: ");
        b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.print("Phương trình vô số nghiệm");
            } else {
                System.out.print("Phương trình vô nghiệm");
            }
        } else {
            c = -b / a;
            System.out.printf("Nghiệm của phương trình là c = %.2f", c);
        }
    }
}
