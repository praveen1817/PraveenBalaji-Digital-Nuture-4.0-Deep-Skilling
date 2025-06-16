public class Logger {
    private static Logger instance;
    private Logger()
    {
        System.out.println("This is Private looger ");
    }
    public static Logger getInstace(){
        if (instance==null) {
            instance = new Logger();
        }
         else{
             return instance;
            }
         return instance;
    }
}
