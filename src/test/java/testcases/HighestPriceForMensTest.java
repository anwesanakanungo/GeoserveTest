package testcases;

import config.ConfigReader;
import constants.FrameworkConstants;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenPage;
import pojo.TestData;
import utils.datautil.JsonReader;

import java.util.List;
@Slf4j
public class HighestPriceForMensTest extends BaseTest {
    private final String filePath = FrameworkConstants.JSON_TEST_DATA;
    private final TestData testData = JsonReader.readJson(filePath, TestData.class);

    @SneakyThrows
    @Test
    public void testHighestPriceForMen() {
        HomePage homePage = new HomePage(driver);
        MenPage menPage = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnMen();
        List<String> priceList = menPage.getAllItemPriceMen();
        String actualPrice = priceList.stream().sorted().findFirst().get();
        Assert.assertEquals(actualPrice, testData.getHigestPriceMenItem());
        log.info("Actual text" +actualPrice +"expected" +testData.getHigestPriceMenItem());
    }
}
