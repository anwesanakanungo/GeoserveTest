package utils.assertutil;

import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
@Slf4j
public class AssertUtils {
    public static <T> void assertEquals(T actual, T expected, String message) {
        Assert.assertEquals(actual, expected, message);
        log.info("Actual {}expected{}", actual, expected);
    }
    public static void assertTrue(boolean condition, String message) {
        Assert.assertTrue(condition, message);
        log.info("Actual {}expected", "" + true);
    }

    public static void assertFalse(boolean condition, String message) {
        Assert.assertFalse(condition, message);
        log.info("assert false");
    }

    public static void fail(String message) {
        Assert.fail(message);
    }
}
