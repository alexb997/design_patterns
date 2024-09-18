import facade.HomeTheaterFacade;
import subsystem.DVDPlayer;
import subsystem.Projector;
import subsystem.SoundSystem;

public class Main {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

        homeTheater.watchMovie("Inception");
        homeTheater.stopMovie();
    }
}