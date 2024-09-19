package adapters;

import log.Logger;

public class MediaAdapter implements MediaPlayer {
    private Mp3Player mp3Player;
    private Logger logger;

    public MediaAdapter() {
        mp3Player = new Mp3Player();
        logger = Logger.getInstance();
    }

    @Override
    public void play(String fileName, String fileType) {
        if (fileType.equalsIgnoreCase("mp3")) {
            mp3Player.play(fileName, fileType);
        } else if (fileType.equalsIgnoreCase("mp4")) {
            System.out.println("Playing MP4 file: " + fileName);
        } else if (fileType.equalsIgnoreCase("vlc")) {
            System.out.println("Playing VLC file: " + fileName);
        } else if (fileType.equalsIgnoreCase("wav")) {
            System.out.println("Playing WAV file: " + fileName);
        } else {
            System.out.println("Unsupported format: " + fileType);
        }

        logger.log("Played file: " + fileName + " with format: " + fileType);
    }
}
