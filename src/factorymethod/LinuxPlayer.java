package factorymethod;

public class LinuxPlayer implements IPlayer{
    @Override
    public void play() {
        System.out.println("Linux Player - Playing audio");
    }

    @Override
    public void pause() {
        System.out.println("Linux Player - Pausing audio");
    }

    @Override
    public void stop() {
        System.out.println("Linux Player - Stopping audio");
    }
}
