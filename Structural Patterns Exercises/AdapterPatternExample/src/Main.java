import adapters.MediaAdapter;
import adapters.MediaPlayer;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaAdapter();

        mediaPlayer.play("song1.mp3", "mp3");
        mediaPlayer.play("movie.mp4", "mp4");
        mediaPlayer.play("documentary.vlc", "vlc");
        mediaPlayer.play("sound.wav", "wav");
        mediaPlayer.play("unknown.xyz", "xyz");
    }
}
