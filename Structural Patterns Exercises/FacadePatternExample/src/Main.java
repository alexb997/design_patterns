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

        homeTheater.volumeControl(75);

        homeTheater.stopMovie();

        homeTheater.playMusic();

        homeTheater.gamingMode();
    }
}
