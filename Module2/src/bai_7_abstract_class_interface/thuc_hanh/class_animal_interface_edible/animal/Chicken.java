package bai_7_abstract_class_interface.thuc_hanh.class_animal_interface_edible.animal;

import bai_7_abstract_class_interface.thuc_hanh.class_animal_interface_edible.fruit.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
