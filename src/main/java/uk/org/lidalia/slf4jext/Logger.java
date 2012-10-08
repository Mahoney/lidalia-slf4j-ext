package uk.org.lidalia.slf4jext;

import org.slf4j.Marker;

public class Logger implements org.slf4j.Logger { //NOPMD no choice but to implement all the methods on Logger

    private final org.slf4j.Logger decorated;

    public Logger(final org.slf4j.Logger decorated) {
        this.decorated = decorated;
    }

    public String getName() {
        return decorated.getName();
    }

    public boolean isEnabled(final Level level) {
        return level.isEnabled(decorated);
    }

    public void log(final Level level, final String msg) {
        level.log(decorated, msg);
    }

    public void log(final Level level, final String format, final Object arg) {
        level.log(decorated, format, arg);
    }

    public void log(final Level level, final String format, final Object arg1, final Object arg2) {
        level.log(decorated, format, arg1, arg2);
    }

    public void log(final Level level, final String format, final Object... argArray) {
        level.log(decorated, format, argArray);
    }

    public void log(final Level level, final String msg, final Throwable throwable) {
        level.log(decorated, msg, throwable);
    }

    public boolean isEnabled(final Level level, final Marker marker) {
        return level.isEnabled(decorated, marker);
    }

    public void log(final Level level, final Marker marker, final String msg) {
        level.log(decorated, marker, msg);
    }

    public void log(final Level level, final Marker marker, final String format, final Object arg) {
        level.log(decorated, marker, format, arg);
    }

    public void log(final Level level, final Marker marker, final String format, final Object arg1, final Object arg2) {
        level.log(decorated, marker, format, arg1, arg2);
    }

    public void log(final Level level, final Marker marker, final String format, final Object... argArray) {
        level.log(decorated, marker, format, argArray);
    }

    public void log(final Level level, final Marker marker, final String msg, final Throwable throwable) {
        level.log(decorated, marker, msg, throwable);
    }

    /* ALL OTHER METHODS SIMPLY DELEGATE TO THE SAME METHOD ON THE DECORATED LOGGER */

    public boolean isTraceEnabled() {
        return decorated.isTraceEnabled();
    }

    public void trace(final String msg) {
        decorated.trace(msg);
    }

    public void trace(final String format, final Object arg) {
        decorated.trace(format, arg);
    }

    public void trace(final String format, final Object arg1, final Object arg2) {
        decorated.trace(format, arg1, arg2);
    }

    public void trace(final String format, final Object... argArray) {
        decorated.trace(format, argArray);
    }

    public void trace(final String msg, final Throwable throwable) {
        decorated.trace(msg, throwable);
    }

    public boolean isTraceEnabled(final Marker marker) {
        return decorated.isTraceEnabled(marker);
    }

    public void trace(final Marker marker, final String msg) {
        decorated.trace(marker, msg);
    }

    public void trace(final Marker marker, final String format, final Object arg) {
        decorated.trace(marker, format, arg);
    }

    public void trace(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.trace(marker, format, arg1, arg2);
    }

    public void trace(final Marker marker, final String format, final Object... argArray) {
        decorated.trace(marker, format, argArray);
    }

    public void trace(final Marker marker, final String msg, final Throwable throwable) {
        decorated.trace(marker, msg, throwable);
    }

    public boolean isDebugEnabled() {
        return decorated.isDebugEnabled();
    }

    public void debug(final String msg) {
        decorated.debug(msg);
    }

    public void debug(final String format, final Object arg) {
        decorated.debug(format, arg);
    }

    public void debug(final String format, final Object arg1, final Object arg2) {
        decorated.debug(format, arg1, arg2);
    }

    public void debug(final String format, final Object... argArray) {
        decorated.debug(format, argArray);
    }

    public void debug(final String msg, final Throwable throwable) {
        decorated.debug(msg, throwable);
    }

    public boolean isDebugEnabled(final Marker marker) {
        return decorated.isDebugEnabled(marker);
    }

