package uk.org.lidalia.slf4jext;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.Marker;

/**
 * Enum modelling the logical levels implied by the way <a href="http://www.slf4j.org">SLF4J</a> has the same set of methods
 * repeated with different names.
 */
public enum Level {

    TRACE {
        @Override
        boolean isEnabled(final Logger logger) {
            return logger.isTraceEnabled();
        }
        @Override
        void log(final Logger logger, final String message) {
            logger.trace(message);
        }
        @Override
        void log(final Logger logger, final String message, final Object arg1) {
            logger.trace(message, arg1);
        }
        @Override
        void log(final Logger logger, final String message, final Object arg1, final Object arg2) {
            logger.trace(message, arg1, arg2);
        }
        @Override
        void log(final Logger logger, final String message, final Object[] args) {
            logger.trace(message, args);
        }
        @Override
        void log(final Logger logger, final String message, final Throwable throwable) {
            logger.trace(message, throwable);
        }
        @Override
        boolean isEnabled(final Logger logger, final Marker marker) {
            return logger.isTraceEnabled(marker);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message) {
            logger.trace(marker, message);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object arg1) {
            logger.trace(marker, message, arg1);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object arg1, final Object arg2) {
            logger.trace(marker, message, arg1, arg2);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object[] args) {
            logger.trace(marker, message, args);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Throwable throwable) {
            logger.trace(marker, message, throwable);
        }
    },

    DEBUG {
        @Override
        boolean isEnabled(final Logger logger) {
            return logger.isDebugEnabled();
        }
        @Override
        void log(final Logger logger, final String message) {
            logger.debug(message);
        }
        @Override
        void log(final Logger logger, final String message, final Object arg1) {
            logger.debug(message, arg1);
        }
        @Override
        void log(final Logger logger, final String message, final Object arg1, final Object arg2) {
            logger.debug(message, arg1, arg2);
        }
        @Override
        void log(final Logger logger, final String message, final Object[] args) {
            logger.debug(message, args);
        }
        @Override
        void log(final Logger logger, final String message, final Throwable throwable) {
            logger.debug(message, throwable);
        }
        @Override
        boolean isEnabled(final Logger logger, final Marker marker) {
            return logger.isDebugEnabled(marker);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message) {
            logger.debug(marker, message);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object arg1) {
            logger.debug(marker, message, arg1);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object arg1, final Object arg2) {
            logger.debug(marker, message, arg1, arg2);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object[] args) {
            logger.debug(marker, message, args);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Throwable throwable) {
            logger.debug(marker, message, throwable);
        }
    },

    INFO {
        @Override
        boolean isEnabled(final Logger logger) {
            return logger.isInfoEnabled();
        }
        @Override
        void log(final Logger logger, final String message) {
            logger.info(message);
        }
        @Override
        void log(final Logger logger, final String message, final Object arg1) {
            logger.info(message, arg1);
        }
        @Override
        void log(final Logger logger, final String message, final Object arg1, final Object arg2) {
            logger.info(message, arg1, arg2);
        }
        @Override
        void log(final Logger logger, final String message, final Object[] args) {
            logger.info(message, args);
        }
        @Override
        void log(final Logger logger, final String message, final Throwable throwable) {
            logger.info(message, throwable);
        }
        @Override
        boolean isEnabled(final Logger logger, final Marker marker) {
            return logger.isInfoEnabled(marker);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message) {
            logger.info(marker, message);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object arg1) {
            logger.info(marker, message, arg1);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object arg1, final Object arg2) {
            logger.info(marker, message, arg1, arg2);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object[] args) {
            logger.info(marker, message, args);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Throwable throwable) {
            logger.info(marker, message, throwable);         }
    },

