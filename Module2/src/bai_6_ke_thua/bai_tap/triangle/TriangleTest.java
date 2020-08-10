package bai_6_ke_thua.bai_tap.triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.println("Enter the side of Triangle: ");

        System.out.print(" + Enter x: ");
        triangle.setSide1(scanner.nextDouble());

        System.out.print(" + Enter y: ");
        triangle.setSide2(scanner.nextDouble());

        System.out.print(" + Enter z: ");
        triangle.setSide3(scanner.nextDouble());

        System.out.print(" + Enter color: ");

        scanner.nextLine();
        triangle.setColor(scanner.nextLine());

        System.out.println(triangle.toString());
    }
}
