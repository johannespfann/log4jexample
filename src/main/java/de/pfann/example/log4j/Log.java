package de.pfann.example.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {


    public static void info(final String aMessage) {
        createLogger().info(aMessage);
    }


    private static Logger createLogger() {
        Logger logger = LoggerFactory.getLogger("rootLogger");


        return logger;
    }

}
