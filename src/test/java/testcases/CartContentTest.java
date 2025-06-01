package testcases;
import config.ConfigReader;
import constants.FrameworkConstants;
import io.qameta.allure.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pojo.TestData;
import utils.assertutil.AssertUtils;
import utils.datautil.JsonReader;
@Epic("ECommerce Test")
@Feature("Cart content test")
@Slf4j
public class CartContentTest extends BaseTest {
    private final String filePath = FrameworkConstants.JSON_TEST_DATA;
    private final TestData testData = JsonReader.readJson(filePath, TestData.class);
    @Test
    @Story("Cart content test")
    @Severity(SeverityLevel.NORMAL)
    public void cartContentTest()  {
        HomePage homePage = new HomePage(driver);
        CartPage cartPage= homePage.
                goTo(ConfigReader.getValue("base-url"))
                .clickOnStore()
                .enterTextToSearch(testData.getSearch())
                .clickOnSearchBtn()
                .clickAddToCart()
                .clickViewCart();
        String actualResult= cartPage.getProductDetails();
       // Assert.assertEquals(actualResult,testData.getProductName());
       // log.info("Actual text{}expected{}", actualResult, testData.getProductName());
        AssertUtils.assertEquals(actualResult,testData.getProductName(),"Test data is equal");
    }
}
