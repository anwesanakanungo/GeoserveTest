package utils.assertutil;

import org.testng.Assert;

import java.util.Collection;

public class ListAssertUtils {
    public static <T> void assertContains(Collection<T> actualList, T expectedElement, String message) {
        Assert.assertTrue(actualList.contains(expectedElement), message);
    }

    public static <T> void assertContainsAll(Collection<T> actualList, Collection<T> expectedElements, String message) {
        Assert.assertTrue(actualList.containsAll(expectedElements), message);
    }
    public static <T> void assertNotContains(Collection<T> actualList, T expectedElement, String message) {
        Assert.assertFalse(actualList.contains(expectedElement), message);
    }

    public static <T> void assertNotContainsAll(Collection<T> actualList, Collection<T> expectedElements, String message) {
        Assert.assertFalse(actualList.containsAll(expectedElements), message);
    }
}
