package adapters;

import java.util.logging.Logger;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    private static final Logger logger = Logger.getLogger(AudioPlayer.class.getName());

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
            logger.info("Playing " + fileName + " of format: mp3");
        }
        else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("wav")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Unsupported format: " + audioType);
            logger.warning("Unsupported format: " + audioType);
        }
    }
}