package bai_6_ke_thua.bai_tap.point2d_poitn3d;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(3, 8);
        System.out.println(point2D);

        point2D.setXY(6, 10);
        System.out.println(point2D);

        System.out.println(Arrays.toString(point2D.getXY()));

    }
}
