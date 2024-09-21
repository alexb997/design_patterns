package adapters;

import log.Logger;
import utils.MediaConverter;

public class AudioPlayerAdapter {
    private AdvancedMediaPlayer advancedMediaPlayer;
    private String audioType;
    private static final Logger logger = Logger.getInstance();

    public AudioPlayerAdapter(String audioType) {
        this.audioType = audioType;
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("wav")) {
            advancedMediaPlayer = new WavPlayer();
        }
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            logger.log("Playing mp4 file: " + fileName);
            System.out.println("INFO: Playing mp4 file: " + fileName);
            advancedMediaPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            logger.log("Playing vlc file: " + fileName);
            System.out.println("INFO: Playing vlc file: " + fileName);
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("wav")) {
            logger.log("Playing wav file: " + fileName);
            System.out.println("INFO: Playing wav file: " + fileName);
            advancedMediaPlayer.playWav(fileName);
        } else {
            logger.log("Unsupported format: " + audioType);
            System.out.println("Unsupported format: " + audioType);

            String convertedFormat = MediaConverter.convert(fileName, audioType, "mp4");
            if (convertedFormat != null) {
                logger.log("Converted file: " + fileName + " from " + audioType + " to mp4");
                System.out.println("INFO: Converted file: " + fileName + " from " + audioType + " to mp4");

                this.advancedMediaPlayer = new Mp4Player();
                play("mp4", convertedFormat);
            } else {
                logger.log("Conversion failed for file: " + fileName);
                System.out.println("Error: Unable to convert " + audioType + " format.");
            }
        }
    }
}
