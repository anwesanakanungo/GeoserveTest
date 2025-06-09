package testcases;

import config.ConfigReader;
import org.testng.annotations.Test;
import pages.AccessoriesPage;
import pages.HomePage;
import pages.WomenPage;
import utils.assertutil.AssertUtils;

public class AccessoriesTest extends BaseTest {
    private HomePage homePage;
    @Test
    public void testNoOfProductOnSale(){
        homePage = new HomePage(driver);
        AccessoriesPage accessoriesPage = homePage
                .goTo(ConfigReader.getValue("base-url"))
                        .clickOnAccessoriesLink();
        AssertUtils.assertEquals(1, accessoriesPage.totalSale(), "Total No of Women product on sale");
    }
    @Test
    public void testNoOfWomenProduct(){
        homePage = new HomePage(driver);
        AccessoriesPage accessoriesPage = homePage
                .goTo(ConfigReader.getValue("base-url"))
                .clickOnAccessoriesLink();
        AssertUtils.assertEquals(3, accessoriesPage.totalAccessoriesProductCount(), "Total No of Women product count");
    }

}
