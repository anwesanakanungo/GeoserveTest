package utils.ui;

import constants.FrameworkConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWaitHelper {
    private WebDriver driver ;
    private WebDriverWait wait;

    public SeleniumWaitHelper(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement waitForElementToBeVisible(By locator) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(FrameworkConstants.DEFAULT_WAITING_TIME));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // 2. Wait using By locator and custom timeout
    public WebElement waitForElementToBeVisible(By locator, int timeoutInSeconds) {
        WebDriverWait customWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return customWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // 3. Wait using WebElement directly
    public WebElement waitForElementToBeVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public WebElement waitForElementToBePresent(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public WebElement waitForElementToBePresent(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(FrameworkConstants.DEFAULT_WAITING_TIME));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public WebElement waitForElementToBeClickable(By locator) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(FrameworkConstants.DEFAULT_WAITING_TIME));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // 2. Wait using By locator and custom timeout
    public WebElement waitForElementToBeClickable(By locator, int timeoutInSeconds) {
        WebDriverWait customWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return customWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // 3. Wait using WebElement directly
    public WebElement waitForElementToBeVisibleToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
