package bai_7_abstract_class_interface.thuc_hanh.class_animal_interface_edible.fruit;

public class EdibleFruitTest {
    public static void main(String[] args) {
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit fruits : fruit) {
            System.out.println(fruits.howToEat());
        }
    }
}
