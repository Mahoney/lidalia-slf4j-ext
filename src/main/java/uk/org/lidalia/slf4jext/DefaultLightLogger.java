package uk.org.lidalia.slf4jext;

import org.slf4j.Marker;

public class DefaultLightLogger implements LightLogger {

    private final org.slf4j.Logger decorated;

    /**
     * Returns a new Logger that decorates the provided SLF4J {@link org.slf4j.Logger}.
     *
     * It is generally more convenient to call {@link LoggerFactory#getLogger(Class)} or {@link LoggerFactory#getLogger(String)}.
     *
     * @param decorated the SLF4J {@link org.slf4j.Logger} to which all logging calls will be delegated
     */
    public DefaultLightLogger(final org.slf4j.Logger decorated) {
        this.decorated = decorated;
    }

    @Override
    public boolean isEnabled(final Level level) {
        return level.isEnabled(decorated);
    }

    @Override
    public void log(final Level level, final String msg) {
        level.log(decorated, msg);
    }

    @Override
    public void log(final Level level, final String format, final Object arg) {
        level.log(decorated, format, arg);
    }

    @Override
    public void log(final Level level, final String format, final Object arg1, final Object arg2) {
        level.log(decorated, format, arg1, arg2);
    }

    @Override
    public void log(final Level level, final String format, final Object... arguments) {
        level.log(decorated, format, arguments);
    }

    @Override
    public void log(final Level level, final String msg, final Throwable throwable) {
        level.log(decorated, msg, throwable);
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker) {
        return level.isEnabled(decorated, marker);
    }

    @Override
    public void log(final Level level, final Marker marker, final String msg) {
        level.log(decorated, marker, msg);
    }

    @Override
    public void log(final Level level, final Marker marker, final String format, final Object arg) {
        level.log(decorated, marker, format, arg);
    }

    @Override
    public void log(final Level level, final Marker marker, final String format, final Object arg1, final Object arg2) {
        level.log(decorated, marker, format, arg1, arg2);
    }

    @Override
    public void log(final Level level, final Marker marker, final String format, final Object... arguments) {
        level.log(decorated, marker, format, arguments);
    }

    @Override
    public void log(final Level level, final Marker marker, final String msg, final Throwable throwable) {
        level.log(decorated, marker, msg, throwable);
    }

    @Override
    public String getName() {
        return decorated.getName();
    }
}
