package testcases;

import config.ConfigReader;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.assertutil.AssertUtils;

@Slf4j
public class HomePageFindMoreTest extends BaseTest{
    @Test
    public void findMoreTest(){
        HomePage homePage = new HomePage(driver);
    String expectedResult= homePage
            .goTo(ConfigReader.getValue("base-url"))
            .clickOnFindMore()
            .getContactUsText();
        AssertUtils.assertEquals("Contact Us",expectedResult,"Test data is equal");
        log.info("Actual text Contact Us expected{}", expectedResult);
    }
}
