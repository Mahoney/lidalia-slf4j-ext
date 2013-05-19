package uk.org.lidalia.slf4jext;

import org.slf4j.Marker;

/**
 * A decorator around an SLF4J {@link org.slf4j.Logger} that adds a set of methods called log that take an instance of Level as
 * the first argument and delegate to the appropriate method on the SLF4J Logger (info for INFO, etc).
 *
 * All methods defined by the SLF4J {@link org.slf4j.Logger} interface delegate directly to the decorated SLF4J
 * {@link org.slf4j.Logger}.
 */
@SuppressWarnings({ "PMD.ExcessivePublicCount", "PMD.TooManyMethods" })
public class Logger implements org.slf4j.Logger {

    private final org.slf4j.Logger decorated;

    /**
     * Returns a new Logger that decorates the provided SLF4J {@link org.slf4j.Logger}.
     *
     * It is generally more convenient to call {@link LoggerFactory#getLogger(Class)} or {@link LoggerFactory#getLogger(String)}.
     *
     * @param decorated the SLF4J {@link org.slf4j.Logger} to which all logging calls will be delegated
     */
    public Logger(final org.slf4j.Logger decorated) {
        this.decorated = decorated;
    }

    /**
     * Is the logger instance enabled for a given level?
     *
     * Delegates to the appropriate method for the level - for instance, if the provided level is {@link Level#DEBUG}, this
     * method will delegate to {@link org.slf4j.Logger#isDebugEnabled()} on the decorated logger.
     *
     * @param level the level that may or may not be enabled
     * @return True if this Logger is enabled for the given level,
     *         false otherwise.
     */
    public boolean isEnabled(final Level level) {
        return level.isEnabled(decorated);
    }

    /**
     * Delegates to the appropriate logging method for the level.
     *
     * For instance, if the provided level is {@link Level#DEBUG}, this method will delegate to
     * {@link org.slf4j.Logger#debug(String)} on the decorated logger.
     *
     * @param level the level at which to log
     * @param msg the message string to be logged
     */
    public void log(final Level level, final String msg) {
        level.log(decorated, msg);
    }

    /**
     * Delegates to the appropriate logging method for the level.
     *
     * For instance, if the provided level is {@link Level#DEBUG}, this method will delegate to
     * {@link org.slf4j.Logger#debug(String, Object)} on the decorated logger.
     *
     * @param level the level at which to log
     * @param format the format string
     * @param arg the argument
     */
    public void log(final Level level, final String format, final Object arg) {
        level.log(decorated, format, arg);
    }

    /**
     * Delegates to the appropriate logging method for the level.
     *
     * For instance, if the provided level is {@link Level#DEBUG}, this method will delegate to
     * {@link org.slf4j.Logger#debug(String, Object, Object)} on the decorated logger.
     *
     * @param level the level at which to log
     * @param format the format string
     * @param arg1 the first argument
     * @param arg2 the second argument
     */
    public void log(final Level level, final String format, final Object arg1, final Object arg2) {
        level.log(decorated, format, arg1, arg2);
    }

    /**
     * Delegates to the appropriate logging method for the level.
     *
     * For instance, if the provided level is {@link Level#DEBUG}, this method will delegate to
     * {@link org.slf4j.Logger#debug(String, Object...)} on the decorated logger.
     *
     * @param level the level at which to log
     * @param format the format string
     * @param arguments a list of 3 or more arguments
     */
    public void log(final Level level, final String format, final Object... arguments) {
        level.log(decorated, format, arguments);
    }

    /**
     * Delegates to the appropriate logging method for the level.
     *
     * For instance, if the provided level is {@link Level#DEBUG}, this method will delegate to
     * {@link org.slf4j.Logger#debug(String, Throwable)} on the decorated logger.
     *
     * @param level the level at which to log
     * @param msg the message string to be logged
     * @param throwable the exception (throwable) to log
     */
    public void log(final Level level, final String msg, final Throwable throwable) {
        level.log(decorated, msg, throwable);
    }

    /**
     * Similar to {@link #isTraceEnabled()} method except that the
     * marker data is also taken into account.
     *
     * Delegates to the appropriate method for the level - for instance, if the provided level is {@link Level#DEBUG}, this
     * method will delegate to {@link org.slf4j.Logger#isDebugEnabled(Marker)} on the decorated logger.
     *
     * @param level the level that may or may not be enabled
     * @param marker The marker data to take into consideration
     * @return True if this Logger is enabled for the given level,
     *         false otherwise.
     */
    public boolean isEnabled(final Level level, final Marker marker) {
        return level.isEnabled(decorated, marker);
    }

