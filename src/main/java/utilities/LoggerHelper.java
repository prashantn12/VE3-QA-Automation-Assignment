package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {
    public static Logger getLogger(Class<?> cls) {
        Logger logger = Logger.getLogger(cls);
        PropertyConfigurator.configure("resources/log4j.properties");
        return logger;
    }
}
