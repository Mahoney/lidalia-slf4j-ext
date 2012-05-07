package uk.org.lidalia.slf4jutils;

import org.slf4j.LoggerFactory;

public final class RichLoggerFactory {

    public static RichLogger getLogger(Class<?> aClass) {
        return new RichLogger(LoggerFactory.getLogger(aClass));
    }

    public static RichLogger getLogger(String loggerName) {
        return new RichLogger(LoggerFactory.getLogger(loggerName));
    }

    private RichLoggerFactory() {
        throw new UnsupportedOperationException("Not instantiable");
    }
}
