package creational.factory;

import creational.factory.service.Fruit;
import creational.factory.service.impl.Apple;
import creational.factory.service.impl.Banana;

public class FruitFactory{
    public static Fruit getFruit(String name) {
        if (name.equals("apple")) {
            return new Apple();
        } else if (name.equals("banana")) {
            return new Banana();
        } else {
            return null;
        }
    }
}
