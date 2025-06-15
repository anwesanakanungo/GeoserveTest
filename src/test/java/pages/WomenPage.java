package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenPage extends BasePage{
    private ItemOnSaleAllPage itemOnSaleAllPage;

    public WomenPage(WebDriver driver) {
        super(driver);
        this.itemOnSaleAllPage=new ItemOnSaleAllPage(driver);
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }
    public int totalSale(){
        return driver.findElements(itemOnSaleAllPage.getTotalSale()).size();
    }
    public int totalProductCount(){
        return driver.findElements(itemOnSaleAllPage.getTotalWomenItems()).size();
    }
    public String firstProductName(){
        return driver.findElement(itemOnSaleAllPage.getFirstWomenItem()).getText();
    }

}