    WARN {
        @Override
        boolean isEnabled(final Logger logger) {
            return logger.isWarnEnabled();
        }
        @Override
        void log(final Logger logger, final String message) {
            logger.warn(message);
        }
        @Override
        void log(final Logger logger, final String message, final Object arg1) {
            logger.warn(message, arg1);
        }
        @Override
        void log(final Logger logger, final String message, final Object arg1, final Object arg2) {
            logger.warn(message, arg1, arg2);
        }
        @Override
        void log(final Logger logger, final String message, final Object[] args) {
            logger.warn(message, args);
        }
        @Override
        void log(final Logger logger, final String message, final Throwable throwable) {
            logger.warn(message, throwable);
        }
        @Override
        boolean isEnabled(final Logger logger, final Marker marker) {
            return logger.isWarnEnabled(marker);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message) {
            logger.warn(marker, message);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object arg1) {
            logger.warn(marker, message, arg1);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object arg1, final Object arg2) {
            logger.warn(marker, message, arg1, arg2);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object[] args) {
            logger.warn(marker, message, args);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Throwable throwable) {
            logger.warn(marker, message, throwable);
       }
    },

    ERROR {
        @Override
        boolean isEnabled(final Logger logger) {
            return logger.isErrorEnabled();
       }
        @Override
        void log(final Logger logger, final String message) {
            logger.error(message);
        }
        @Override
        void log(final Logger logger, final String message, final Object arg1) {
            logger.error(message, arg1);
        }
        @Override
        void log(final Logger logger, final String message, final Object arg1, final Object arg2) {
            logger.error(message, arg1, arg2);
        }
        @Override
        void log(final Logger logger, final String message, final Object[] args) {
            logger.error(message, args);
        }
        @Override
        void log(final Logger logger, final String message, final Throwable throwable) {
            logger.error(message, throwable);
        }
        @Override
        boolean isEnabled(final Logger logger, final Marker marker) {
            return logger.isErrorEnabled(marker);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message) {
            logger.error(marker, message);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object arg1) {
            logger.error(marker, message, arg1);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object arg1, final Object arg2) {
            logger.error(marker, message, arg1, arg2);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object[] args) {
            logger.error(marker, message, args);
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Throwable throwable) {
            logger.error(marker, message, throwable);
        }
    },

    OFF {
        @Override
        boolean isEnabled(final Logger logger) {
            return false;
        }
        @Override
        void log(final Logger logger, final String message) {
            // Do nothing
        }
        @Override
        void log(final Logger logger, final String message, final Object arg1) {
            // Do nothing
        }
        @Override
        void log(final Logger logger, final String message, final Object arg1, final Object arg2) {
            // Do nothing
        }
        @Override
        void log(final Logger logger, final String message, final Object[] args) {
            // Do nothing
        }
        @Override
        void log(final Logger logger, final String message, final Throwable throwable) {
            // Do nothing
        }
        @Override
        boolean isEnabled(final Logger logger, final Marker marker) {
            return false;
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message) {
            // Do nothing
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object arg1) {
            // Do nothing
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object arg1, final Object arg2) {
            // Do nothing
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Object[] args) {
            // Do nothing
        }
        @Override
        void log(final Logger logger, final Marker marker, final String message, final Throwable throwable) {
            // Do nothing
        }
    };

    private static final Set<Level> ALL_LEVELS = Collections.unmodifiableSet(EnumSet.allOf(Level.class));
    private static final Set<Level> ENABLABLE_LEVELS = Collections.unmodifiableSet(makeEnablabeValues());

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

    /**
     * @return an ImmutableSet containing the constants of this enum type
     */
    public static Set<Level> valueSet() {
        return ALL_LEVELS;
    }

    /**
     * @return an ImmutableSet containing the constants of this enum type other than OFF
     */
    public static Set<Level> enablableValueSet() {
        return ENABLABLE_LEVELS;
    }

    private static Set<Level> makeEnablabeValues() {
        EnumSet<Level> enabled = EnumSet.allOf(Level.class);
        enabled.remove(OFF);
        return enabled;
    }
}
