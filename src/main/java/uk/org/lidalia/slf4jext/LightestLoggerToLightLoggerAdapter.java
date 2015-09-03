package uk.org.lidalia.slf4jext;

import org.slf4j.Marker;

import static com.google.common.base.Preconditions.checkNotNull;

public class LightestLoggerToLightLoggerAdapter implements LightLogger {

    private final LightestLogger decorated;

    public LightestLoggerToLightLoggerAdapter(LightestLogger decorated) {
        this.decorated = checkNotNull(decorated);
    }

    @Override
    public boolean isEnabled(Level level, Marker marker) {
        return decorated.isEnabled(level, marker);
    }

    @Override
    public void log(Level level, Marker marker, String format, Object... arguments) {
        decorated.log(level, marker, format, arguments);
    }

    @Override
    public void log(Level level, Marker marker, String msg, Throwable throwable) {
        decorated.log(level, marker, msg, throwable);
    }

    @Override
    public String getName() {
        return decorated.getName();
    }

    @Override
    public boolean isEnabled(Level level) {
        return decorated.isEnabled(level, null);
    }

    @Override
    public void log(Level level, String msg) {
        decorated.log(level, null, msg);
    }

    @Override
    public void log(Level level, String format, Object arg) {
        decorated.log(level, null, format, arg);
    }

    @Override
    public void log(Level level, String format, Object arg1, Object arg2) {
        decorated.log(level, null, format, arg1, arg2);
    }

    @Override
    public void log(Level level, String format, Object... arguments) {
        decorated.log(level, null, format, arguments);
    }

    @Override
    public void log(Level level, String msg, Throwable throwable) {
        decorated.log(level, null, msg, throwable);
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
}
