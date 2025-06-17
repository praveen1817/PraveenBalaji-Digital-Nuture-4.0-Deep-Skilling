public interface Engine{
    void start();
}
 class car{
    public Engine engine;
    car(Engine engine){
        this.engine=engine;
    }
    public void drive(){
        engine.start();
        System.out.println("Car...Driving'");
    }


}
class diselEngine implements Engine{
    @Override
    public void start(){
         System.out.println("Car...Started");
     }
}
class petrolEngine implements Engine{
    @Override
   public void start(){
        System.out.println("Car..Started");
    }
}

