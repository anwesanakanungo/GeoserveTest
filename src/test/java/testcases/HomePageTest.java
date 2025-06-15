package testcases;

import config.ConfigReader;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.assertutil.AssertUtils;

import java.util.List;

@Slf4j
public class HomePageTest extends BaseTest {
    private HomePage homePage ;
    @Test
    public void findMoreTest() {
       homePage = new HomePage(driver);
        String expectedResult = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnFindMore()
                .getContactUsText();
        AssertUtils.assertEquals("Contact Us", expectedResult, "Test data is equal");
        log.info("Actual text Contact Us expected{}", expectedResult);
    }

    @Test
    public void dropdownTest() {
        homePage = new HomePage(driver);
       List<String> expectedResult = homePage
                .goTo("https://askomdch.com/store/")
               .getDropDownValues();
        System.out.println(expectedResult);
    }
}