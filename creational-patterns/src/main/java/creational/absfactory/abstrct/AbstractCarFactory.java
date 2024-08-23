package creational.absfactory.abstrct;

import creational.absfactory.service.CarDoor;
import creational.absfactory.service.CarLight;

public abstract class AbstractCarFactory {

    public abstract CarDoor getCarDoorFactory(String type);

    public abstract CarLight getCarLightFactory(String type);
    public void carShow(){
        System.out.println("默认方法！");
    }

}
