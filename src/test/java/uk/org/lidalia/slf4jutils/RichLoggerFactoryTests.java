package uk.org.lidalia.slf4jutils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import uk.org.lidalia.slf4jext.Logger;
import uk.org.lidalia.slf4jext.LoggerFactory;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static uk.org.lidalia.test.Assert.assertNotInstantiable;

@RunWith(PowerMockRunner.class)
@PrepareForTest({org.slf4j.LoggerFactory.class})
public class RichLoggerFactoryTests {

    org.slf4j.Logger logger = mock(org.slf4j.Logger.class);

    @Before
    public void setUp() {
        mockStatic(org.slf4j.LoggerFactory.class);
    }

    @Test
    public void getLoggerByString() throws Exception {
        given(org.slf4j.LoggerFactory.getLogger("loggername")).willReturn(logger);

        Logger richLogger = LoggerFactory.getLogger("loggername");
        richLogger.debug("message");

        verify(logger).debug("message");
    }

    @Test
    public void getLoggerByClass() throws Exception {
        given(org.slf4j.LoggerFactory.getLogger(Object.class)).willReturn(logger);

        Logger richLogger = LoggerFactory.getLogger(Object.class);
        richLogger.debug("message");

        verify(logger).debug("message");
    }

    @Test
    public void notInstantiable() throws Throwable {
        assertNotInstantiable(LoggerFactory.class);
    }
}
