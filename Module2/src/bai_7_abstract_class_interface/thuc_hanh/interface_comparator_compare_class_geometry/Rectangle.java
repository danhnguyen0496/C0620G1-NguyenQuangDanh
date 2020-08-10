package bai_7_abstract_class_interface.thuc_hanh.interface_comparator_compare_class_geometry;
import java.util.Comparator;
public class Rectangle {
    private double x;
    private double y;

    public Rectangle() {
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return this.x * this.y;
    }

    public double getPerimeter() {
        return (this.x + this.y) * 2;
    }

    public String toString() {
        return "Information of Rectangle: " + "\n x = " + getX() + "\n y = " + getY() +
                "\n Area = " + getArea() + "\n Perimeter = " + getPerimeter();
    }
}
