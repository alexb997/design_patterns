package adapters;

public class Mp3Player implements MediaPlayer {
    @Override
    public void play(String fileName, String fileType) {
        if (fileType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else {
            System.out.println("Unsupported format: " + fileType);
        }
    }
}
