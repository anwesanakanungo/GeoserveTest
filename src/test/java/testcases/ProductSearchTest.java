package testcases;

import config.ConfigReader;
import constants.FrameworkConstants;
import io.qameta.allure.*;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.StorePage;
import pojo.TestData;
import utils.assertutil.ListAssertUtils;
import utils.datautil.JsonReader;

import java.util.List;

@Epic("ECommerce Test")
@Feature("Product Search test")
@Slf4j
public class ProductSearchTest extends BaseTest {
    private final String filePath = FrameworkConstants.JSON_TEST_DATA;
    private final TestData testData = JsonReader.readJson(filePath, TestData.class);

    @Story("Product Search test")
    @Severity(SeverityLevel.NORMAL)
    @SneakyThrows
    @Test
    public void productSearchTest() {
        HomePage homePage = new HomePage(driver);
        StorePage storePage = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnStore()
                .enterTextToSearch(testData.getSearch())
                .clickOnSearchBtn();
        List<String> actualResult = storePage.allSearchResults();
       // Assert.assertListContainsObject(actualResult, testData.getProductName(), "Search Contains message");
        ListAssertUtils.assertContains(actualResult, testData.getProductName(), "Search Contains message");
        log.info("Actual result{}expected= {}", actualResult, testData.getProductName());
    }
}
