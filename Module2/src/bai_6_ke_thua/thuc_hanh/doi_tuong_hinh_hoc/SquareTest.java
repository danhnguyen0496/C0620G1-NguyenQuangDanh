package bai_6_ke_thua.thuc_hanh.doi_tuong_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(15.5);
        System.out.println(square);

        square = new Square(10.5, "Blue", false);
        System.out.println(square);
    }
}