    /**
     * Delegates to the appropriate logging method for the level.
     *
     * For instance, if the provided level is {@link Level#DEBUG}, this method will delegate to
     * {@link org.slf4j.Logger#debug(Marker, String)} on the decorated logger.
     *
     * @param level the level at which to log
     * @param marker The marker data to take into consideration
     * @param msg the message string to be logged
     */
    public void log(final Level level, final Marker marker, final String msg) {
        level.log(decorated, marker, msg);
    }

    /**
     * Delegates to the appropriate logging method for the level.
     *
     * For instance, if the provided level is {@link Level#DEBUG}, this method will delegate to
     * {@link org.slf4j.Logger#debug(String, Object)} on the decorated logger.
     *
     * @param level the level at which to log
     * @param marker The marker data to take into consideration
     * @param format the format string
     * @param arg the argument
     */
    public void log(final Level level, final Marker marker, final String format, final Object arg) {
        level.log(decorated, marker, format, arg);
    }

    /**
     * Delegates to the appropriate logging method for the level.
     *
     * For instance, if the provided level is {@link Level#DEBUG}, this method will delegate to
     * {@link org.slf4j.Logger#debug(String, Object, Object)} on the decorated logger.
     *
     * @param level the level at which to log
     * @param marker The marker data to take into consideration
     * @param format the format string
     * @param arg1 the first argument
     * @param arg2 the second argument
     */
    public void log(final Level level, final Marker marker, final String format, final Object arg1, final Object arg2) {
        level.log(decorated, marker, format, arg1, arg2);
    }

    /**
     * Delegates to the appropriate logging method for the level.
     *
     * For instance, if the provided level is {@link Level#DEBUG}, this method will delegate to
     * {@link org.slf4j.Logger#debug(String, Object...)} on the decorated logger.
     *
     * @param level the level at which to log
     * @param marker The marker data to take into consideration
     * @param format the format string
     * @param arguments a list of 3 or more arguments
     */
    public void log(final Level level, final Marker marker, final String format, final Object... arguments) {
        level.log(decorated, marker, format, arguments);
    }

    /**
     * Delegates to the appropriate logging method for the level.
     *
     * For instance, if the provided level is {@link Level#DEBUG}, this method will delegate to
     * {@link org.slf4j.Logger#debug(String, Throwable)} on the decorated logger.
     *
     * @param level the level at which to log
     * @param marker The marker data to take into consideration
     * @param msg the message string to be logged
     * @param throwable the exception (throwable) to log
     */
    public void log(final Level level, final Marker marker, final String msg, final Throwable throwable) {
        level.log(decorated, marker, msg, throwable);
    }

    /* ALL OTHER METHODS SIMPLY DELEGATE TO THE SAME METHOD ON THE DECORATED LOGGER */

    @Override
    public String getName() {
        return decorated.getName();
    }

    @Override
    public boolean isTraceEnabled() {
        return decorated.isTraceEnabled();
    }

    @Override
    public void trace(final String msg) {
        decorated.trace(msg);
    }

    @Override
    public void trace(final String format, final Object arg) {
        decorated.trace(format, arg);
    }

    @Override
    public void trace(final String format, final Object arg1, final Object arg2) {
        decorated.trace(format, arg1, arg2);
    }

    @Override
    public void trace(final String format, final Object... arguments) {
        decorated.trace(format, arguments);
    }

    @Override
    public void trace(final String msg, final Throwable throwable) {
        decorated.trace(msg, throwable);
    }

    @Override
    public boolean isTraceEnabled(final Marker marker) {
        return decorated.isTraceEnabled(marker);
    }

    @Override
    public void trace(final Marker marker, final String msg) {
        decorated.trace(marker, msg);
    }

    @Override
    public void trace(final Marker marker, final String format, final Object arg) {
        decorated.trace(marker, format, arg);
    }

    @Override
    public void trace(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.trace(marker, format, arg1, arg2);
    }

    @Override
    public void trace(final Marker marker, final String format, final Object... arguments) {
        decorated.trace(marker, format, arguments);
    }

    @Override
    public void trace(final Marker marker, final String msg, final Throwable throwable) {
        decorated.trace(marker, msg, throwable);
    }

    @Override
    public boolean isDebugEnabled() {
        return decorated.isDebugEnabled();
    }

    @Override
    public void debug(final String msg) {
        decorated.debug(msg);
    }

    @Override
    public void debug(final String format, final Object arg) {
        decorated.debug(format, arg);
    }

    @Override
    public void debug(final String format, final Object arg1, final Object arg2) {
        decorated.debug(format, arg1, arg2);
    }

    @Override
    public void debug(final String format, final Object... arguments) {
        decorated.debug(format, arguments);
    }

    @Override
    public void debug(final String msg, final Throwable throwable) {
        decorated.debug(msg, throwable);
    }

