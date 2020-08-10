package bai_6_ke_thua.bai_tap.point2d_poitn3d;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(2, 4,6);
        System.out.println(point3D);

        point3D.setXYZ(1,3,8);
        System.out.println(point3D);

        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
