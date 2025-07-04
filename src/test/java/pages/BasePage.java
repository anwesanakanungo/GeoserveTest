package pages;

import browser.DriverManager;
import constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public abstract boolean isDisplayed();
    public BasePage(WebDriver driver) {
        this.driver = driver;
        /* this.wait = new WebDriverWait(driver, Duration.ofSeconds(FrameworkConstants.DEFAULT_WAITING_TIME)); */
    }
}
