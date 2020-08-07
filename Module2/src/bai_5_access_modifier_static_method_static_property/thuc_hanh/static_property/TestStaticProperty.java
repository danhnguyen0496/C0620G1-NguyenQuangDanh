package bai_5_access_modifier_static_method_static_property.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda3", "Skyactiv 3");
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        Car car3 = new Car("Mazda 12", "Skyactiv 12");
        System.out.println(Car.numberOfCars);
    }
}
