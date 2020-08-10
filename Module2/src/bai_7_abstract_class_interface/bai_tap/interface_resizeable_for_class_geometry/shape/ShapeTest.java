package bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
