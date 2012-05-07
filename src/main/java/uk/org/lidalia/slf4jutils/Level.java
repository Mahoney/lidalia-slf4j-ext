package uk.org.lidalia.slf4jutils;

import org.slf4j.Logger;
import org.slf4j.Marker;

public enum Level {

    TRACE(LevelInts.TRACE_INT) {
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

    DEBUG(LevelInts.DEBUG_INT) {
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

    INFO(LevelInts.INFO_INT) {
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

    WARN(LevelInts.WARN_INT) {
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

    ERROR(LevelInts.ERROR_INT) {
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

    OFF(LevelInts.OFF_INT) {
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

    private final int level;

    private Level(int level) {
        this.level = level;
    }

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

    public boolean isTraceEnabled() {
        return level == LevelInts.TRACE_INT;
    }

    public boolean isDebugEnabled() {
        return level <= LevelInts.DEBUG_INT;
    }

    public boolean isInfoEnabled() {
        return level <= LevelInts.INFO_INT;
    }

    public boolean isWarnEnabled() {
        return level <= LevelInts.WARN_INT;
    }

    public boolean isErrorEnabled() {
        return level <= LevelInts.ERROR_INT;
    }

    private static class LevelInts {
        static final int TRACE_INT = 1;
        static final int DEBUG_INT = 2;
        static final int INFO_INT = 3;
        static final int WARN_INT = 4;
        static final int ERROR_INT = 5;
        static final int OFF_INT = 6;
    }
}

