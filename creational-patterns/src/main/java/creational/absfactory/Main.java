package creational.absfactory;

import creational.absfactory.abstrct.AbstractCarFactory;
import creational.absfactory.abstrct.impl.CarFactory;
import creational.absfactory.service.CarDoor;
import creational.absfactory.service.CarLight;

public class Main {
    /**
     * 抽象工厂模式
     * @param args
     */
    public static void main(String[] args) {
        AbstractCarFactory carFactory = CarFactory.getCarFactory("door");
        CarDoor scissorDoor = carFactory.getCarDoorFactory("scissor");
        scissorDoor.open();
        carFactory.carShow();

        AbstractCarFactory carLightFactory = CarFactory.getCarFactory("light");
        CarLight halideLight = carLightFactory.getCarLightFactory("halide");
        halideLight.light();
        carLightFactory.carShow();


    }
}
