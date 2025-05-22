package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ui.ElementActions;

public class HomePage extends BasePage {
    ElementActions actions = new ElementActions(driver);
    private final By storeLink = By.xpath("//a[text()='Store']");
    private final By menLink=By.xpath("//a[text()='Men']");
    private final By contactUsLink=By.xpath("//a[text()='Contact Us']");

    @Override
    public boolean isDisplayed() {
        return this.actions.isElementDisplay(storeLink);
    }

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public HomePage goTo(String url) {
        this.driver.get(url);
        return this;
    }

    public StorePage clickOnStore() {
        actions.clickElement(storeLink);
        return new StorePage(driver);
    }
    public MenPage clickOnMen() {
        actions.clickElement(menLink);
        return new MenPage(driver);
    }
    public ContactUsPage clickOnContact() {
        actions.clickElement(contactUsLink);
        return new ContactUsPage(driver);
    }
}
