package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return -this.b / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b + Math.sqrt((this.b * this.b) - 4 * this.a * this.c) / (2 * this.a));
    }

    public double getRoot3() {
        return (-this.b - Math.sqrt((this.b * this.b) - 4 * this.a * this.c) / (2 * this.a));
    }
}

class myQuadraticEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        //  ax*2 + bx + c = 0
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        double r1 = quadraticEquation.getRoot1();
        double r2 = quadraticEquation.getRoot2();
        double r3 = quadraticEquation.getRoot3();
        if (a == 0) {
            System.out.println("The equation has solution: " +  (- quadraticEquation.getC()) / quadraticEquation.getB());
        } else if (a != 0) {
            if (delta < 0) {
                System.out.println("The equation has no solution");
            } else if (delta == 0) {
                System.out.println("The equation has a double solution: " + r1);
            } else if (delta > 0) {
                System.out.println("The equation has 2 solution: \n" + r2 + "\n" + r3);
            }
        }
    }
}

