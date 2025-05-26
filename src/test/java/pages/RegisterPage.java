package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pojo.Register;
import utils.ui.ElementActions;
@Slf4j
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
        log.info("login to register page");
        return this;
    }
    public RegisterPage registerUser(Register register){
        this.actions.sendKeysToElement(usernameField,register.getUsername());
        log.info("Enter login data");
        this.actions.sendKeysToElement(emailField,register.getEmailaddress());
        log.info("Enter email data");
        this.actions.sendKeysToElement(passwordField,register.getPassword());
        log.info("Enter password data");
        this.actions.clickElement(registerField);
        log.info("click on register user");
        return this;
    }
    public void loginToApp(Register register){
        this.actions.sendKeysToElement(userName,register.getUsername());
        log.info("Enter username data");
        this.actions.sendKeysToElement(password,register.getPassword());
        log.info("Enter password");
        this.actions.clickElement(loginBtn);
        log.info("click login button");
    }

}
