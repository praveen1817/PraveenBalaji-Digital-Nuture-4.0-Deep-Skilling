public class testCommand {
    public static void main(String[] args) {
        Light controlLight=new Light();
        command on =new LightOn(controlLight);
        command off=new LightOff(controlLight);
        RemoteControl remoteControl=new RemoteControl();
        remoteControl.pressButton();
        remoteControl.setCommand(on);
        remoteControl.pressButton();
        remoteControl.setCommand(off);
        remoteControl.pressButton();



    }
}
