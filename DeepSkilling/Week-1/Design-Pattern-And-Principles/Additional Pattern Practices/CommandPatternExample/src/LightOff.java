public class LightOff implements command{
    private Light light;
    public LightOff(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }
}
