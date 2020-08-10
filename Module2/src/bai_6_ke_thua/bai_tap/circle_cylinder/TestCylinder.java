package bai_6_ke_thua.bai_tap.circle_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5, 3, "Blue");
        System.out.println(cylinder);
    }
}
