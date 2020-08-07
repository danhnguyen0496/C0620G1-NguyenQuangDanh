package bai_5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    final double PI = 3.14;

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
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

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public String toString() {
        return "Circle: \ncolor: " + this.color + "\nradius: " + this.radius;
    }
}

class CircleArea {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getArea();
        System.out.println(circle.getArea());

        circle.setRadius(3);
        circle.getArea();
        System.out.println(circle.getArea());

        circle.setColor("Black");
        circle.setRadius(100);
        System.out.println(circle.toString());

    }
}
