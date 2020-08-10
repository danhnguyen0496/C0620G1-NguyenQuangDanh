package bai_6_ke_thua.bai_tap.triangle;

public class Triangle extends Shape {
    public double side1 = 1.0;
    public double side2 = 1.0;
    public double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return 0.25 * (Math.sqrt((side1 + side2 + side3) * (side1 + side2 - side3)
                * (-side1 + side2 + side3) * (side1 - side2 + side3)));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle has 3 side: \n + side1 = " + getSide1() + "\n + side2 = " + getSide2() + "\n + side3 = " + getSide3()
                + "\n Area of Triangle: " + getArea() + "\n Perimeter of Triangle: " + getPerimeter()
                + "\n Color of triangle: " + super.getColor();
    }
}
