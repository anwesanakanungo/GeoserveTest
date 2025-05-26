package testcases;

import config.ConfigReader;
import lombok.SneakyThrows;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenPage;
import pages.StorePage;

public class StorePageTest extends BaseTest{
    private HomePage homePage;
    @SneakyThrows
    @Test
    public void dropDownTest(){
        homePage= new HomePage(driver);
       MenPage menPage= homePage.goTo(ConfigReader.getValue("base-url"))
                .clickOnStore()
                .selectingDropDown();
        Assert.assertTrue(menPage.isDisplayed());
    }


}
