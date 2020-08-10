package bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.rectangle;

import bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.shape.Shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "\nRectangle with width = "
                + getWidth()
                + " and length = "
                + getLength()
                + "\nArea of Rectangle = "
                + getArea();
    }
}