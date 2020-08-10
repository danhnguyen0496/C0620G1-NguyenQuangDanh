package bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.square;

import bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.Resizeable;

public class ResizeSquare extends Square implements Resizeable {
    @Override
    public void resize(double percent) {
        setSide(getSide() * (percent + 1));
    }
}
