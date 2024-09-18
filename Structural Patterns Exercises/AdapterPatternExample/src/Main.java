import adapters.AudioPlayer;
import adapters.MediaAdapter;
import adapters.MediaPlayer;

public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");

        MediaPlayer mediaAdapter = new MediaAdapter("mp4");
        mediaAdapter.play("mp4", "movie.mp4");

        mediaAdapter = new MediaAdapter("vlc");
        mediaAdapter.play("vlc", "documentary.vlc");
    }
}