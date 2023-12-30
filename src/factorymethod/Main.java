package factorymethod;

public class Main {
    public static void main(String[] args) {
        IPlayer player = PlayerFactory.createPlayer();
        player.play();
        player.pause();
        player.stop();
    }
}
