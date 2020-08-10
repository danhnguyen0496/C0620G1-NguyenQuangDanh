package bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];

        rectangles[0] = new ResizeRectangle();
        rectangles[1] = new ResizeRectangle();
        rectangles[2] = new ResizeRectangle();

        for (Rectangle rectangle : rectangles) {
            System.out.println("Pre - ResizeRectangle: ");
            System.out.println(rectangle);

            double percent = (Math.random() * 100) / 100;
            ((ResizeRectangle) rectangle).resize(percent);

            System.out.println("After - ResizeRectangle: ");
            System.out.println(rectangle);

            System.out.println("------------------------");

        }
    }
}
