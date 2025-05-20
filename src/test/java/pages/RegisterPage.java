package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pojo.Register;
import utils.ui.SeleniumWaitHelper;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    SeleniumWaitHelper seleniumWaitHelper = new SeleniumWaitHelper(driver);

    private final By usernameField =By.id("reg_username");
    private final By emailField=By.id("reg_email");
    private final By passwordField=By.id("reg_password");
    private final By registerField=By.name("register");
    private final By userName=By.id("username");
    private final By password=By.id("password");
    private final By loginBtn=By.name("login");
    private final By ErrorMessage=By.cssSelector("div[id='content'] li:nth-child(1)");


    @Override
    public boolean isDisplayed() {
        return wait.until(ExpectedConditions.elementToBeClickable(ErrorMessage)).isDisplayed();
    }
    public RegisterPage goTo(String url) {
        this.driver.get(url);
        return this;
    }
    public RegisterPage registerUser(Register register){
        this.seleniumWaitHelper.waitForElement(usernameField).sendKeys(register.getUsername());
        this.seleniumWaitHelper.waitForElement(emailField).sendKeys(register.getEmailaddress());
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(register.getPassword());
        this.wait.until(ExpectedConditions.elementToBeClickable(registerField)).click();
        return this;
    }
    public void loginToApp(Register register){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys(register.getUsername());
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(register.getPassword());
        this.wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

}
