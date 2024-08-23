package creational.factory.service.impl;

import creational.factory.service.Fruit;

public class Banana implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }
}
