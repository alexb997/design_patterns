package facade;

import subsystem.*;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private LightingSystem lightingSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, LightingSystem lightingSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lightingSystem = lightingSystem;
    }

    public void watchMovie(String movie) {
        try {
            System.out.println("Preparing to watch movie...");
            dvdPlayer.on();
            projector.on();
            soundSystem.on();
            lightingSystem.dimLights();
            dvdPlayer.playMovie(movie);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            System.out.println("Attempting recovery...");
            recoveryProcedure();
        }
    }

    public void playMusic() {
        System.out.println("Preparing to play music...");
        soundSystem.on();
        lightingSystem.brightLights();
        System.out.println("Music is playing.");
    }

    public void gamingMode() {
        System.out.println("Preparing for gaming mode...");
        projector.on();
        soundSystem.on();
        lightingSystem.brightLights();
        System.out.println("Gaming mode activated.");
    }

    public void stopMovie() {
        System.out.println("Shutting down the movie...");
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
        lightingSystem.brightLights();
    }

    public void volumeControl(int volume) {
        soundSystem.setVolume(volume);
    }

    private void recoveryProcedure() {
        System.out.println("Retrying to start the DVD Player...");
        try {
            dvdPlayer.on();
        } catch (Exception e) {
            System.err.println("Recovery failed. Please check the DVD Player.");
        }
    }
}
