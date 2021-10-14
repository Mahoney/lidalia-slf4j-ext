package uk.org.lidalia.slf4jutils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.powermock.api.mockito.PowerMockito.mock;
import static uk.org.lidalia.slf4jext.Level.DEBUG;
import static uk.org.lidalia.slf4jext.Level.ERROR;
import static uk.org.lidalia.slf4jext.Level.INFO;
import static uk.org.lidalia.slf4jext.Level.OFF;
import static uk.org.lidalia.slf4jext.Level.TRACE;
import static uk.org.lidalia.slf4jext.Level.WARN;
import static uk.org.lidalia.test.Values.uniqueValueFor;

import java.lang.reflect.Method;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Marker;

import uk.org.lidalia.slf4jext.DefaultLogger;
import uk.org.lidalia.slf4jext.Logger;

@RunWith(JUnitParamsRunner.class)
public class LoggerTests {

    org.slf4j.Logger decoratedLogger = mock(org.slf4j.Logger.class);
    Logger richLogger = new DefaultLogger(decoratedLogger);

    Marker marker = mock(Marker.class);
    String message = "message";
    Object arg1 = new Object();
    Object arg2 = new Object();
    Object arg3 = new Object();
    Object[] args = new Object[] { arg1, arg2, arg3 };
    Throwable throwable = new Throwable();

    public Object[] slf4jLoggerMethods() {
        return org.slf4j.Logger.class.getMethods();
    }
    @Test
    @Parameters(method = "slf4jLoggerMethods")
    public void richLoggerDelegatesLoggerMethodToDecoratedLogger(Method loggerMethod) throws Exception {
        Object[] args = buildParamsFor(loggerMethod);
        Class<?> returnType = loggerMethod.getReturnType();
        if (returnType == void.class) {
            loggerMethod.invoke(richLogger, args);
            loggerMethod.invoke(verify(decoratedLogger), args);
        } else {
            Object result = uniqueValueFor(returnType);
            given(loggerMethod.invoke(decoratedLogger, args)).willReturn(result);
            assertEquals("result of " + loggerMethod, result, loggerMethod.invoke(richLogger, args));
        }
    }

    @Test
    public void isEnabledTrace() {
        given(decoratedLogger.isTraceEnabled()).willReturn(true);
        assertTrue(richLogger.isEnabled(TRACE));

        given(decoratedLogger.isTraceEnabled()).willReturn(false);
        assertFalse(richLogger.isEnabled(TRACE));
    }

    @Test
    public void logTraceMessage() {
        richLogger.log(TRACE, message);
        verify(decoratedLogger).trace(message);
    }

    @Test
    public void logTraceMessageOneArg() {
        richLogger.log(TRACE, message, arg1);
        verify(decoratedLogger).trace(message, arg1);
    }

    @Test
    public void logTraceMessageTwoArgs() {
        richLogger.log(TRACE, message, arg1, arg2);
        verify(decoratedLogger).trace(message, arg1, arg2);
    }

    @Test
    public void logTraceMessageVarArgs() {
        richLogger.log(TRACE, message, arg1, arg2, arg3);
        verify(decoratedLogger).trace(message, args);
    }

    @Test
    public void logTraceMessageException() {
        richLogger.log(TRACE, message, throwable);
        verify(decoratedLogger).trace(message, throwable);
    }

    @Test
    public void isEnabledTraceMarker() {
        given(decoratedLogger.isTraceEnabled(marker)).willReturn(true);
        assertTrue(richLogger.isEnabled(TRACE, marker));

        given(decoratedLogger.isTraceEnabled(marker)).willReturn(false);
        assertFalse(richLogger.isEnabled(TRACE, marker));
    }

    @Test
    public void logTraceMarkerMessage() {
        richLogger.log(TRACE, marker, message);
        verify(decoratedLogger).trace(marker, message);
    }

    @Test
    public void logTraceMarkerMessageOneArg() {
        richLogger.log(TRACE, marker, message, arg1);
        verify(decoratedLogger).trace(marker, message, arg1);
    }

    @Test
    public void logTraceMarkerMessageTwoArgs() {
        richLogger.log(TRACE, marker, message, arg1, arg2);
        verify(decoratedLogger).trace(marker, message, arg1, arg2);
    }

    @Test
    public void logTraceMarkerMessageVarArgs() {
        richLogger.log(TRACE, marker, message, arg1, arg2, arg3);
        verify(decoratedLogger).trace(marker, message, args);
    }

    @Test
    public void logTraceMarkerMessageException() {
        richLogger.log(TRACE, marker, message, throwable);
        verify(decoratedLogger).trace(marker, message, throwable);
    }

