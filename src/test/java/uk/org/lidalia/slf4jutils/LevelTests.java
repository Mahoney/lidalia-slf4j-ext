package uk.org.lidalia.slf4jutils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LevelTests {
    @Test
    public void isTraceEnabled() throws Exception {

        assertTrue(Level.TRACE.isTraceEnabled());
        assertFalse(Level.DEBUG.isTraceEnabled());
        assertFalse(Level.INFO.isTraceEnabled());
        assertFalse(Level.WARN.isTraceEnabled());
        assertFalse(Level.ERROR.isTraceEnabled());
        assertFalse(Level.OFF.isTraceEnabled());
    }

    @Test
    public void isDebugEnabled() throws Exception {
        assertTrue(Level.TRACE.isDebugEnabled());
        assertTrue(Level.DEBUG.isDebugEnabled());
        assertFalse(Level.INFO.isDebugEnabled());
        assertFalse(Level.WARN.isDebugEnabled());
        assertFalse(Level.ERROR.isDebugEnabled());
        assertFalse(Level.OFF.isDebugEnabled());
    }

    @Test
    public void isInfoEnabled() throws Exception {
        assertTrue(Level.TRACE.isInfoEnabled());
        assertTrue(Level.DEBUG.isInfoEnabled());
        assertTrue(Level.INFO.isInfoEnabled());
        assertFalse(Level.WARN.isInfoEnabled());
        assertFalse(Level.ERROR.isInfoEnabled());
        assertFalse(Level.OFF.isInfoEnabled());
    }

    @Test
    public void isWarnEnabled() throws Exception {
        assertTrue(Level.TRACE.isWarnEnabled());
        assertTrue(Level.DEBUG.isWarnEnabled());
        assertTrue(Level.INFO.isWarnEnabled());
        assertTrue(Level.WARN.isWarnEnabled());
        assertFalse(Level.ERROR.isWarnEnabled());
        assertFalse(Level.OFF.isWarnEnabled());
    }

    @Test
    public void isErrorEnabled() throws Exception {
        assertTrue(Level.TRACE.isErrorEnabled());
        assertTrue(Level.DEBUG.isErrorEnabled());
        assertTrue(Level.INFO.isErrorEnabled());
        assertTrue(Level.WARN.isErrorEnabled());
        assertTrue(Level.ERROR.isErrorEnabled());
        assertFalse(Level.OFF.isErrorEnabled());
    }
}
