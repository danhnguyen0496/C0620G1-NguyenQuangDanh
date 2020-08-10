package bai_7_abstract_class_interface.thuc_hanh.interface_comparator_compare_class_geometry;

import java.util.Comparator;

public class RectangleComparator extends Rectangle implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if (o1.getArea() > o2.getArea()) return 1;
        else if (o1.getArea() < o2.getArea()) return -1;
        else return 0;
//        return Double.compare(o1.getArea(), o2.getArea());  // Thay thế đoạn if trên
    }
}
