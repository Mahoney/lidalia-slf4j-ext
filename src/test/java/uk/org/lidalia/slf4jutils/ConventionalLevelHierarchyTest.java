package uk.org.lidalia.slf4jutils;

import org.junit.Test;
import uk.org.lidalia.slf4jext.ConventionalLevelHierarchy;

import static org.junit.Assert.assertThat;
import static uk.org.lidalia.test.Assert.isNotInstantiable;

public class ConventionalLevelHierarchyTest {
    @Test
    public void notInstantiable() throws Throwable {
        assertThat(ConventionalLevelHierarchy.class, isNotInstantiable());
    }
}
