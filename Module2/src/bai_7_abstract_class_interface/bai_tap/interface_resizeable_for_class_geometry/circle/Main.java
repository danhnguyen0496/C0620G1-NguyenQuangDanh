package bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.circle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];

        circles[0] = new ResizeCircle();
        circles[1] = new ResizeCircle();
        circles[2] = new ResizeCircle();

        for (Circle circle : circles) {
            System.out.println("Pre - ResizeCircle");
            System.out.println(circle);
            System.out.println("------------------------------------");
            double percent = (Math.random() * 100)/100;
            ((ResizeCircle) circle).resize(percent);
            System.out.println("After - ResizeCircle");
            System.out.println(circle);
            System.out.println("------------------------------------");
        }
    }
}
