package uk.org.lidalia.slf4jext;

import org.slf4j.Marker;

import static uk.org.lidalia.slf4jext.Level.DEBUG;
import static uk.org.lidalia.slf4jext.Level.ERROR;
import static uk.org.lidalia.slf4jext.Level.INFO;
import static uk.org.lidalia.slf4jext.Level.TRACE;
import static uk.org.lidalia.slf4jext.Level.WARN;

@SuppressWarnings({ "PMD.ExcessivePublicCount", "PMD.TooManyMethods" })
public class ConvenientLogger implements org.slf4j.Logger {

    private final LightLogger decorated;

    public ConvenientLogger(final LightestLogger decorated) {
        this(new LightestLoggerToLightLoggerAdapter(decorated));
    }

    public ConvenientLogger(final LightLogger decorated) {
        this.decorated = decorated;
    }

    @Override
    public String getName() {
        return decorated.getName();
    }

    @Override
    public boolean isTraceEnabled() {
        return decorated.isEnabled(TRACE);
    }

    @Override
    public void trace(final String msg) {
        decorated.log(TRACE, msg);
    }

    @Override
    public void trace(final String format, final Object arg) {
        decorated.log(TRACE, format, arg);
    }

    @Override
    public void trace(final String format, final Object arg1, final Object arg2) {
        decorated.log(TRACE, format, arg1, arg2);
    }

    @Override
    public void trace(final String format, final Object... arguments) {
        decorated.log(TRACE, format, arguments);
    }

    @Override
    public void trace(final String msg, final Throwable throwable) {
        decorated.log(TRACE, msg, throwable);
    }

    @Override
    public boolean isTraceEnabled(final Marker marker) {
        return decorated.isEnabled(TRACE, marker);
    }

    @Override
    public void trace(final Marker marker, final String msg) {
        decorated.log(TRACE, marker, msg);
    }

    @Override
    public void trace(final Marker marker, final String format, final Object arg) {
        decorated.log(TRACE, marker, format, arg);
    }

    @Override
    public void trace(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.log(TRACE, marker, format, arg1, arg2);
    }

    @Override
    public void trace(final Marker marker, final String format, final Object... arguments) {
        decorated.log(TRACE, marker, format, arguments);
    }

    @Override
    public void trace(final Marker marker, final String msg, final Throwable throwable) {
        decorated.log(TRACE, marker, msg, throwable);
    }

    @Override
    public boolean isDebugEnabled() {
        return decorated.isEnabled(DEBUG);
    }

    @Override
    public void debug(final String msg) {
        decorated.log(DEBUG, msg);
    }

    @Override
    public void debug(final String format, final Object arg) {
        decorated.log(DEBUG, format, arg);
    }

    @Override
    public void debug(final String format, final Object arg1, final Object arg2) {
        decorated.log(DEBUG, format, arg1, arg2);
    }

    @Override
    public void debug(final String format, final Object... arguments) {
        decorated.log(DEBUG, format, arguments);
    }

    @Override
    public void debug(final String msg, final Throwable throwable) {
        decorated.log(DEBUG, msg, throwable);
    }

    @Override
    public boolean isDebugEnabled(final Marker marker) {
        return decorated.isEnabled(DEBUG, marker);
    }

    @Override
    public void debug(final Marker marker, final String msg) {
        decorated.log(DEBUG, marker, msg);
    }

    @Override
    public void debug(final Marker marker, final String format, final Object arg) {
        decorated.log(DEBUG, marker, format, arg);
    }

    @Override
    public void debug(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.log(DEBUG, marker, format, arg1, arg2);
    }

    @Override
    public void debug(final Marker marker, final String format, final Object... arguments) {
        decorated.log(DEBUG, marker, format, arguments);
    }

    @Override
    public void debug(final Marker marker, final String msg, final Throwable throwable) {
        decorated.log(DEBUG, marker, msg, throwable);
    }

    @Override
    public boolean isInfoEnabled() {
        return decorated.isEnabled(INFO);
    }

    @Override
    public void info(final String msg) {
        decorated.log(INFO, msg);
    }

    @Override
    public void info(final String format, final Object arg) {
        decorated.log(INFO, format, arg);
    }

