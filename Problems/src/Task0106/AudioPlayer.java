package Task0106;

public class AudioPlayer implements MediaPlayer{
    

    @Override
    public void play(String filename) {

        System.out.println("Playing audio file: "+filename);
        
    }

    public void stop() {

        System.out.println("audio playback stop");

    }


}
