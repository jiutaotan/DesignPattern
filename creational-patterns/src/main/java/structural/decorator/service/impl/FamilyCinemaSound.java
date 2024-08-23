package structural.decorator.service.impl;

import structural.decorator.service.FamilyCinema;

/**
 * @author EDY
 */
public class FamilyCinemaSound implements FamilyCinema {
    @Override
    public void play() {
        System.out.println("播放音频");
    }
}
