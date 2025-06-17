package Practice;

public class Main {
    public static void main(String[] args) {
        Engine engine=new electricEngine();
        car Car=new motoCar(engine);
        Car.start();
        Car.accelrate(3000);
    }
}
