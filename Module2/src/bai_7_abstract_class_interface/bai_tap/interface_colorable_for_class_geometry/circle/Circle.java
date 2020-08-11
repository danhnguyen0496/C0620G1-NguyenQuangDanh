package bai_7_abstract_class_interface.bai_tap.interface_colorable_for_class_geometry.circle;

import bai_7_abstract_class_interface.bai_tap.interface_colorable_for_class_geometry.shape.Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Radius of Circle = " + getRadius() + "\nArea of Circle = " + getArea();
    }

}