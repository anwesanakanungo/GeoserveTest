package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenPage extends BasePage{
    private final By totalSale=By.xpath("//span[text()='Sale!']");
    private final By totalWomenItems=By.xpath("//a[@class='ast-loop-product__link']");
    private final By firstWomenItem=By.xpath("(//a[@class='ast-loop-product__link'])[1]");
    public WomenPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }
    public int totalSale(){
        return driver.findElements(totalSale).size();
    }
    public int totalWomenProductCount(){
        return driver.findElements(totalWomenItems).size();
    }
    public String firstWomenProductName(){
        return driver.findElement(firstWomenItem).getText();
    }


}
