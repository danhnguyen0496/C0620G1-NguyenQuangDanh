package bai_7_abstract_class_interface.thuc_hanh.interface_comparator_compare_class_geometry;

import bai_7_abstract_class_interface.thuc_hanh.interface_comparable_for_geometry.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(3.6);
        circle[1] = new Circle();
        circle[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle element : circle) {
            System.out.println(element);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circle, circleComparator);

        System.out.println("After-sorted:");
        for (Circle element : circle) {
            System.out.println(element);
        }
    }
}
