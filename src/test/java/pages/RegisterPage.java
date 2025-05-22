package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pojo.Register;
import utils.ui.ElementActions;
import utils.ui.SeleniumWaitHelper;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    ElementActions actions= new ElementActions(driver);

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
       return this.actions.isElementDisplay(ErrorMessage);
    }
    public RegisterPage goTo(String url) {
        this.driver.get(url);
        return this;
    }
    public RegisterPage registerUser(Register register){
        this.actions.sendKeysToElement(usernameField,register.getUsername());
        this.actions.sendKeysToElement(emailField,register.getEmailaddress());
        this.actions.sendKeysToElement(passwordField,register.getPassword());
        this.actions.clickElement(registerField);
        return this;
    }
    public void loginToApp(Register register){
        this.actions.sendKeysToElement(userName,register.getUsername());
        this.actions.sendKeysToElement(password,register.getPassword());
        this.actions.clickElement(loginBtn);
    }

}
