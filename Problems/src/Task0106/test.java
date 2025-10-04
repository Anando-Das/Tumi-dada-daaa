package Task0106;

public class test {
    public static void main(String[] args) {
        
        MediaPlayer ad;

        ad= new AudioPlayer();
        ad.play("song.mp3");
        ad.stop();

        ad= new VedioPlayer();
        ad.play("vedio.mp4");
        ad.stop();

    }
}
