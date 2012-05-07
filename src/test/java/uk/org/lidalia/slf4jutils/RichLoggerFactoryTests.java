package uk.org.lidalia.slf4jutils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static uk.org.lidalia.test.Assert.assertNotInstantiable;

@RunWith(PowerMockRunner.class)
@PrepareForTest({LoggerFactory.class})
public class RichLoggerFactoryTests {

    Logger logger = mock(Logger.class);

    @Before
    public void setUp() {
        mockStatic(LoggerFactory.class);
    }

    @Test
    public void getLoggerByString() throws Exception {
        given(LoggerFactory.getLogger("loggername")).willReturn(logger);

        RichLogger richLogger = RichLoggerFactory.getLogger("loggername");
        richLogger.debug("message");

        verify(logger).debug("message");
    }

    @Test
    public void getLoggerByClass() throws Exception {
        given(LoggerFactory.getLogger(Object.class)).willReturn(logger);

        RichLogger richLogger = RichLoggerFactory.getLogger(Object.class);
        richLogger.debug("message");

        verify(logger).debug("message");
    }

    @Test
    public void notInstantiable() throws Throwable {
        assertNotInstantiable(RichLoggerFactory.class);
    }
}
