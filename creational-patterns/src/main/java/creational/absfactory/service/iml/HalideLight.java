package creational.absfactory.service.iml;

import creational.absfactory.service.CarLight;

public class HalideLight implements CarLight {

    @Override
    public void light() {
        System.out.println("打开卤素灯");
    }
}
