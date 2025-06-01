package testcases;

import config.ConfigReader;
import constants.FrameworkConstants;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import pojo.ContactUsPageTestData;
import utils.assertutil.AssertUtils;
import utils.datautil.JsonReader;
@Slf4j
public class ContactUsPageTest extends BaseTest{
    private final String filePath = FrameworkConstants.JSON_TEST_DATA_CONTACTUS;
    private final ContactUsPageTestData contactUsPageTestData = JsonReader.readJson(filePath, ContactUsPageTestData.class);
    @Test
    public void contactPageTest(){
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnContact();
        String actualResult= contactUsPage.getEmailAddress();
        Assert.assertEquals(actualResult,contactUsPageTestData.getEmail());
        log.info("Actual text" +actualResult +"expected" +contactUsPageTestData.getEmail());
    }
    @Test
    public void contactPageTextTest(){
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnContact();
        String actualResultText= contactUsPage.getContactUsText();
        //Assert.assertEquals(actualResultText,contactUsPageTestData.getTextMessage());
        AssertUtils.assertEquals(actualResultText,contactUsPageTestData.getTextMessage(),"Test data is equal");
        log.info("Actual text" +actualResultText +"expected" +contactUsPageTestData.getTextMessage());
    }
}
