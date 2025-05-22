package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ui.ElementActions;

public class CartPage extends BasePage {
    private final By viewCart = By.xpath("//a[normalize-space()='Proceed to checkout']");
    private final By product = By.xpath("//a[text()='Basic Blue Jeans']");
    ElementActions actions=new ElementActions(driver);

    @Override
    public boolean isDisplayed() {
        return actions.isElementDisplay(viewCart);
    }

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage clickOnCart() {
        this.actions.clickElement(viewCart);
        return new CheckoutPage(driver);
    }

    public String getProductDetails() {
        return this.actions.getText(product);

    }
}