    @Test
    public void isEnabledDebug() {
        given(decoratedLogger.isDebugEnabled()).willReturn(true);
        assertTrue(richLogger.isEnabled(DEBUG));

        given(decoratedLogger.isDebugEnabled()).willReturn(false);
        assertFalse(richLogger.isEnabled(DEBUG));
    }

    @Test
    public void logDebugMessage() {
        richLogger.log(DEBUG, message);
        verify(decoratedLogger).debug(message);
    }

    @Test
    public void logDebugMessageOneArg() {
        richLogger.log(DEBUG, message, arg1);
        verify(decoratedLogger).debug(message, arg1);
    }

    @Test
    public void logDebugMessageTwoArgs() {
        richLogger.log(DEBUG, message, arg1, arg2);
        verify(decoratedLogger).debug(message, arg1, arg2);
    }

    @Test
    public void logDebugMessageVarArgs() {
        richLogger.log(DEBUG, message, arg1, arg2, arg3);
        verify(decoratedLogger).debug(message, args);
    }

    @Test
    public void logDebugMessageException() {
        richLogger.log(DEBUG, message, throwable);
        verify(decoratedLogger).debug(message, throwable);
    }

    @Test
    public void isEnabledDebugMarker() {
        given(decoratedLogger.isDebugEnabled(marker)).willReturn(true);
        assertTrue(richLogger.isEnabled(DEBUG, marker));

        given(decoratedLogger.isDebugEnabled(marker)).willReturn(false);
        assertFalse(richLogger.isEnabled(DEBUG, marker));
    }

    @Test
    public void logDebugMarkerMessage() {
        richLogger.log(DEBUG, marker, message);
        verify(decoratedLogger).debug(marker, message);
    }

    @Test
    public void logDebugMarkerMessageOneArg() {
        richLogger.log(DEBUG, marker, message, arg1);
        verify(decoratedLogger).debug(marker, message, arg1);
    }

    @Test
    public void logDebugMarkerMessageTwoArgs() {
        richLogger.log(DEBUG, marker, message, arg1, arg2);
        verify(decoratedLogger).debug(marker, message, arg1, arg2);
    }

    @Test
    public void logDebugMarkerMessageVarArgs() {
        richLogger.log(DEBUG, marker, message, arg1, arg2, arg3);
        verify(decoratedLogger).debug(marker, message, args);
    }

    @Test
    public void logDebugMarkerMessageException() {
        richLogger.log(DEBUG, marker, message, throwable);
        verify(decoratedLogger).debug(marker, message, throwable);
    }

    @Test
    public void isEnabledInfo() {
        given(decoratedLogger.isInfoEnabled()).willReturn(true);
        assertTrue(richLogger.isEnabled(INFO));

        given(decoratedLogger.isInfoEnabled()).willReturn(false);
        assertFalse(richLogger.isEnabled(INFO));
    }

    @Test
    public void logInfoMessage() {
        richLogger.log(INFO, message);
        verify(decoratedLogger).info(message);
    }

    @Test
    public void logInfoMessageOneArg() {
        richLogger.log(INFO, message, arg1);
        verify(decoratedLogger).info(message, arg1);
    }

    @Test
    public void logInfoMessageTwoArgs() {
        richLogger.log(INFO, message, arg1, arg2);
        verify(decoratedLogger).info(message, arg1, arg2);
    }

    @Test
    public void logInfoMessageVarArgs() {
        richLogger.log(INFO, message, arg1, arg2, arg3);
        verify(decoratedLogger).info(message, args);
    }

    @Test
    public void logInfoMessageException() {
        richLogger.log(INFO, message, throwable);
        verify(decoratedLogger).info(message, throwable);
    }

    @Test
    public void isEnabledInfoMarker() {
        given(decoratedLogger.isInfoEnabled(marker)).willReturn(true);
        assertTrue(richLogger.isEnabled(INFO, marker));

        given(decoratedLogger.isInfoEnabled(marker)).willReturn(false);
        assertFalse(richLogger.isEnabled(INFO, marker));
    }

    @Test
    public void logInfoMarkerMessage() {
        richLogger.log(INFO, marker, message);
        verify(decoratedLogger).info(marker, message);
    }

    @Test
    public void logInfoMarkerMessageOneArg() {
        richLogger.log(INFO, marker, message, arg1);
        verify(decoratedLogger).info(marker, message, arg1);
    }

    @Test
    public void logInfoMarkerMessageTwoArgs() {
        richLogger.log(INFO, marker, message, arg1, arg2);
        verify(decoratedLogger).info(marker, message, arg1, arg2);
    }

    @Test
    public void logInfoMarkerMessageVarArgs() {
        richLogger.log(INFO, marker, message, arg1, arg2, arg3);
        verify(decoratedLogger).info(marker, message, args);
    }

