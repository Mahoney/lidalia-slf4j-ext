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
public class DefaultLogger extends ConvenientLogger implements Logger {

    private final LightLogger decorated;

    /**
     * Returns a new Logger that decorates the provided SLF4J {@link org.slf4j.Logger}.
     *
     * It is generally more convenient to call {@link LoggerFactory#getLogger(Class)} or {@link LoggerFactory#getLogger(String)}.
     *
     * @param decorated the SLF4J {@link org.slf4j.Logger} to which all logging calls will be delegated
     */
    public DefaultLogger(final org.slf4j.Logger decorated) {
        this(new DefaultLightLogger(decorated));
    }

    public DefaultLogger(final LightLogger decorated) {
        super(decorated);
        this.decorated = decorated;
    }

    public DefaultLogger(final LightestLogger decorated) {
        this(new LightestLoggerToLightLoggerAdapter(decorated));
    }

    @Override
    public boolean isEnabled(Level level) {
        return decorated.isEnabled(level);
    }

    @Override
    public void log(Level level, String msg) {
        decorated.log(level, msg);
    }

    @Override
    public void log(Level level, String format, Object arg) {
        decorated.log(level, format, arg);
    }

    @Override
    public void log(Level level, String format, Object arg1, Object arg2) {
        decorated.log(level, format, arg1, arg2);
    }

    @Override
    public void log(Level level, String format, Object... arguments) {
        decorated.log(level, format, arguments);
    }

    @Override
    public void log(Level level, String msg, Throwable throwable) {
        decorated.log(level, msg, throwable);
    }

    @Override
    public boolean isEnabled(Level level, Marker marker) {
        return decorated.isEnabled(level, marker);
    }

    @Override
    public void log(Level level, Marker marker, String msg) {
        decorated.log(level, marker, msg);
    }

    @Override
    public void log(Level level, Marker marker, String format, Object arg) {
        decorated.log(level, marker, format, arg);
    }

    @Override
    public void log(Level level, Marker marker, String format, Object arg1, Object arg2) {
        decorated.log(level, marker, format, arg1, arg2);
    }

    @Override
    public void log(Level level, Marker marker, String format, Object... arguments) {
        decorated.log(level, marker, format, arguments);
    }

    @Override
    public void log(Level level, Marker marker, String msg, Throwable throwable) {
        decorated.log(level, marker, msg, throwable);
    }
}
