package structural.decorator;

import structural.decorator.service.impl.FamilyCinemaProjector;
import structural.decorator.service.impl.FamilyCinemaSound;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        FamilyCinemaSound familyCinemaSound = new FamilyCinemaSound();
        familyCinemaSound.play();

        FamilyCinemaProjector familyCinemaProjector = new FamilyCinemaProjector(familyCinemaSound);
        familyCinemaProjector.play();

    }
}
