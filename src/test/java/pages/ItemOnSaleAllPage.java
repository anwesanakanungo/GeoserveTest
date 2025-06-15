package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemOnSaleAllPage extends BasePage{

    private final By totalSale=By.xpath("//span[text()='Sale!']");
    private final By totalWomenItems=By.xpath("//a[@class='ast-loop-product__link']");
    private final By firstWomenItem=By.xpath("(//a[@class='ast-loop-product__link'])[1]");
    public ItemOnSaleAllPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    public By getTotalSale() {
        return totalSale;
    }

    public By getTotalWomenItems() {
        return totalWomenItems;
    }

    public By getFirstWomenItem() {
        return firstWomenItem;
    }
}
