package Practice;

public class motoCar implements car {

    public Engine engine;
    motoCar(Engine engine){
        this.engine=engine;
    }
    @Override

    public void start(){
        engine.on();
        System.out.println("Engine...Stared");
    }
    public void accelrate(int power) {
        engine.powerOn();
        System.out.println("Car...Moving"+power);
    }
}
