package uk.org.lidalia.slf4jutils;

import com.google.common.collect.ImmutableSet;
import org.slf4j.Logger;
import org.slf4j.Marker;

import java.util.HashSet;

import static com.google.common.collect.Sets.immutableEnumSet;
import static com.google.common.collect.Sets.newHashSet;
import static java.util.Arrays.asList;

public enum Level {

    TRACE {
        @Override
        boolean isEnabled(Logger logger) {
            return logger.isTraceEnabled();
        }
        @Override
        void log(final Logger logger, final String message) {
            logger.trace(message);
        }
        @Override
        void log(Logger logger, String message, Object arg1) {
            logger.trace(message, arg1);
        }
        @Override
        void log(Logger logger, String message, Object arg1, Object arg2) {
            logger.trace(message, arg1, arg2);
        }
        @Override
        void log(Logger logger, String message, Object[] args) {
            logger.trace(message, args);
        }
        @Override
        void log(Logger logger, String message, Throwable throwable) {
            logger.trace(message, throwable);
        }
        @Override
        boolean isEnabled(Logger logger, Marker marker) {
            return logger.isTraceEnabled(marker);
        }
        @Override
        void log(final Logger logger, Marker marker, final String message) {
            logger.trace(marker, message);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object arg1) {
            logger.trace(marker, message, arg1);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object arg1, Object arg2) {
            logger.trace(marker, message, arg1, arg2);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object[] args) {
            logger.trace(marker, message, args);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Throwable throwable) {
            logger.trace(marker, message, throwable);
        }
    },

    DEBUG {
        @Override
        boolean isEnabled(Logger logger) {
            return logger.isDebugEnabled();
        }
        @Override
        void log(final Logger logger, final String message) {
            logger.debug(message);
        }
        @Override
        void log(Logger logger, String message, Object arg1) {
            logger.debug(message, arg1);
        }
        @Override
        void log(Logger logger, String message, Object arg1, Object arg2) {
            logger.debug(message, arg1, arg2);
        }
        @Override
        void log(Logger logger, String message, Object[] args) {
            logger.debug(message, args);
        }
        @Override
        void log(Logger logger, String message, Throwable throwable) {
            logger.debug(message, throwable);
        }
        @Override
        boolean isEnabled(Logger logger, Marker marker) {
            return logger.isDebugEnabled(marker);
        }
        @Override
        void log(final Logger logger, Marker marker, final String message) {
            logger.debug(marker, message);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object arg1) {
            logger.debug(marker, message, arg1);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object arg1, Object arg2) {
            logger.debug(marker, message, arg1, arg2);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object[] args) {
            logger.debug(marker, message, args);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Throwable throwable) {
            logger.debug(marker, message, throwable);
        }
    },

    INFO {
        @Override
        boolean isEnabled(Logger logger) {
            return logger.isInfoEnabled();
        }
        @Override
        void log(final Logger logger, final String message) {
            logger.info(message);
        }
        @Override
        void log(Logger logger, String message, Object arg1) {
            logger.info(message, arg1);
        }
        @Override
        void log(Logger logger, String message, Object arg1, Object arg2) {
            logger.info(message, arg1, arg2);
        }
        @Override
        void log(Logger logger, String message, Object[] args) {
            logger.info(message, args);
        }
        @Override
        void log(Logger logger, String message, Throwable throwable) {
            logger.info(message, throwable);
        }
        @Override
        boolean isEnabled(Logger logger, Marker marker) {
            return logger.isInfoEnabled(marker);
        }
        @Override
        void log(final Logger logger, Marker marker, final String message) {
            logger.info(marker, message);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object arg1) {
            logger.info(marker, message, arg1);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object arg1, Object arg2) {
            logger.info(marker, message, arg1, arg2);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object[] args) {
            logger.info(marker, message, args);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Throwable throwable) {
            logger.info(marker, message, throwable);         }
    },

