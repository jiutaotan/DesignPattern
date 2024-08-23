package creational.absfactory.abstrct;

import creational.absfactory.service.CarDoor;
import creational.absfactory.service.CarLight;
import creational.absfactory.service.iml.BaiZiLight;
import creational.absfactory.service.iml.HalideLight;

public class CarLightAbstractFactory extends AbstractCarFactory {


    @Override
    public CarDoor getCarDoorFactory(String type) {
        return null;
    }

    @Override
    public CarLight getCarLightFactory(String type) {
        if ("halide".equalsIgnoreCase(type)){
            return new HalideLight();
        }else if ("baizi".equalsIgnoreCase(type)){
            return new BaiZiLight();
        }
        return null;
    }
}
