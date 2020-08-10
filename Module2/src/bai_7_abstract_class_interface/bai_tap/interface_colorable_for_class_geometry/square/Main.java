package bai_7_abstract_class_interface.bai_tap.interface_colorable_for_class_geometry.square;

import bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.circle.ResizeCircle;

public class Main {
    public static void main(String[] args) {
        Square[] squares = new Square[3];

        squares[0] = new ColorableSquare();
        squares[1] = new ColorableSquare();
        squares[2] = new ColorableSquare();

        for (Square square : squares) {
            System.out.println(square);

            ((ColorableSquare) square).howToColor();
            System.out.println(square);
        }
    }
}
