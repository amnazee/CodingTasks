package musicplayer;

import abstractfactory.Gpu;
import abstractfactory.Monitor;
import abstractfactory.Mouse;

public abstract class Variants  {
    public abstract IAudioPlayer createAudioPlayer();

    public abstract IVideoPlayer createVideoPlayer();
}
