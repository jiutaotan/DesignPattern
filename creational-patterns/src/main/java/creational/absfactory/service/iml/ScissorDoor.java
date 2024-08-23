package creational.absfactory.service.iml;

import creational.absfactory.service.CarDoor;

public class ScissorDoor implements CarDoor {

    @Override
    public void open() {
        System.out.println("打开剪刀门");
    }
}