    @Test
    public void logInfoMarkerMessageException() {
        richLogger.log(INFO, marker, message, throwable);
        verify(decoratedLogger).info(marker, message, throwable);
    }

    @Test
    public void isEnabledWarn() {
        given(decoratedLogger.isWarnEnabled()).willReturn(true);
        assertTrue(richLogger.isEnabled(WARN));

        given(decoratedLogger.isWarnEnabled()).willReturn(false);
        assertFalse(richLogger.isEnabled(WARN));
    }

    @Test
    public void logWarnMessage() {
        richLogger.log(WARN, message);
        verify(decoratedLogger).warn(message);
    }

    @Test
    public void logWarnMessageOneArg() {
        richLogger.log(WARN, message, arg1);
        verify(decoratedLogger).warn(message, arg1);
    }

    @Test
    public void logWarnMessageTwoArgs() {
        richLogger.log(WARN, message, arg1, arg2);
        verify(decoratedLogger).warn(message, arg1, arg2);
    }

    @Test
    public void logWarnMessageVarArgs() {
        richLogger.log(WARN, message, arg1, arg2, arg3);
        verify(decoratedLogger).warn(message, args);
    }

    @Test
    public void logWarnMessageException() {
        richLogger.log(WARN, message, throwable);
        verify(decoratedLogger).warn(message, throwable);
    }

    @Test
    public void isEnabledWarnMarker() {
        given(decoratedLogger.isWarnEnabled(marker)).willReturn(true);
        assertTrue(richLogger.isEnabled(WARN, marker));

        given(decoratedLogger.isWarnEnabled(marker)).willReturn(false);
        assertFalse(richLogger.isEnabled(WARN, marker));
    }

    @Test
    public void logWarnMarkerMessage() {
        richLogger.log(WARN, marker, message);
        verify(decoratedLogger).warn(marker, message);
    }

    @Test
    public void logWarnMarkerMessageOneArg() {
        richLogger.log(WARN, marker, message, arg1);
        verify(decoratedLogger).warn(marker, message, arg1);
    }

    @Test
    public void logWarnMarkerMessageTwoArgs() {
        richLogger.log(WARN, marker, message, arg1, arg2);
        verify(decoratedLogger).warn(marker, message, arg1, arg2);
    }

    @Test
    public void logWarnMarkerMessageVarArgs() {
        richLogger.log(WARN, marker, message, arg1, arg2, arg3);
        verify(decoratedLogger).warn(marker, message, args);
    }

    @Test
    public void logWarnMarkerMessageException() {
        richLogger.log(WARN, marker, message, throwable);
        verify(decoratedLogger).warn(marker, message, throwable);
    }

    @Test
    public void isEnabledError() {
        given(decoratedLogger.isErrorEnabled()).willReturn(true);
        assertTrue(richLogger.isEnabled(ERROR));

        given(decoratedLogger.isErrorEnabled()).willReturn(false);
        assertFalse(richLogger.isEnabled(ERROR));
    }

    @Test
    public void logErrorMessage() {
        richLogger.log(ERROR, message);
        verify(decoratedLogger).error(message);
    }

    @Test
    public void logErrorMessageOneArg() {
        richLogger.log(ERROR, message, arg1);
        verify(decoratedLogger).error(message, arg1);
    }

    @Test
    public void logErrorMessageTwoArgs() {
        richLogger.log(ERROR, message, arg1, arg2);
        verify(decoratedLogger).error(message, arg1, arg2);
    }

    @Test
    public void logErrorMessageVarArgs() {
        richLogger.log(ERROR, message, arg1, arg2, arg3);
        verify(decoratedLogger).error(message, args);
    }

    @Test
    public void logErrorMessageException() {
        richLogger.log(ERROR, message, throwable);
        verify(decoratedLogger).error(message, throwable);
    }

    @Test
    public void isEnabledErrorMarker() {
        given(decoratedLogger.isErrorEnabled(marker)).willReturn(true);
        assertTrue(richLogger.isEnabled(ERROR, marker));

        given(decoratedLogger.isErrorEnabled(marker)).willReturn(false);
        assertFalse(richLogger.isEnabled(ERROR, marker));
    }

    @Test
    public void logErrorMarkerMessage() {
        richLogger.log(ERROR, marker, message);
        verify(decoratedLogger).error(marker, message);
    }

    @Test
    public void logErrorMarkerMessageOneArg() {
        richLogger.log(ERROR, marker, message, arg1);
        verify(decoratedLogger).error(marker, message, arg1);
    }

