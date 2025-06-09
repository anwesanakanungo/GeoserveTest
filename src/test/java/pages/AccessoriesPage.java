package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessoriesPage extends BasePage {
    private final By totalSale=By.xpath("//span[text()='Sale!']");
    private final By totalItems=By.xpath("//a[@class='ast-loop-product__link']");
    public AccessoriesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }
    public int totalSale(){
        return driver.findElements(totalSale).size();
    }
    public int totalAccessoriesProductCount(){
        return driver.findElements(totalItems).size();
    }

}
