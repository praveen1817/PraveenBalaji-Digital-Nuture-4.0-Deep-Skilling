public class LightOn implements command {
    private Light light;
    public LightOn(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}

