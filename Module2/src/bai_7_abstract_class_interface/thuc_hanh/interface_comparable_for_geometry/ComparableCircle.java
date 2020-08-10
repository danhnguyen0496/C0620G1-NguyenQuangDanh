package bai_7_abstract_class_interface.thuc_hanh.interface_comparable_for_geometry;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle oComparableCircle) {
        if (getRadius() > oComparableCircle.getRadius()) {
            return 1;
        } else if (getRadius() < oComparableCircle.getRadius()) {
            return -1;
        } else return 0;
    }
}
