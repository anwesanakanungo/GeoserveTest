package testcases;

import config.ConfigReader;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
@Slf4j
public class HomePageFindMoreTest extends BaseTest{
    private HomePage homePage;
    @Test
    public void findMoreTest(){
     homePage=new HomePage(driver);
    String expectedResult= homePage
            .goTo(ConfigReader.getValue("base-url"))
            .clickOnFindMore()
            .getContactUsText();
    Assert.assertEquals("Contact Us",expectedResult);
    log.info("Actual text Contact Us expected" +expectedResult);
    }
}
