public class testVerifySingleton {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstace();
        Logger logger2 = Logger.getInstace();
        if (logger1==logger2){
            System.out.println("It is an singleton Class");
        }
        else{
            System.out.println("It is not SingleTon");
        }

    }
}
