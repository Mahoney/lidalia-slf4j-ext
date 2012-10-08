package uk.org.lidalia.slf4jext;

public final class LoggerFactory {

    public static Logger getLogger(final Class<?> aClass) {
        return new Logger(org.slf4j.LoggerFactory.getLogger(aClass));
    }

    public static Logger getLogger(final String loggerName) {
        return new Logger(org.slf4j.LoggerFactory.getLogger(loggerName));
    }

    private LoggerFactory() {
        throw new UnsupportedOperationException("Not instantiable");
    }
}
