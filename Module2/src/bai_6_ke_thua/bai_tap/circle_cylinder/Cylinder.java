package bai_6_ke_thua.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height;


    public Cylinder() {
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "Volume of Cylinder with height: " + getHeight() + " and radius: " + getRadius() + " is: " + getVolume();
    }
}



