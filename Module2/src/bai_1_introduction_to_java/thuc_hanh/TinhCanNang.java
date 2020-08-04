package bai_1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhCanNang {
    public static void main(String[] args) {
        double BMI;
        double weight;
        double height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input height: ");
        height = scanner.nextDouble();
        System.out.print("Input weight: ");
        weight = scanner.nextDouble();

        BMI = weight / Math.pow(height,2);
        System.out.printf("Body mass index = %.2f\n", BMI);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI < 25) {
            System.out.println("Normal");
        } else if (BMI < 30) {
            System.out.println("Overweight");
        } else if (BMI >= 30) {
            System.out.println("Obese");
        }
    }
}
