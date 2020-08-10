package bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.square;

import bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.rectangle.Rectangle;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square with side = "
                + getSide()
                + "\nArea of Square = "
                + getArea();
    }
}
