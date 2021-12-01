package uk.org.lidalia.slf4jext;

import org.slf4j.Marker;

import static java.util.Objects.requireNonNull;

public class DefaultLightestLogger implements LightestLogger {

    private final org.slf4j.Logger logger;

    public DefaultLightestLogger(org.slf4j.Logger logger) {
        this.logger = requireNonNull(logger);
    }

    @Override
    public boolean isEnabled(Level level, Marker marker) {
        if (marker == null) {
            return level.isEnabled(logger);
        } else {
            return level.isEnabled(logger, marker);
        }
    }

    @Override
    public void log(Level level, Marker marker, String format, Object... arguments) {
        if (marker == null) {
            level.log(logger, format, arguments);
        } else {
            level.log(logger, marker, format, arguments);
        }
    }

    @Override
    public String getName() {
        return logger.getName();
    }
}