    @Test
    public void logErrorMarkerMessageTwoArgs() {
        richLogger.log(ERROR, marker, message, arg1, arg2);
        verify(decoratedLogger).error(marker, message, arg1, arg2);
    }

    @Test
    public void logErrorMarkerMessageVarArgs() {
        richLogger.log(ERROR, marker, message, arg1, arg2, arg3);
        verify(decoratedLogger).error(marker, message, args);
    }

    @Test
    public void logErrorMarkerMessageException() {
        richLogger.log(ERROR, marker, message, throwable);
        verify(decoratedLogger).error(marker, message, throwable);
    }

    @Test
    public void isEnabledOff() {
        assertFalse(richLogger.isEnabled(OFF));
    }

    @Test
    public void logOffMessage() {
        richLogger.log(OFF, message);
        verifyZeroInteractions(decoratedLogger);
    }

    @Test
    public void logOffMessageOneArg() {
        richLogger.log(OFF, message, arg1);
        verifyZeroInteractions(decoratedLogger);
    }

    @Test
    public void logOffMessageTwoArgs() {
        richLogger.log(OFF, message, arg1, arg2);
        verifyZeroInteractions(decoratedLogger);
    }

    @Test
    public void logOffMessageVarArgs() {
        richLogger.log(OFF, message, arg1, arg2, arg3);
        verifyZeroInteractions(decoratedLogger);
    }

    @Test
    public void logOffMessageException() {
        richLogger.log(OFF, message, throwable);
        verifyZeroInteractions(decoratedLogger);
    }

    @Test
    public void isEnabledOffMarker() {
        assertFalse(richLogger.isEnabled(OFF, marker));
    }

    @Test
    public void logOffMarkerMessage() {
        richLogger.log(OFF, marker, message);
        verifyZeroInteractions(decoratedLogger);
    }

    @Test
    public void logOffMarkerMessageOneArg() {
        richLogger.log(OFF, marker, message, arg1);
        verifyZeroInteractions(decoratedLogger);
    }

    @Test
    public void logOffMarkerMessageTwoArgs() {
        richLogger.log(OFF, marker, message, arg1, arg2);
        verifyZeroInteractions(decoratedLogger);
    }

    @Test
    public void logOffMarkerMessageVarArgs() {
        richLogger.log(OFF, marker, message, arg1, arg2, arg3);
        verifyZeroInteractions(decoratedLogger);
    }

    @Test
    public void logOffMarkerMessageException() {
        richLogger.log(OFF, marker, message, throwable);
        verifyZeroInteractions(decoratedLogger);
    }

    @Test
    public void traceMessageVarArgs() {
        richLogger.trace(message, arg1, arg2, arg3);
        verify(decoratedLogger).trace(message, args);
    }

    @Test
    public void traceMarkerMessageVarArgs() {
        richLogger.trace(marker, message, arg1, arg2, arg3);
        verify(decoratedLogger).trace(marker, message, args);
    }

    @Test
    public void debugMessageVarArgs() {
        richLogger.debug(message, arg1, arg2, arg3);
        verify(decoratedLogger).debug(message, args);
    }

    @Test
    public void debugMarkerMessageVarArgs() {
        richLogger.debug(marker, message, arg1, arg2, arg3);
        verify(decoratedLogger).debug(marker, message, args);
    }

    @Test
    public void infoMessageVarArgs() {
        richLogger.info(message, arg1, arg2, arg3);
        verify(decoratedLogger).info(message, args);
    }

    @Test
    public void infoMarkerMessageVarArgs() {
        richLogger.info(marker, message, arg1, arg2, arg3);
        verify(decoratedLogger).info(marker, message, args);
    }

    @Test
    public void warnMessageVarArgs() {
        richLogger.warn(message, arg1, arg2, arg3);
        verify(decoratedLogger).warn(message, args);
    }

    @Test
    public void warnMarkerMessageVarArgs() {
        richLogger.warn(marker, message, arg1, arg2, arg3);
        verify(decoratedLogger).warn(marker, message, args);
    }

    @Test
    public void errorMessageVarArgs() {
        richLogger.error(message, arg1, arg2, arg3);
        verify(decoratedLogger).error(message, args);
    }

    @Test
    public void errorMarkerMessageVarArgs() {
        richLogger.error(marker, message, arg1, arg2, arg3);
        verify(decoratedLogger).error(marker, message, args);
    }

    private Object[] buildParamsFor(Method loggerMethod) throws Exception {
        Class<?>[] parameterTypes = loggerMethod.getParameterTypes();
        Object[] uniqueValues = new Object[parameterTypes.length];
        for (int i = 0; i < uniqueValues.length; i++) {
            uniqueValues[i] = uniqueValueFor(parameterTypes[i]);
        }
        return uniqueValues;
    }
}
