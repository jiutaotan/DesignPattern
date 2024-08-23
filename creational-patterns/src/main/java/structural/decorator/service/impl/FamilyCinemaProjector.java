package structural.decorator.service.impl;

import structural.decorator.service.FamilyCinema;

public class FamilyCinemaProjector implements FamilyCinema {

    private FamilyCinema familyCinema;

    public FamilyCinemaProjector(){

    }

    public FamilyCinemaProjector(FamilyCinema familyCinema){
        this.familyCinema = familyCinema;
    }

    @Override
    public void play() {
        System.out.println("播放投影仪");
        this.familyCinema.play();
        System.out.println("开始享受");

    }
}