    public void debug(final Marker marker, final String msg) {
        decorated.debug(marker, msg);
    }

    public void debug(final Marker marker, final String format, final Object arg) {
        decorated.debug(marker, format, arg);
    }

    public void debug(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.debug(marker, format, arg1, arg2);
    }

    public void debug(final Marker marker, final String format, final Object... argArray) {
        decorated.debug(marker, format, argArray);
    }

    public void debug(final Marker marker, final String msg, final Throwable throwable) {
        decorated.debug(marker, msg, throwable);
    }

    public boolean isInfoEnabled() {
        return decorated.isInfoEnabled();
    }

    public void info(final String msg) {
        decorated.info(msg);
    }

    public void info(final String format, final Object arg) {
        decorated.info(format, arg);
    }

    public void info(final String format, final Object arg1, final Object arg2) {
        decorated.info(format, arg1, arg2);
    }

    public void info(final String format, final Object... argArray) {
        decorated.info(format, argArray);
    }

    public void info(final String msg, final Throwable throwable) {
        decorated.info(msg, throwable);
    }

    public boolean isInfoEnabled(final Marker marker) {
        return decorated.isInfoEnabled(marker);
    }

    public void info(final Marker marker, final String msg) {
        decorated.info(marker, msg);
    }

    public void info(final Marker marker, final String format, final Object arg) {
        decorated.info(marker, format, arg);
    }

    public void info(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.info(marker, format, arg1, arg2);
    }

    public void info(final Marker marker, final String format, final Object... argArray) {
        decorated.info(marker, format, argArray);
    }

    public void info(final Marker marker, final String msg, final Throwable throwable) {
        decorated.info(marker, msg, throwable);
    }

    public boolean isWarnEnabled() {
        return decorated.isWarnEnabled();
    }

    public void warn(final String msg) {
        decorated.warn(msg);
    }

    public void warn(final String format, final Object arg) {
        decorated.warn(format, arg);
    }

    public void warn(final String format, final Object... argArray) {
        decorated.warn(format, argArray);
    }

    public void warn(final String format, final Object arg1, final Object arg2) {
        decorated.warn(format, arg1, arg2);
    }

    public void warn(final String msg, final Throwable throwable) {
        decorated.warn(msg, throwable);
    }

    public boolean isWarnEnabled(final Marker marker) {
        return decorated.isWarnEnabled(marker);
    }

    public void warn(final Marker marker, final String msg) {
        decorated.warn(marker, msg);
    }

    public void warn(final Marker marker, final String format, final Object arg) {
        decorated.warn(marker, format, arg);
    }

    public void warn(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.warn(marker, format, arg1, arg2);
    }

    public void warn(final Marker marker, final String format, final Object... argArray) {
        decorated.warn(marker, format, argArray);
    }

    public void warn(final Marker marker, final String msg, final Throwable throwable) {
        decorated.warn(marker, msg, throwable);
    }

    public boolean isErrorEnabled() {
        return decorated.isErrorEnabled();
    }

    public void error(final String msg) {
        decorated.error(msg);
    }

    public void error(final String format, final Object arg) {
        decorated.error(format, arg);
    }

    public void error(final String format, final Object arg1, final Object arg2) {
        decorated.error(format, arg1, arg2);
    }

    public void error(final String format, final Object... argArray) {
        decorated.error(format, argArray);
    }

    public void error(final String msg, final Throwable throwable) {
        decorated.error(msg, throwable);
    }

    public boolean isErrorEnabled(final Marker marker) {
        return decorated.isErrorEnabled(marker);
    }

    public void error(final Marker marker, final String msg) {
        decorated.error(marker, msg);
    }

    public void error(final Marker marker, final String format, final Object arg) {
        decorated.error(marker, format, arg);
    }

    public void error(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.error(marker, format, arg1, arg2);
    }

    public void error(final Marker marker, final String format, final Object... argArray) {
        decorated.error(marker, format, argArray);
    }

    public void error(final Marker marker, final String msg, final Throwable throwable) {
        decorated.error(marker, msg, throwable);
    }
}
