package subsystem;

public class DVDPlayer {
    private boolean isOn = false;

    public void on() throws Exception {
        if (Math.random() > 0.8) {  // 20% chance of failure
            throw new Exception("DVD Player failed to start.");
        }
        isOn = true;
        System.out.println("DVD Player is on.");
    }

    public void off() {
        isOn = false;
        System.out.println("DVD Player is off.");
    }

    public void playMovie(String movie) {
        if (!isOn) {
            throw new RuntimeException("DVD Player is not on.");
        } else {
            System.out.println("Playing movie: " + movie);
        }
    }

    public boolean isOn() {
        return isOn;
    }
}
