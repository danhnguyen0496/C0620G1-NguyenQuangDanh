package bai_6_ke_thua.bai_tap.point_moveablepoint;

import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(6, 10);
        System.out.println(point);

        point.setXY(22, 66);
        System.out.println(Arrays.toString(point.getXY()));

        System.out.println(point.toString());

    }
}
