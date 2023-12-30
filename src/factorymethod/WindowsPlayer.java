package factorymethod;

public class WindowsPlayer implements IPlayer{

    @Override
    public void play() {
        System.out.println("Windows Player - Playing audio");
    }

    @Override
    public void pause() {
        System.out.println("Windows Player - Pausing audio");
    }

    @Override
    public void stop() {
        System.out.println("Windows Player - Stopping audio");
    }
}
