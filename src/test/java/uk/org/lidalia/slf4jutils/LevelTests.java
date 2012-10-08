package uk.org.lidalia.slf4jutils;

import org.junit.Test;

import java.util.Set;

import uk.org.lidalia.slf4jext.Level;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static uk.org.lidalia.slf4jext.Level.DEBUG;
import static uk.org.lidalia.slf4jext.Level.ERROR;
import static uk.org.lidalia.slf4jext.Level.INFO;
import static uk.org.lidalia.slf4jext.Level.OFF;
import static uk.org.lidalia.slf4jext.Level.TRACE;
import static uk.org.lidalia.slf4jext.Level.WARN;

public class LevelTests {

    @Test
    public void valueSet() {
        assertArrayEquals(Level.values(), Level.valueSet().toArray());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void valueSetIsImmutable() {
        Set<Level> levels = Level.valueSet();
        levels.remove(INFO);
    }

    @Test
    public void enablableValueSet() {
        assertFalse(Level.enablableValueSet() + " should not contain " + OFF, Level.enablableValueSet().contains(OFF));
        for (Level level : asList(ERROR, WARN, INFO, DEBUG, TRACE)) {
            assertTrue(Level.enablableValueSet() + " should contain " + level, Level.enablableValueSet().contains(level));
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void enablableValueSetIsImmutable() {
        Set<Level> levels = Level.enablableValueSet();
        levels.remove(Level.INFO);
    }
}
