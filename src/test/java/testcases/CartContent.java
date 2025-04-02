package testcases;

import config.ConfigReader;
import constants.FrameworkConstants;
import io.qameta.allure.*;
import lombok.Data;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.StorePage;
import pojo.TestData;
import utils.JsonReader;
@Epic("ECommerce Test")
@Feature("Cart content test")

public class CartContent extends BaseTest {
    private HomePage homePage ;
    private String filePath = FrameworkConstants.JSON_TEST_DATA;
    private TestData testData = JsonReader.readJson(filePath, TestData.class);
    @Test
    @Story("Cart content test")
    @Severity(SeverityLevel.NORMAL)

    public void cartContenetTest() throws InterruptedException {
        homePage = new HomePage(driver);
        CartPage cartPage= homePage.
                goTo(ConfigReader.getValue("base-url"))
                .clickOnStore()
                .enterTextToSearch(testData.getSearch())
                .clickOnSearchbtn()
                .clickAddToCart()
                .clickViewCart();
        String actualResult= cartPage.productDetails();
        Assert.assertEquals(actualResult,testData.getProductName());

    }
}
