package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

public class XayDungLopFan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public XayDungLopFan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isOn()) {
            return "Fan = { \n speed: " + speed + "\n color: " + color + "\n radius: " + radius + "\n Fan is on }";
        } else if (!isOn()) {
            return "Fan = { \n color: " + color + "\n radius: " + radius + "\n Fan is off }";
        }
        return toString();
    }
}

class Fan {

    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    public static void main(String[] args) {
        XayDungLopFan fan1 = new XayDungLopFan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        XayDungLopFan fan2 = new XayDungLopFan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan1.setOn(false);
        System.out.println(fan2.toString());
    }
}
