package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ui.ElementActions;

import static java.lang.Thread.sleep;

public class CheckoutPage extends BasePage {
    private final By firstName = By.id("billing_first_name");
    private final By lastName = By.id("billing_last_name");
    private final By companyName = By.id("billing_company");
    private final By addressName = By.id("billing_address_1");
    private final By zipName = By.id("billing_postcode");
    private final By emailId = By.id("billing_email");
    private final By cityId = By.id("billing_city");
    private final By placeOrderBtn = By.id("place_order");
    private final By orderConfirmation = By.xpath("//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received']");
    ElementActions actions = new ElementActions(driver);

    @Override
    public boolean isDisplayed() {
        return actions.isElementDisplay(firstName);
    }

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage enterFirstName(String firstname) {
        actions.sendKeysToElement(firstName,firstname);
        return this;
    }

    public CheckoutPage enterLastName(String lastname) {
        actions.sendKeysToElement(lastName,lastname);
        return this;
    }

    public CheckoutPage enterCompanyName(String companyname) {
        actions.sendKeysToElement(companyName,companyname);
        return this;
    }

    public CheckoutPage enterCityName(String cityname) {
        actions.sendKeysToElement(cityId,cityname);
        return this;
    }

    public CheckoutPage enterAddress(String address) {
        actions.sendKeysToElement(addressName,address);
        return this;
    }

    public CheckoutPage enterZip(String zip) {
        actions.sendKeysToElement(zipName,zip);
        return this;
    }

    public CheckoutPage enterEmail(String email) {
        actions.sendKeysToElement(emailId,email);
        return this;
    }

    public CheckoutPage clickPlaceOrderBtn() throws InterruptedException {
        sleep(3000);
        actions.clickElement(placeOrderBtn);
        return this;
    }

    public String getTitle() throws InterruptedException {
        sleep(4000);
        return driver.findElement(orderConfirmation).getText();
    }

}
