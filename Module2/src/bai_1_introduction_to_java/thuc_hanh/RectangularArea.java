package bai_1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class RectangularArea {
    public static void main(String[] args) {
        float width;
        float weight;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextFloat();
        System.out.print("Enter the weight: ");
        weight = scanner.nextFloat();

        float Area = width * weight;
        System.out.println("Rectangular Area: " + Area);
    }
}
