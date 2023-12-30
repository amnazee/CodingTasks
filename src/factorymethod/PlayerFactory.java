package factorymethod;

public class PlayerFactory {
    public static IPlayer createPlayer() {
        // Detect the operating system (you might want to enhance this logic)
        // For demonstration purposes, I'm assuming either 'Windows' or 'Linux'
        String currentOS = System.getProperty("os.name").toLowerCase();

        if (currentOS.contains("win")) {
            return new WindowsPlayer();
        } else if (currentOS.contains("nix") || currentOS.contains("nux") || currentOS.contains("mac")) {
            return new LinuxPlayer();
        } else {
            throw new UnsupportedOperationException("No player available for " + currentOS);
        }
    }
}
