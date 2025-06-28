import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class testBase {
    private static final Logger log= LoggerFactory.getLogger(testBase.class);
    public static void logMsg(){
        log.error("Error Occured");
        log.warn("Warning for Invalid Method");
    }

    public static void main(String[] args) {
        logMsg();
    }
}