    @Override
    public boolean isDebugEnabled(final Marker marker) {
        return decorated.isDebugEnabled(marker);
    }

    @Override
    public void debug(final Marker marker, final String msg) {
        decorated.debug(marker, msg);
    }

    @Override
    public void debug(final Marker marker, final String format, final Object arg) {
        decorated.debug(marker, format, arg);
    }

    @Override
    public void debug(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.debug(marker, format, arg1, arg2);
    }

    @Override
    public void debug(final Marker marker, final String format, final Object... arguments) {
        decorated.debug(marker, format, arguments);
    }

    @Override
    public void debug(final Marker marker, final String msg, final Throwable throwable) {
        decorated.debug(marker, msg, throwable);
    }

    @Override
    public boolean isInfoEnabled() {
        return decorated.isInfoEnabled();
    }

    @Override
    public void info(final String msg) {
        decorated.info(msg);
    }

    @Override
    public void info(final String format, final Object arg) {
        decorated.info(format, arg);
    }

    @Override
    public void info(final String format, final Object arg1, final Object arg2) {
        decorated.info(format, arg1, arg2);
    }

    @Override
    public void info(final String format, final Object... arguments) {
        decorated.info(format, arguments);
    }

    @Override
    public void info(final String msg, final Throwable throwable) {
        decorated.info(msg, throwable);
    }

    @Override
    public boolean isInfoEnabled(final Marker marker) {
        return decorated.isInfoEnabled(marker);
    }

    @Override
    public void info(final Marker marker, final String msg) {
        decorated.info(marker, msg);
    }

    @Override
    public void info(final Marker marker, final String format, final Object arg) {
        decorated.info(marker, format, arg);
    }

    @Override
    public void info(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.info(marker, format, arg1, arg2);
    }

    @Override
    public void info(final Marker marker, final String format, final Object... arguments) {
        decorated.info(marker, format, arguments);
    }

    @Override
    public void info(final Marker marker, final String msg, final Throwable throwable) {
        decorated.info(marker, msg, throwable);
    }

    @Override
    public boolean isWarnEnabled() {
        return decorated.isWarnEnabled();
    }

    @Override
    public void warn(final String msg) {
        decorated.warn(msg);
    }

    @Override
    public void warn(final String format, final Object arg) {
        decorated.warn(format, arg);
    }

    @Override
    public void warn(final String format, final Object... arguments) {
        decorated.warn(format, arguments);
    }

    @Override
    public void warn(final String format, final Object arg1, final Object arg2) {
        decorated.warn(format, arg1, arg2);
    }

    @Override
    public void warn(final String msg, final Throwable throwable) {
        decorated.warn(msg, throwable);
    }

    @Override
    public boolean isWarnEnabled(final Marker marker) {
        return decorated.isWarnEnabled(marker);
    }

    @Override
    public void warn(final Marker marker, final String msg) {
        decorated.warn(marker, msg);
    }

    @Override
    public void warn(final Marker marker, final String format, final Object arg) {
        decorated.warn(marker, format, arg);
    }

    @Override
    public void warn(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.warn(marker, format, arg1, arg2);
    }

    @Override
    public void warn(final Marker marker, final String format, final Object... arguments) {
        decorated.warn(marker, format, arguments);
    }

    @Override
    public void warn(final Marker marker, final String msg, final Throwable throwable) {
        decorated.warn(marker, msg, throwable);
    }

    @Override
    public boolean isErrorEnabled() {
        return decorated.isErrorEnabled();
    }

    @Override
    public void error(final String msg) {
        decorated.error(msg);
    }

    @Override
    public void error(final String format, final Object arg) {
        decorated.error(format, arg);
    }

    @Override
    public void error(final String format, final Object arg1, final Object arg2) {
        decorated.error(format, arg1, arg2);
    }

    @Override
    public void error(final String format, final Object... arguments) {
        decorated.error(format, arguments);
    }

    @Override
    public void error(final String msg, final Throwable throwable) {
        decorated.error(msg, throwable);
    }

    @Override
    public boolean isErrorEnabled(final Marker marker) {
        return decorated.isErrorEnabled(marker);
    }

    @Override
    public void error(final Marker marker, final String msg) {
        decorated.error(marker, msg);
    }

    @Override
    public void error(final Marker marker, final String format, final Object arg) {
        decorated.error(marker, format, arg);
    }

    @Override
    public void error(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.error(marker, format, arg1, arg2);
    }

    @Override
    public void error(final Marker marker, final String format, final Object... arguments) {
        decorated.error(marker, format, arguments);
    }

    @Override
    public void error(final Marker marker, final String msg, final Throwable throwable) {
        decorated.error(marker, msg, throwable);
    }
}
