package config;

public class CustomConfiguration {
    private String name;
    private boolean dimLights;
    private int volumeLevel;

    public CustomConfiguration(String name, boolean dimLights, int volumeLevel) {
        this.name = name;
        this.dimLights = dimLights;
        this.volumeLevel = volumeLevel;
    }

    public String getName() {
        return name;
    }

    public boolean isDimLights() {
        return dimLights;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    @Override
    public String toString() {
        return "Configuration: " + name + " | Dim Lights: " + dimLights + " | Volume Level: " + volumeLevel;
    }
}
