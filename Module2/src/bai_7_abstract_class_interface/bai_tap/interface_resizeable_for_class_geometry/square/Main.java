package bai_7_abstract_class_interface.bai_tap.interface_resizeable_for_class_geometry.square;

public class Main {
    public static void main(String[] args) {
        Square[] squares = new Square[3];

        squares[0] = new ResizeSquare();
        squares[1] = new ResizeSquare();
        squares[2] = new ResizeSquare();

        for (Square element : squares) {
            System.out.println("Pre - ResizeSquare: ");
            System.out.println(element);

            double percent = (Math.random() * 100) / 100;
            ((ResizeSquare) element).resize(percent);

            System.out.println("After - ResizeSquare: ");
            System.out.println(element);
            System.out.println("------------------");
        }
    }
}
