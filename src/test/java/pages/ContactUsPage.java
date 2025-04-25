package pages;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactUsPage extends BasePage {
    private final By emailAddress = By.xpath("//strong[text()='askomdch@gmail.com']");
    private final By contactUsText = By.xpath("//h1[text()='Contact Us']");

    @Override
    public boolean isDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddress)).isDisplayed();
    }

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    @SneakyThrows
    public String getEmailAddress() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddress)).getText();
    }
    @SneakyThrows
    public String getContactUsText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(contactUsText)).getText();
    }
}