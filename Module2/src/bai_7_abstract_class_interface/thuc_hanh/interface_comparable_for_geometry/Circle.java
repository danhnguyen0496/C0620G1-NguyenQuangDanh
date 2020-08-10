package bai_7_abstract_class_interface.thuc_hanh.interface_comparable_for_geometry;

public class Circle {
    private double radius = 1.0d;
    private String color = "Blue";
    private boolean filled = true;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Information of geometry: " + "\nRadius: " + getRadius() + "\nColor: " + getColor() + "\nArea: " + getArea();
    }
}
