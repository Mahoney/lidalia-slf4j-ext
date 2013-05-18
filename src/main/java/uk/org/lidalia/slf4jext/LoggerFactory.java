package uk.org.lidalia.slf4jext;

/**
 * Convenient equivalents of the static functions on SLF4J's {@link org.slf4j.LoggerFactory}.
 *
 * These return an SLF4J Ext {@link Logger} decorating the SLF4J {@link org.slf4j.Logger} that would be returned by the equivalent
 * function on SLF4J's {@link org.slf4j.LoggerFactory}.
 */
public final class LoggerFactory {

    /**
     * Return a {@link Logger} decorating the SLF4J {@link org.slf4j.Logger} returned by a call to
     * SLF4J's {@link org.slf4j.LoggerFactory#getLogger(Class)}.
     *
     * @param aClass the returned logger will be named after clazz
     * @return logger
     */
    public static Logger getLogger(final Class<?> aClass) {
        return new Logger(org.slf4j.LoggerFactory.getLogger(aClass));
    }

    /**
     * Return a {@link Logger} decorating the SLF4J {@link org.slf4j.Logger} returned by a call to
     * SLF4J's {@link org.slf4j.LoggerFactory#getLogger(String)}.
     *
     * @param loggerName The name of the logger.
     * @return logger
     */
    public static Logger getLogger(final String loggerName) {
        return new Logger(org.slf4j.LoggerFactory.getLogger(loggerName));
    }

    private LoggerFactory() {
        throw new UnsupportedOperationException("Not instantiable");
    }
}
