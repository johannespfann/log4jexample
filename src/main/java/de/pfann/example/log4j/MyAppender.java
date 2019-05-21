package de.pfann.example.log4j;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class MyAppender extends AppenderSkeleton {

    protected void append(LoggingEvent loggingEvent) {

    }

    public void close() {

    }

    public boolean requiresLayout() {
        return false;
    }
}
