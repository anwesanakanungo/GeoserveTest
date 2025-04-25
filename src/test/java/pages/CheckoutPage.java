package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    @Override
    public boolean isDisplayed() {
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).isDisplayed();
    }

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage enterFirstName(String firstname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(firstname);
        return this;
    }

    public CheckoutPage enterLastName(String lastname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys(lastname);
        return this;
    }

    public CheckoutPage enterCompanyName(String companyname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(companyName)).sendKeys(companyname);
        return this;
    }

    public CheckoutPage enterCityName(String cityname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityId)).sendKeys(cityname);
        return this;
    }

    public CheckoutPage enterAddress(String address) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addressName)).sendKeys(address);
        return this;
    }

    public CheckoutPage enterZip(String zip) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipName)).sendKeys(zip);
        return this;
    }

    public CheckoutPage enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailId)).sendKeys(email);
        return this;
    }

    public CheckoutPage clickPlaceOrderBtn() throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();
        return this;
    }

    public String getTitle() throws InterruptedException {
        Thread.sleep(4000);
        return driver.findElement(orderConfirmation).getText();
    }

}