    @Override
    public void info(final String format, final Object arg1, final Object arg2) {
        decorated.log(INFO, format, arg1, arg2);
    }

    @Override
    public void info(final String format, final Object... arguments) {
        decorated.log(INFO, format, arguments);
    }

    @Override
    public void info(final String msg, final Throwable throwable) {
        decorated.log(INFO, msg, throwable);
    }

    @Override
    public boolean isInfoEnabled(final Marker marker) {
        return decorated.isEnabled(INFO, marker);
    }

    @Override
    public void info(final Marker marker, final String msg) {
        decorated.log(INFO, marker, msg);
    }

    @Override
    public void info(final Marker marker, final String format, final Object arg) {
        decorated.log(INFO, marker, format, arg);
    }

    @Override
    public void info(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.log(INFO, marker, format, arg1, arg2);
    }

    @Override
    public void info(final Marker marker, final String format, final Object... arguments) {
        decorated.log(INFO, marker, format, arguments);
    }

    @Override
    public void info(final Marker marker, final String msg, final Throwable throwable) {
        decorated.log(INFO, marker, msg, throwable);
    }

    @Override
    public boolean isWarnEnabled() {
        return decorated.isEnabled(WARN);
    }

    @Override
    public void warn(final String msg) {
        decorated.log(WARN, msg);
    }

    @Override
    public void warn(final String format, final Object arg) {
        decorated.log(WARN, format, arg);
    }

    @Override
    public void warn(final String format, final Object... arguments) {
        decorated.log(WARN, format, arguments);
    }

    @Override
    public void warn(final String format, final Object arg1, final Object arg2) {
        decorated.log(WARN, format, arg1, arg2);
    }

    @Override
    public void warn(final String msg, final Throwable throwable) {
        decorated.log(WARN, msg, throwable);
    }

    @Override
    public boolean isWarnEnabled(final Marker marker) {
        return decorated.isEnabled(WARN, marker);
    }

    @Override
    public void warn(final Marker marker, final String msg) {
        decorated.log(WARN, marker, msg);
    }

    @Override
    public void warn(final Marker marker, final String format, final Object arg) {
        decorated.log(WARN, marker, format, arg);
    }

    @Override
    public void warn(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.log(WARN, marker, format, arg1, arg2);
    }

    @Override
    public void warn(final Marker marker, final String format, final Object... arguments) {
        decorated.log(WARN, marker, format, arguments);
    }

    @Override
    public void warn(final Marker marker, final String msg, final Throwable throwable) {
        decorated.log(WARN, marker, msg, throwable);
    }

    @Override
    public boolean isErrorEnabled() {
        return decorated.isEnabled(ERROR);
    }

    @Override
    public void error(final String msg) {
        decorated.log(ERROR, msg);
    }

    @Override
    public void error(final String format, final Object arg) {
        decorated.log(ERROR, format, arg);
    }

    @Override
    public void error(final String format, final Object arg1, final Object arg2) {
        decorated.log(ERROR, format, arg1, arg2);
    }

    @Override
    public void error(final String format, final Object... arguments) {
        decorated.log(ERROR, format, arguments);
    }

    @Override
    public void error(final String msg, final Throwable throwable) {
        decorated.log(ERROR, msg, throwable);
    }

    @Override
    public boolean isErrorEnabled(final Marker marker) {
        return decorated.isEnabled(ERROR, marker);
    }

    @Override
    public void error(final Marker marker, final String msg) {
        decorated.log(ERROR, marker, msg);
    }

    @Override
    public void error(final Marker marker, final String format, final Object arg) {
        decorated.log(ERROR, marker, format, arg);
    }

    @Override
    public void error(final Marker marker, final String format, final Object arg1, final Object arg2) {
        decorated.log(ERROR, marker, format, arg1, arg2);
    }

    @Override
    public void error(final Marker marker, final String format, final Object... arguments) {
        decorated.log(ERROR, marker, format, arguments);
    }

    @Override
    public void error(final Marker marker, final String msg, final Throwable throwable) {
        decorated.log(ERROR, marker, msg, throwable);
    }
}
