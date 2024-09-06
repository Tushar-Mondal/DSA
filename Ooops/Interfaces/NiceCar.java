package Ooops.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media Player = new CDPlayer();
    public NiceCar(){
        engine = new PowerEngine();
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        Player.start();
    }
    public void stopMusic(){
        Player.stop();
    }
    public void UpgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
