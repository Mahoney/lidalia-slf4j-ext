package uk.org.lidalia.slf4jutils;

import org.slf4j.Logger;
import org.slf4j.Marker;

public class RichLogger implements Logger {

    private final Logger decorated;

    public RichLogger(Logger decorated) {
        this.decorated = decorated;
    }

    public String getName() {
        return decorated.getName();
    }

    public boolean isEnabled(Level level) {
        return level.isEnabled(decorated);
    }

    public void log(Level level, String msg) {
        level.log(decorated, msg);
    }

    public void log(Level level, String format, Object arg) {
        level.log(decorated, format, arg);
    }

    public void log(Level level, String format, Object arg1, Object arg2) {
        level.log(decorated, format, arg1, arg2);
    }

    public void log(Level level, String format, Object... argArray) {
        level.log(decorated, format, argArray);
    }

    public void log(Level level, String msg, Throwable t) {
        level.log(decorated, msg, t);
    }

    public boolean isEnabled(Level level, Marker marker) {
        return level.isEnabled(decorated, marker);
    }

    public void log(Level level, Marker marker, String msg) {
        level.log(decorated, marker, msg);
    }

    public void log(Level level, Marker marker, String format, Object arg) {
        level.log(decorated, marker, format, arg);
    }

    public void log(Level level, Marker marker, String format, Object arg1, Object arg2) {
        level.log(decorated, marker, format, arg1, arg2);
    }

    public void log(Level level, Marker marker, String format, Object... argArray) {
        level.log(decorated, marker, format, argArray);
    }

    public void log(Level level, Marker marker, String msg, Throwable t) {
        level.log(decorated, marker, msg, t);
    }

    public boolean isTraceEnabled() {
        return decorated.isTraceEnabled();
    }

    public void trace(String msg) {
        decorated.trace(msg);
    }

    public void trace(String format, Object arg) {
        decorated.trace(format, arg);
    }

    public void trace(String format, Object arg1, Object arg2) {
        decorated.trace(format, arg1, arg2);
    }

    public void trace(String format, Object... argArray) {
        decorated.trace(format, argArray);
    }

    public void trace(String msg, Throwable t) {
        decorated.trace(msg, t);
    }

    public boolean isTraceEnabled(Marker marker) {
        return decorated.isTraceEnabled(marker);
    }

    public void trace(Marker marker, String msg) {
        decorated.trace(marker, msg);
    }

    public void trace(Marker marker, String format, Object arg) {
        decorated.trace(marker, format, arg);
    }

    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        decorated.trace(marker, format, arg1, arg2);
    }

    public void trace(Marker marker, String format, Object... argArray) {
        decorated.trace(marker, format, argArray);
    }

    public void trace(Marker marker, String msg, Throwable t) {
        decorated.trace(marker, msg, t);
    }

    public boolean isDebugEnabled() {
        return decorated.isDebugEnabled();
    }

    public void debug(String msg) {
        decorated.debug(msg);
    }

    public void debug(String format, Object arg) {
        decorated.debug(format, arg);
    }

    public void debug(String format, Object arg1, Object arg2) {
        decorated.debug(format, arg1, arg2);
    }

    public void debug(String format, Object... argArray) {
        decorated.debug(format, argArray);
    }

    public void debug(String msg, Throwable t) {
        decorated.debug(msg, t);
    }

    public boolean isDebugEnabled(Marker marker) {
        return decorated.isDebugEnabled(marker);
    }

    public void debug(Marker marker, String msg) {
        decorated.debug(marker, msg);
    }

    public void debug(Marker marker, String format, Object arg) {
        decorated.debug(marker, format, arg);
    }

    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        decorated.debug(marker, format, arg1, arg2);
    }

    public void debug(Marker marker, String format, Object... argArray) {
        decorated.debug(marker, format, argArray);
    }

    public void debug(Marker marker, String msg, Throwable t) {
        decorated.debug(marker, msg, t);
    }

    public boolean isInfoEnabled() {
        return decorated.isInfoEnabled();
    }

    public void info(String msg) {
        decorated.info(msg);
    }

    public void info(String format, Object arg) {
        decorated.info(format, arg);
    }

    public void info(String format, Object arg1, Object arg2) {
        decorated.info(format, arg1, arg2);
    }

    public void info(String format, Object... argArray) {
        decorated.info(format, argArray);
    }

    public void info(String msg, Throwable t) {
        decorated.info(msg, t);
    }

    public boolean isInfoEnabled(Marker marker) {
        return decorated.isInfoEnabled(marker);
    }

    public void info(Marker marker, String msg) {
        decorated.info(marker, msg);
    }

    public void info(Marker marker, String format, Object arg) {
        decorated.info(marker, format, arg);
    }

    public void info(Marker marker, String format, Object arg1, Object arg2) {
        decorated.info(marker, format, arg1, arg2);
    }

    public void info(Marker marker, String format, Object... argArray) {
        decorated.info(marker, format, argArray);
    }

    public void info(Marker marker, String msg, Throwable t) {
        decorated.info(marker, msg, t);
    }

    public boolean isWarnEnabled() {
        return decorated.isWarnEnabled();
    }

    public void warn(String msg) {
        decorated.warn(msg);
    }

    public void warn(String format, Object arg) {
        decorated.warn(format, arg);
    }

    public void warn(String format, Object... argArray) {
        decorated.warn(format, argArray);
    }

    public void warn(String format, Object arg1, Object arg2) {
        decorated.warn(format, arg1, arg2);
    }

    public void warn(String msg, Throwable t) {
        decorated.warn(msg, t);
    }

    public boolean isWarnEnabled(Marker marker) {
        return decorated.isWarnEnabled(marker);
    }

    public void warn(Marker marker, String msg) {
        decorated.warn(marker, msg);
    }

    public void warn(Marker marker, String format, Object arg) {
        decorated.warn(marker, format, arg);
    }

    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        decorated.warn(marker, format, arg1, arg2);
    }

    public void warn(Marker marker, String format, Object... argArray) {
        decorated.warn(marker, format, argArray);
    }

    public void warn(Marker marker, String msg, Throwable t) {
        decorated.warn(marker, msg, t);
    }

    public boolean isErrorEnabled() {
        return decorated.isErrorEnabled();
    }

    public void error(String msg) {
        decorated.error(msg);
    }

    public void error(String format, Object arg) {
        decorated.error(format, arg);
    }

    public void error(String format, Object arg1, Object arg2) {
        decorated.error(format, arg1, arg2);
    }

    public void error(String format, Object... argArray) {
        decorated.error(format, argArray);
    }

    public void error(String msg, Throwable t) {
        decorated.error(msg, t);
    }

    public boolean isErrorEnabled(Marker marker) {
        return decorated.isErrorEnabled(marker);
    }

    public void error(Marker marker, String msg) {
        decorated.error(marker, msg);
    }

    public void error(Marker marker, String format, Object arg) {
        decorated.error(marker, format, arg);
    }

    public void error(Marker marker, String format, Object arg1, Object arg2) {
        decorated.error(marker, format, arg1, arg2);
    }

    public void error(Marker marker, String format, Object... argArray) {
        decorated.error(marker, format, argArray);
    }

    public void error(Marker marker, String msg, Throwable t) {
        decorated.error(marker, msg, t);
    }
}
