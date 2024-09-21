package facade;

import subsystem.*;
import config.CustomConfiguration;

import java.util.HashMap;
import java.util.Map;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private LightingSystem lightingSystem;
    private Map<String, CustomConfiguration> customConfigurations;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, LightingSystem lightingSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lightingSystem = lightingSystem;
        this.customConfigurations = new HashMap<>();
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
            recoverFromDVDPlayerFailure(movie);
        }
    }

    private void recoverFromDVDPlayerFailure(String movie) {
        System.out.println("Attempting to recover...");
        try {
            Thread.sleep(1000);  // Simulate recovery
            dvdPlayer.on();  // Retry starting the DVD player
            dvdPlayer.playMovie(movie);
        } catch (Exception e) {
            System.err.println("Recovery failed. Please check your system.");
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

    public void saveCustomConfiguration(String name, boolean dimLights, int volumeLevel) {
        CustomConfiguration config = new CustomConfiguration(name, dimLights, volumeLevel);
        customConfigurations.put(name, config);
        System.out.println("Custom configuration '" + name + "' saved.");
    }

    public void loadCustomConfiguration(String name) {
        CustomConfiguration config = customConfigurations.get(name);
        if (config != null) {
            System.out.println("Loading configuration: " + config);
            if (config.isDimLights()) {
                lightingSystem.dimLights();
            } else {
                lightingSystem.brightLights();
            }
            soundSystem.setVolume(config.getVolumeLevel());
        } else {
            System.out.println("Configuration '" + name + "' not found.");
        }
    }
}
