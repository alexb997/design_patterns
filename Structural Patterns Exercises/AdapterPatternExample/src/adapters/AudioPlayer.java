package adapters;

import java.util.logging.Logger;

public class AudioPlayer {
    private static final Logger logger = Logger.getLogger(AudioPlayer.class.getName());

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            logger.info("Playing mp3 file: " + fileName);
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            AudioPlayerAdapter adapter = new AudioPlayerAdapter(audioType);
            adapter.play(audioType, fileName);
        }
    }
}
