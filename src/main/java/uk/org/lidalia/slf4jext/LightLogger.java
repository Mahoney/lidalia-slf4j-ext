package uk.org.lidalia.slf4jext;

import org.slf4j.Marker;

/**
 *
 */
public interface LightLogger extends LightestLogger {

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
    boolean isEnabled(Level level);

    /**
     * Delegates to the appropriate logging method for the level.
     *
     * For instance, if the provided level is {@link Level#DEBUG}, this method will delegate to
     * {@link org.slf4j.Logger#debug(String)} on the decorated logger.
     *
     * @param level the level at which to log
     * @param msg the message string to be logged
     */
    void log(Level level, String msg);

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
    void log(Level level, String format, Object arg);

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
    void log(Level level, String format, Object arg1, Object arg2);

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
    void log(Level level, String format, Object... arguments);

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
    void log(Level level, String msg, Throwable throwable);

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
    void log(Level level, Marker marker, String format, Object arg);

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
    void log(Level level, Marker marker, String msg);

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
    void log(Level level, Marker marker, String format, Object arg1, Object arg2);


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
    void log(Level level, Marker marker, String msg, Throwable throwable);
}
