//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Engine disel=new diselEngine();
        Engine petrol=new petrolEngine();
        car Car1= new car(disel);
        car Car2 = new car(petrol);
        Car2.drive();
        Car1.drive();


        }
    }
