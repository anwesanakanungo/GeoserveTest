package testcases;

import config.ConfigReader;
import constants.FrameworkConstants;
import io.qameta.allure.*;
import lombok.SneakyThrows;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.StorePage;
import pojo.TestData;
import utils.JsonReader;

import java.util.List;
@Epic("ECommerce Test")
@Feature("Product Search test")
public class ProductSearchTest extends BaseTest{
    private HomePage homePage ;
    private String filePath = FrameworkConstants.JSON_TEST_DATA;
    TestData testData = JsonReader.readJson(filePath, TestData.class);
    @Story("Product Search test")
    @Severity(SeverityLevel.NORMAL)
    @SneakyThrows
    @Test
    public void productSearchTest(){
        homePage = new HomePage(driver);
        StorePage storePage= homePage.
                goTo(ConfigReader.getValue("base-url"))
                .clickOnStore()
                .enterTextToSearch(testData.getSearch())
                .clickOnSearchBtn();
        List<String> actualResult=storePage.allSearchResults();
        Assert.assertListContainsObject(actualResult,testData.getProductName(),"Search Contains message");

    }
}
