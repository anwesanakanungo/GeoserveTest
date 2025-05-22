package utils.ui;

import constants.FrameworkConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementActions {
    private WebDriver driver;
    private SeleniumWaitHelper waitHelper;

    public ElementActions(WebDriver driver) {
        this.driver = driver;
        this.waitHelper = new SeleniumWaitHelper(driver);
    }
    // 1. Click using By
    public void clickElement(By locator) {
        WebElement element = waitHelper.waitForElementToBeClickable(locator);
        element.click();
    }

    // 2. Click using WebElement
    public void clickElement(WebElement element1) {
      WebElement element=waitHelper.waitForElementToBeVisible(element1);
        element.click();
    }

    // 3. Click with custom timeout
    public void clickElement(By locator, int timeout) {
        WebElement element = waitHelper.waitForElementToBePresent(locator,20);
        element.click();
    }

    // 4. JavaScript click
    public void clickElement(By locator, boolean useJavaScript) {
        WebElement element = waitHelper.waitForElementToBePresent(locator, 10);
        if (useJavaScript) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        } else {
            clickElement(locator);
        }
    }

    // 5. Send keys using By
    public void sendKeysToElement(By locator, String text) {
        WebElement element = waitHelper.waitForElementToBeVisible(locator);
        element.clear();
        element.sendKeys(text);
    }

    // 6. Send keys using WebElement
    public void sendKeysToElement(WebElement element, String text) {
       WebElement element1= waitHelper.waitForElementToBeVisible(element);
        element1.clear();
        element.sendKeys(text);
    }

    // 7. Send keys with custom timeout
    public void sendKeysToElement(By locator, String text, int timeout) {
        WebElement element = waitHelper.waitForElementToBeVisible(locator, timeout);
        element.clear();
        element.sendKeys(text);
    }

    // 8. Send keys using JS
    public void sendKeysUsingJS(By locator, String value) {
        WebElement element = waitHelper.waitForElementToBePresent(locator, 10);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input'));",
                element, value);
    }

    public void sendKeysUsingJS(WebElement element, String value) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input'));",
                element, value);
    }
    //Scroll to Element
    public void scrollToElement(By locator) {
        WebElement element = waitHelper.waitForElementToBePresent(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    //Scroll to Element
    public void scrollToElement(By locator,int timeout) {
        WebElement element = waitHelper.waitForElementToBePresent(locator,timeout);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    //getting text
    public String getText(By locator) {
        return waitHelper.waitForElementToBeVisible(locator).getText();
    }
    public boolean isElementDisplay(By locator) {
         return waitHelper.waitForElementToBeVisible(locator).isDisplayed();
    }

}
