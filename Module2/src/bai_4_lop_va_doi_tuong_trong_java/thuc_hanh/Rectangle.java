package bai_4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double height, width;

    public Rectangle() {

    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Rectangle { width = " + width + "}, height = " + height + "}";
    }
}

class Ex14_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);  // tạo đối tượng

        System.out.println("My rectangle: \n" + rectangle.display());
        System.out.println("Area of rectangle: \n" + rectangle.getArea());
        System.out.println("Perimeter of rectangle: \n" + rectangle.getPerimeter());
    }
}




