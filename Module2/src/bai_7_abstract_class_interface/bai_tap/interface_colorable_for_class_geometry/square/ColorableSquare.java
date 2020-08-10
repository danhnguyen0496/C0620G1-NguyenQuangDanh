package bai_7_abstract_class_interface.bai_tap.interface_colorable_for_class_geometry.square;

import bai_7_abstract_class_interface.bai_tap.interface_colorable_for_class_geometry.Colorable;

public class ColorableSquare extends Square implements Colorable {
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");;
    }
}
