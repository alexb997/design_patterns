import subsystem.*;
import facade.HomeTheaterFacade;

public class Main {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        LightingSystem lightingSystem = new LightingSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lightingSystem);

        homeTheater.watchMovie("Inception");

        homeTheater.stopMovie();

        homeTheater.playMusic("Classical Symphony");

        homeTheater.volumeControl(8);

        dvdPlayer.off();
        homeTheater.watchMovie("The Matrix");
    }
}