    WARN {
        @Override
        boolean isEnabled(Logger logger) {
            return logger.isWarnEnabled();
        }
        @Override
        void log(final Logger logger, final String message) {
            logger.warn(message);
        }
        @Override
        void log(Logger logger, String message, Object arg1) {
            logger.warn(message, arg1);
        }
        @Override
        void log(Logger logger, String message, Object arg1, Object arg2) {
            logger.warn(message, arg1, arg2);
        }
        @Override
        void log(Logger logger, String message, Object[] args) {
            logger.warn(message, args);
        }
        @Override
        void log(Logger logger, String message, Throwable throwable) {
            logger.warn(message, throwable);
        }
        @Override
        boolean isEnabled(Logger logger, Marker marker) {
            return logger.isWarnEnabled(marker);
        }
        @Override
        void log(final Logger logger, Marker marker, final String message) {
            logger.warn(marker, message);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object arg1) {
            logger.warn(marker, message, arg1);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object arg1, Object arg2) {
            logger.warn(marker, message, arg1, arg2);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object[] args) {
            logger.warn(marker, message, args);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Throwable throwable) {
            logger.warn(marker, message, throwable);
       }
    },

    ERROR {
        @Override
        boolean isEnabled(Logger logger) {
            return logger.isErrorEnabled();
       }
        @Override
        void log(final Logger logger, final String message) {
            logger.error(message);
        }
        @Override
        void log(Logger logger, String message, Object arg1) {
            logger.error(message, arg1);
        }
        @Override
        void log(Logger logger, String message, Object arg1, Object arg2) {
            logger.error(message, arg1, arg2);
        }
        @Override
        void log(Logger logger, String message, Object[] args) {
            logger.error(message, args);
        }
        @Override
        void log(Logger logger, String message, Throwable throwable) {
            logger.error(message, throwable);
        }
        @Override
        boolean isEnabled(Logger logger, Marker marker) {
            return logger.isErrorEnabled(marker);
        }
        @Override
        void log(final Logger logger, Marker marker, final String message) {
            logger.error(marker, message);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object arg1) {
            logger.error(marker, message, arg1);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object arg1, Object arg2) {
            logger.error(marker, message, arg1, arg2);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object[] args) {
            logger.error(marker, message, args);
        }
        @Override
        void log(Logger logger, Marker marker, String message, Throwable throwable) {
            logger.error(marker, message, throwable);
        }
    },

    OFF {
        @Override
        boolean isEnabled(Logger logger) {
            return false;
        }
        @Override
        void log(Logger logger, String message) {
            // Do nothing
        }
        @Override
        void log(Logger logger, String message, Object arg1) {
            // Do nothing
        }
        @Override
        void log(Logger logger, String message, Object arg1, Object arg2) {
            // Do nothing
        }
        @Override
        void log(Logger logger, String message, Object[] args) {
            // Do nothing
        }
        @Override
        void log(Logger logger, String message, Throwable throwable) {
            // Do nothing
        }
        @Override
        boolean isEnabled(Logger logger, Marker marker) {
            return false;
        }
        @Override
        void log(final Logger logger, Marker marker, final String message) {
            // Do nothing
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object arg1) {
            // Do nothing
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object arg1, Object arg2) {
            // Do nothing
        }
        @Override
        void log(Logger logger, Marker marker, String message, Object[] args) {
            // Do nothing
        }
        @Override
        void log(Logger logger, Marker marker, String message, Throwable throwable) {
            // Do nothing
        }
    };

    private static final ImmutableSet<Level> ALL_LEVELS = immutableEnumSet(asList(values()));
    private static final ImmutableSet<Level> ENABLABLE_LEVELS = makeEnablabeValues();

    abstract boolean isEnabled(Logger logger);

    abstract void log(Logger logger, String message);

    abstract void log(Logger logger, String message, Object arg1);

    abstract void log(Logger logger, String message, Object arg1, Object arg2);

    abstract void log(Logger logger, String message, Object[] args);

    abstract void log(Logger logger, String message, Throwable throwable);

    abstract boolean isEnabled(Logger logger, Marker marker);

    abstract void log(final Logger logger, Marker marker, final String message);

    abstract void log(Logger logger, Marker marker, String message, Object arg1);

    abstract void log(Logger logger, Marker marker, String message, Object arg1, Object arg2);

    abstract void log(Logger logger, Marker marker, String message, Object[] args);

    abstract void log(Logger logger, Marker marker, String message, Throwable throwable);

    public static ImmutableSet<Level> valueSet() {
        return ALL_LEVELS;
    }

    public static ImmutableSet<Level> enablableValueSet() {
        return ENABLABLE_LEVELS;
    }

    private static ImmutableSet<Level> makeEnablabeValues() {
        HashSet<Level> levels = newHashSet(values());
        levels.remove(OFF);
        return immutableEnumSet(levels);
    }
}
