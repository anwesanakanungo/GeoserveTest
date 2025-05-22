package pages;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ui.ElementActions;
import utils.ui.SeleniumWaitHelper;


public class ContactUsPage extends BasePage {
    private final By emailAddress = By.xpath("//strong[text()='askomdch@gmail.com']");
    private final By contactUsText = By.xpath("//h1[text()='Contact Us']");
    ElementActions actions = new ElementActions(driver);
    @Override
    public boolean isDisplayed() {
        return actions.isElementDisplay(emailAddress);
    }

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public String getEmailAddress() {
        return actions.getText(emailAddress);
    }
    @SneakyThrows
    public String getContactUsText() {
        return actions.getText(contactUsText);
    }
}