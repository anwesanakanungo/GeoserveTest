package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By storeLink=By.xpath("//a[text()='Store']");

    public HomePage goTo(String url){
        this.driver.get(url);
        return this;
    }
    public StorePage clickOnStore(){
        this.wait.until(ExpectedConditions.elementToBeClickable(storeLink)).click();
        return new StorePage(driver);
    }
}
