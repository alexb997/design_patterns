package adapters;

import java.util.logging.Logger;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;
    private static final Logger logger = Logger.getLogger(MediaAdapter.class.getName());

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("wav")) {
            advancedMusicPlayer = new WavPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("wav")) {
            advancedMusicPlayer.playWav(fileName);
        } else {
            System.out.println("Unsupported format: " + audioType);
            logger.warning("Unsupported format: " + audioType);
        }

        logger.info("Playing " + fileName + " of format: " + audioType);
    }
}