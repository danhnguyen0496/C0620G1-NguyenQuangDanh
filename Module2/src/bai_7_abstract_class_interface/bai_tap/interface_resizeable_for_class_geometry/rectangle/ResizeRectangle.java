package bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.rectangle;

import bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.Resizeable;

public class ResizeRectangle extends Rectangle implements Resizeable {
    @Override
    public void resize(double percent) {
        setLength(getLength() * (percent + 1));
        setWidth(getWidth() * (percent + 1));
    }
}
