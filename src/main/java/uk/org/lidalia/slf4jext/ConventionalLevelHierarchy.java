package uk.org.lidalia.slf4jext;

import com.google.common.collect.ImmutableSet;

import static com.google.common.collect.Sets.immutableEnumSet;
import static uk.org.lidalia.slf4jext.Level.DEBUG;
import static uk.org.lidalia.slf4jext.Level.ERROR;
import static uk.org.lidalia.slf4jext.Level.INFO;
import static uk.org.lidalia.slf4jext.Level.TRACE;
import static uk.org.lidalia.slf4jext.Level.WARN;

/**
 * The conventional hierarchical notion of Levels, where info being enabled implies warn and error being enabled, is not a
 * requirement of the SLF4J API.  These constants are a shortcut if you wish to use traditional hierarchical setups.
 */
public final class ConventionalLevelHierarchy {

    /**
     * Levels that would be considered enabled in Log4J/Logback if a Logger was set to OFF.
     */
    public static final ImmutableSet<Level> OFF_LEVELS = ImmutableSet.of();

    /**
     * Levels that would be considered enabled in Log4J/Logback if a Logger was set to ERROR.
     */
    public static final ImmutableSet<Level> ERROR_LEVELS = immutableEnumSet(ERROR);

    /**
     * Levels that would be considered enabled in Log4J/Logback if a Logger was set to WARN.
     */
    public static final ImmutableSet<Level> WARN_LEVELS = immutableEnumSet(ERROR, WARN);

    /**
     * Levels that would be considered enabled in Log4J/Logback if a Logger was set to INFO.
     */
    public static final ImmutableSet<Level> INFO_LEVELS = immutableEnumSet(ERROR, WARN, INFO);

    /**
     * Levels that would be considered enabled in Log4J/Logback if a Logger was set to DEBUG.
     */
    public static final ImmutableSet<Level> DEBUG_LEVELS = immutableEnumSet(ERROR, WARN, INFO, DEBUG);

    /**
     * Levels that would be considered enabled in Log4J/Logback if a Logger was set to TRACE.
     */
    public static final ImmutableSet<Level> TRACE_LEVELS = immutableEnumSet(ERROR, WARN, INFO, DEBUG, TRACE);

    private ConventionalLevelHierarchy() {
        throw new UnsupportedOperationException("Not instantiable");
    }
}
