package creational.factory;

import creational.factory.service.Fruit;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.getFruit("apple");
        fruit.eat();

        Fruit banana = FruitFactory.getFruit("banana");
        banana.eat();
    }
}
