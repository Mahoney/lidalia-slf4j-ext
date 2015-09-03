package uk.org.lidalia.slf4jext;

import org.slf4j.Marker;

public interface LightestLogger {

    /**
     * Similar to {@link org.slf4j.Logger#isTraceEnabled()} method except that the
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
    boolean isEnabled(Level level, Marker marker);

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
    void log(Level level, Marker marker, String format, Object... arguments);

    String getName();
}
