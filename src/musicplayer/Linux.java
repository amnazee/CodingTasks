package musicplayer;

public class Linux extends Variants{
    @Override
    public IAudioPlayer createAudioPlayer() {
        return null;
    }

    @Override
    public IVideoPlayer createVideoPlayer() {
        return null;
    }
}
