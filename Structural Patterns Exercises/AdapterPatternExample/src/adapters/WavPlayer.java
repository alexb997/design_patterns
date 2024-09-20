package adapters;

public class WavPlayer implements AdvancedMediaPlayer {

    @Override
    public void playWav(String fileName) {
        System.out.println("Playing wav file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }

    @Override
    public void playVlc(String fileName) {
    }
}