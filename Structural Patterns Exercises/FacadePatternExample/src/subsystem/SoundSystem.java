package subsystem;

public class SoundSystem {
    private int volume = 50;  // Default volume

    public void on() {
        System.out.println("Sound system is on.");
    }

    public void off() {
        System.out.println("Sound system is off.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to: " + volume);
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(String music) {
        System.out.println("Playing music: " + music);
    }
}
