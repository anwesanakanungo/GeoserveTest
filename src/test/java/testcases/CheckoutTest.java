package testcases;

import config.ConfigReader;
import constants.FrameworkConstants;
import io.qameta.allure.*;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pojo.TestData;
import randomtestdata.RandomUtil;
import utils.assertutil.AssertUtils;
import utils.datautil.JsonReader;
@Slf4j
@Epic("ECommerce Test")
@Feature("Checkout test")
public class CheckoutTest extends BaseTest {
    private final String filePath = FrameworkConstants.JSON_TEST_DATA;
    private final TestData testData = JsonReader.readJson(filePath, TestData.class);

    @SneakyThrows
    @Story("Checkout test")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void cartContentTest() {
        HomePage homePage = new HomePage(driver);
        CheckoutPage checkoutPage = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnStore()
                .enterTextToSearch(testData.getSearch())
                .clickOnSearchBtn()
                .clickAddToCart()
                .clickViewCart()
                .clickOnCart()
                .enterFirstName(RandomUtil.getFirstName())
                .enterLastName(RandomUtil.getLastName())
                .enterAddress(RandomUtil.getAddress())
                .enterEmail(RandomUtil.getEmail())
                .enterCompanyName(RandomUtil.getCompany())
                .enterCityName(RandomUtil.getCity())
                .enterZip(RandomUtil.getNumber())
                .clickPlaceOrderBtn();
        String actualResult = checkoutPage.getTitle();
        AssertUtils.assertEquals(actualResult,testData.getCheckoutMessage(),"Test data is equal");
        log.info("Actual text{}expected{}", actualResult, testData.getCheckoutMessage());
    }
}