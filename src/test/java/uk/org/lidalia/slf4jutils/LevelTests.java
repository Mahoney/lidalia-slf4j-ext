package uk.org.lidalia.slf4jutils;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static uk.org.lidalia.slf4jext.Level.DEBUG;
import static uk.org.lidalia.slf4jext.Level.ERROR;
import static uk.org.lidalia.slf4jext.Level.INFO;
import static uk.org.lidalia.slf4jext.Level.TRACE;
import static uk.org.lidalia.slf4jext.Level.WARN;

import java.util.EnumSet;
import java.util.Set;

import org.junit.Test;

import uk.org.lidalia.slf4jext.Level;

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
    public void enablableValueSetContains() {
        assertTrue(Level.enablableValueSet().equals(EnumSet.of(ERROR, WARN, INFO, DEBUG, TRACE)));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void enablableValueSetIsImmutable() {
        Set<Level> levels = Level.enablableValueSet();
        levels.remove(Level.INFO);
    }
}
