package musicplayer;

public abstract class Windows {
    public abstract IAudioPlayer createAudioPlayer();

    public abstract IVideoPlayer createVideoPlayer();
}
