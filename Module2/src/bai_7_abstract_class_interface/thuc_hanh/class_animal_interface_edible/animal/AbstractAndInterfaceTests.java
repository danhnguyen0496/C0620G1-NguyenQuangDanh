package bai_7_abstract_class_interface.thuc_hanh.class_animal_interface_edible.animal;

import bai_7_abstract_class_interface.thuc_hanh.class_animal_interface_edible.fruit.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
