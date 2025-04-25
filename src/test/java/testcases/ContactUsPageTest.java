package testcases;

import config.ConfigReader;
import constants.FrameworkConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import pages.MenPage;
import pojo.ContactUsPageTestData;
import pojo.TestData;
import utils.JsonReader;

public class ContactUsPageTest extends BaseTest{
    private final String filePath = FrameworkConstants.JSON_TEST_DATA_COTACTUSPAGE;
    private final ContactUsPageTestData contactUsPageTestData = JsonReader.readJson(filePath, ContactUsPageTestData.class);
    @Test
    public void contactPageTest(){
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnContact();
        String actaulResult= contactUsPage.getEmailAddress();
        Assert.assertEquals(actaulResult,contactUsPageTestData.getEmail());
    }
    @Test
    public void contactPageTextTest(){
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnContact();
        String actaulResultText= contactUsPage.getContactUsText();
        Assert.assertEquals(actaulResultText,contactUsPageTestData.getTextMessage());
    }
}
