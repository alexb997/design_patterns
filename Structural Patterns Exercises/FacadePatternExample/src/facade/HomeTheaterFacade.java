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
            System.out.println("Setting up to watch a movie...");
            dvdPlayer.on();
            projector.on();
            projector.setInput("DVD");
            soundSystem.on();
            lightingSystem.dimLights();
            dvdPlayer.playMovie(movie);
            System.out.println("Enjoy your movie!");
        } catch (Exception e) {
            System.err.println("Error: DVD Player failed. " + e.getMessage());
        }
    }

    public void stopMovie() {
        System.out.println("Shutting down movie mode...");
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
        lightingSystem.brightLights();
    }

    public void playMusic(String music) {
        System.out.println("Switching to music mode...");
        soundSystem.on();
        soundSystem.playMusic(music);
        lightingSystem.brightLights(); 
    }

    public void gamingMode() {
        System.out.println("Switching to gaming mode...");
        projector.on();
        projector.setInput("Game Console");
        soundSystem.on();
        lightingSystem.brightLights();
    }

    public void volumeControl(int volume) {
        soundSystem.setVolume(volume);
    }
}
