package bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.circle;

import bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.Resizeable;

public class ResizeCircle extends Circle  implements Resizeable{

    @Override
    public void resize(double percent) {
        setRadius(getRadius()*(percent + 1));
    }
}

