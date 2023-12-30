package facadepattern;

public class TheaterFacade {
    RoomLights roomLights;
    SoundSystem soundSystem;
    Television television;

    public TheaterFacade(RoomLights roomLights, SoundSystem soundSystem, Television television){
        this.roomLights=roomLights;
        this.soundSystem=soundSystem;
        this.television=television;
    }

    public void watchMovie(){
        soundSystem.switchOnSound();
        television.switchOnTV();
        roomLights.lightsDim();
    }
    public void stopMovie(){
        soundSystem.switchOffSound();
        television.switchOffTV();
        roomLights.lightsBright();
    }
}
