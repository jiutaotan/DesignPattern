package creational.absfactory.abstrct;

import creational.absfactory.service.CarDoor;
import creational.absfactory.service.CarLight;
import creational.absfactory.service.iml.GullWingDoor;
import creational.absfactory.service.iml.ScissorDoor;

public class CarDoorAbstractFactory extends AbstractCarFactory {


    @Override
    public CarDoor getCarDoorFactory(String type) {
        if("scissor".equals(type)){
            return new ScissorDoor();
        }else if("gullwing".equals(type)){
            return new GullWingDoor();
        }
        return null;
    }

    @Override
    public CarLight getCarLightFactory(String factoryName) {
        return null;
    }
}
