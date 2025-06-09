package utils.assertutil;

import org.testng.asserts.SoftAssert;

import java.util.Collection;

public class SoftAssertUtils {
    private static final ThreadLocal<SoftAssert> softAssert = ThreadLocal.withInitial(SoftAssert::new);

    public static <T> void assertEquals(T actual, T expected, String message) {
        softAssert.get().assertEquals(actual, expected, message);
    }

    public static <T> void assertContains(Collection<T> list, T element, String message) {
        softAssert.get().assertTrue(list.contains(element), message);
    }

    public static void assertTrue(boolean condition, String message) {
        softAssert.get().assertTrue(condition, message);
    }

    public static void assertAll() {
        softAssert.get().assertAll();
        softAssert.remove();  // Clean up for thread safety
    }
}
