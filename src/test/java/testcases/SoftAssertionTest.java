package testcases;

import lombok.var;
import org.testng.annotations.Test;
import utils.assertutil.SoftAssertUtils;

import java.util.Arrays;

public class SoftAssertionTest {
    @Test
    public void softAssertionTest() {
        var users = Arrays.asList("admin", "editor");
/*
        SoftAssertUtils.assertContains(users, "viewer", "Missing user: viewer");
        SoftAssertUtils.assertTrue(users.contains("admin"), "Admin should be present");

        SoftAssertUtils.assertAll();  // Reports all failures at once */
    }
}
