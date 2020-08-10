package bai_7_abstract_class_interface.thuc_hanh.interface_comparator_compare_class_geometry;

import bai_7_abstract_class_interface.thuc_hanh.interface_comparable_for_geometry.Circle;

import java.util.Comparator;

public class CircleComparator extends Circle implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}
