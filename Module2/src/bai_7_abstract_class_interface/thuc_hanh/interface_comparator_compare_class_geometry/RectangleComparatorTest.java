package bai_7_abstract_class_interface.thuc_hanh.interface_comparator_compare_class_geometry;

import java.util.Arrays;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];

        rectangle[0] = new Rectangle(2, 4);
        rectangle[1] = new Rectangle(3, 6);
        rectangle[2] = new Rectangle(4, 8);

        System.out.println("Pre - sort: ");
        for (Rectangle rectangles : rectangle) {
            System.out.println(rectangles);
        }

        RectangleComparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangle, rectangleComparator);

        System.out.println("After - sort: ");
        for (Rectangle rectangles : rectangle) {
            System.out.println(rectangles);
        }
    }
}
