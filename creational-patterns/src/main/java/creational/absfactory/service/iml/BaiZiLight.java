package creational.absfactory.service.iml;

import creational.absfactory.service.CarLight;

public class BaiZiLight implements CarLight {
    @Override
    public void light() {
        System.out.println("打开白织灯");
    }
}
