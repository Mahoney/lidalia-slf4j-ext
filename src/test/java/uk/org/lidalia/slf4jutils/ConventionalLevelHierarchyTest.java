package uk.org.lidalia.slf4jutils;

import org.junit.Test;
import uk.org.lidalia.slf4jext.ConventionalLevelHierarchy;
import uk.org.lidalia.test.Assert;

public class ConventionalLevelHierarchyTest {
    @Test
    public void notInstantiable() throws Throwable {
        Assert.assertNotInstantiable(ConventionalLevelHierarchy.class);
    }
}
