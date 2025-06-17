public class RemoteControl {
    private command Command;
    public void setCommand(command Command){
        this.Command=Command;
    }
    public void pressButton(){
        if (Command!=null){
            Command.execute();
        }
        else{
            System.out.println("Command Not set");
        }
    }
}
