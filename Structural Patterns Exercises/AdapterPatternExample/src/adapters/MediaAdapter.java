package adapters;

import media.MP4Player;
import media.VLCPlayer;

public class MediaAdapter implements MediaPlayer {
    private MP4Player mp4Player;
    private VLCPlayer vlcPlayer;

    public MediaAdapter(String fileType) {
        if (fileType.equalsIgnoreCase("mp4")) {
            mp4Player = new MP4Player();
        } else if (fileType.equalsIgnoreCase("vlc")) {
            vlcPlayer = new VLCPlayer();
        }
    }

    @Override
    public void play(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("mp4")) {
            mp4Player.play(fileName);
        } else if (fileType.equalsIgnoreCase("vlc")) {
            vlcPlayer.play(fileName);
        } else {
            System.out.println("Invalid media format: " + fileType);
        }
    }
}