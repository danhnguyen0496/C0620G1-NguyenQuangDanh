package bai_7_abstract_class_interface.bai_tap.interface_colorable_for_class_geometry.shape;

import bai_7_abstract_class_interface.bai_tap.interface_colorable_for_class_geometry.circle.Circle;
import bai_7_abstract_class_interface.bai_tap.interface_colorable_for_class_geometry.rectangle.Rectangle;
import bai_7_abstract_class_interface.bai_tap.interface_colorable_for_class_geometry.square.ColorableSquare;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Rectangle();
        shapes[1] = new Circle();
        shapes[2] = new ColorableSquare();

        for (Shape shape : shapes) {
            if (shape instanceof ColorableSquare) {
                ((ColorableSquare) shape).howToColor();
            }
            System.out.println(shape);
        }
    }
}
