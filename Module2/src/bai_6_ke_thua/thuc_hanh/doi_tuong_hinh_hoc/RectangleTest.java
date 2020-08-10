package bai_6_ke_thua.thuc_hanh.doi_tuong_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(30, 30);
        System.out.println(rectangle);

        rectangle = new Rectangle(2, 6, "Blu", false);
        System.out.println(rectangle);
    }
}
