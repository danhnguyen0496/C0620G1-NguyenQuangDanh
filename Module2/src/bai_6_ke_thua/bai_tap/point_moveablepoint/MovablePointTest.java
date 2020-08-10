package bai_6_ke_thua.bai_tap.point_moveablepoint;

import java.util.Arrays;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(9, 99, 999, 9999);
        System.out.println(movablePoint);

        movablePoint.setSpeed(100, 1000);
        System.out.println(Arrays.toString(movablePoint.getSpeed()));

        System.out.println(movablePoint.toString());
    }


}
