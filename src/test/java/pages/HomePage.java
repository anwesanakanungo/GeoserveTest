package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ui.ElementActions;
@Slf4j
public class HomePage extends BasePage {
    ElementActions actions = new ElementActions(driver);
    private final By storeLink = By.xpath("//a[text()='Store']");
    private final By menLink=By.xpath("//a[text()='Men']");
    private final By contactUsLink=By.xpath("//a[text()='Contact Us']");
    private final By findMore=By.xpath("//a[text()='Find More']");

    @Override
    public boolean isDisplayed() {
        return this.actions.isElementDisplay(storeLink);
    }

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public HomePage goTo(String url) {
        this.driver.get(url);
        log.info("Login to the website"  +url);
        return this;
    }

    public StorePage clickOnStore() {
        actions.clickElement(storeLink);
        log.info("Login to the website store link");
        return new StorePage(driver);
    }
    public MenPage clickOnMen() {
        actions.clickElement(menLink);
        log.info("Login to the website menu link");
        return new MenPage(driver);
    }
    public ContactUsPage clickOnContact() {
        actions.clickElement(contactUsLink);
        log.info("Login to the website contact us link");
        return new ContactUsPage(driver);
    }
    public ContactUsPage clickOnFindMore() {
        actions.clickElement(findMore);
        log.info("Login to the website find more link");
        return new ContactUsPage(driver);
    }
}
