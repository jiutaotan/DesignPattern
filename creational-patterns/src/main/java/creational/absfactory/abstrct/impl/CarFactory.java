package creational.absfactory.abstrct.impl;


import creational.absfactory.abstrct.AbstractCarFactory;
import creational.absfactory.abstrct.CarDoorAbstractFactory;
import creational.absfactory.abstrct.CarLightAbstractFactory;

/**
 * @author EDY
 */
public class CarFactory {

    public static AbstractCarFactory getCarFactory(String factoryName)
    {
        if ("door".equals(factoryName))
        {
            return new CarDoorAbstractFactory();
        }
        else if ("light".equals(factoryName))
        {
            return new CarLightAbstractFactory();
        }
            return null;
    }

}
