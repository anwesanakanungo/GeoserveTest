package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    private final By storeLink = By.xpath("//a[text()='Store']");
    private final By menLink=By.xpath("//a[text()='Men']");
    private final By contactUsLink=By.xpath("//a[text()='Contact Us']");

    @Override
    public boolean isDisplayed() {
        return  this.wait.until(ExpectedConditions.elementToBeClickable(storeLink)).isDisplayed();
    }

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public HomePage goTo(String url) {
        this.driver.get(url);
        return this;
    }

    public StorePage clickOnStore() {
        this.wait.until(ExpectedConditions.elementToBeClickable(storeLink)).click();
        return new StorePage(driver);
    }
    public MenPage clickOnMen() {
        this.wait.until(ExpectedConditions.elementToBeClickable(menLink)).click();
        return new MenPage(driver);
    }
    public ContactUsPage clickOnContact() {
        this.wait.until(ExpectedConditions.elementToBeClickable(contactUsLink)).click();
        return new ContactUsPage(driver);
    }
}
