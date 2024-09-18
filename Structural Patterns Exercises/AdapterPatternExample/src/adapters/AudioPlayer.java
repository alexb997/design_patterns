package adapters;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else {
            System.out.println("Invalid media format: " + fileType);
        }
    }
}