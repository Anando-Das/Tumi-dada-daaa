package Task0106;

public class VedioPlayer implements MediaPlayer{
    @Override
    public void play(String filename) {

        System.out.println("Playing vedio file: "+filename);
        
    }

    public void stop() {

        System.out.println("audio playback stop");

    }
}
