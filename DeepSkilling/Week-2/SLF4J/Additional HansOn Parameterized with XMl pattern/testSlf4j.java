import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testSlf4j {
        private static final Logger logger= LoggerFactory.getLogger(testSlf4j.class);
        public static void log(){
            logger.trace("trace the class");
            logger.debug("Debugging the bug");
            logger.info("This is an info method");
            logger.warn("Warning From Server Try Again");
            logger.error("This is a error messgae");
            System.out.println("Logger {}"+logger.getClass());
        }

        public static void main(String[] args) {
            log();
        }
    }

