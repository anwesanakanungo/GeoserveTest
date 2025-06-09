package testcases;

import config.ConfigReader;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenPage;
import pages.WomenPage;
import utils.assertutil.AssertUtils;

public class WomenPageTest extends BaseTest{
   private HomePage homePage;
    @Test
    public void testNoOfProductOnSale(){
        homePage = new HomePage(driver);
        WomenPage womenPage = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnWomen();
        AssertUtils.assertEquals(2, womenPage.totalSale(), "Total No of Women product on sale");
    }
    @Test
    public void testNoOfWomenProduct(){
        homePage = new HomePage(driver);
        WomenPage womenPage = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnWomen();
        AssertUtils.assertEquals(7, womenPage.totalWomenProductCount(), "Total No of Women product count");
    }
    @Test
    public void testFirstWomenProductName(){
        homePage = new HomePage(driver);
        WomenPage womenPage = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnWomen();
        AssertUtils.assertEquals("Anchor Bracelet", womenPage.firstWomenProductName(), "First Women product Name");
    }
}
