package creational.absfactory.service.iml;

import creational.absfactory.service.CarDoor;

public class GullWingDoor implements CarDoor {
    @Override
    public void open() {
        System.out.println("打开鸥翼门");
    }
}
