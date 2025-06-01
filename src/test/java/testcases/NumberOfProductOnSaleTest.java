package testcases;

import config.ConfigReader;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.StorePage;
import utils.assertutil.AssertUtils;

@Slf4j
public class NumberOfProductOnSaleTest extends BaseTest {
    private HomePage homePage;

    @Test
    public void testNumberOfProductsOnSale() {
        homePage = new HomePage(driver);
        int expectedResult = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnStore()
                .allSalesResults();
        //Assert.assertEquals(3, expectedResult);
        AssertUtils.assertEquals(3, expectedResult,"Test data is equal");
        log.info("Actual  sales is 3 expected =" +expectedResult);
    }

    @Test
    public void testNumberOfProducts() {
        homePage = new HomePage(driver);
        int expectedResult = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnStore()
                .allProductResults();
        //Assert.assertEquals(8, expectedResult);
        AssertUtils.assertEquals(8, expectedResult,"Test data is equal");
        log.info("Actual total is 8 expected={}", expectedResult);
    }

    @Test
    public void testNumberOfProductsOnSecondPage() {
        homePage = new HomePage(driver);
        int expectedResult = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnStore()
                .goToSecondPage()
                .allProductResults();
       // Assert.assertEquals(5, expectedResult);
        AssertUtils.assertEquals(5, expectedResult,"Test data is equal");
        log.info("Actual total in second page is 5 expected=" +expectedResult);
    }

    @Test
    public void testNumberOfProductsOnSecondPageOnSale() {
        homePage = new HomePage(driver);
        int expectedResult = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnStore()
                .goToSecondPage()
                .allSalesResults();
       // Assert.assertEquals(2, expectedResult);
        AssertUtils.assertEquals(2, expectedResult,"Test data is equal");
        log.info("Actual sale in second page is 2 expected =" +expectedResult);
    }

    @Test
    public void testTotalPage() {
        homePage = new HomePage(driver);
        StorePage store= homePage.goTo(ConfigReader.getValue("base-url"))
                .clickOnStore()
                .goToSecondPage();
        Assert.assertTrue(store.previousPageButtonExist());
        AssertUtils.assertTrue(store.previousPageButtonExist(),"Store button exist");

    }
}