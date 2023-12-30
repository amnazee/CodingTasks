package facadepattern;

public class Main {
    public static void main(String[] arg){
        RoomLights roomLights=new RoomLights();
        Television television=new Television();
        SoundSystem soundSystem=new SoundSystem();

        TheaterFacade facade=new TheaterFacade(roomLights,soundSystem,television);

        facade.watchMovie();
        System.out.println("---------------");
        facade.stopMovie();

    }
}
