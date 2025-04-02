package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }
    private final By viewCart=By.xpath("//a[normalize-space()='Proceed to checkout']");
    private final By product=By.xpath("//a[text()='Basic Blue Jeans']");

    public CheckoutPage clickOnCart(){
        wait.until(ExpectedConditions.elementToBeClickable(viewCart)).click();
        return new CheckoutPage(driver);
    }
   public String productDetails(){
    return wait.until(ExpectedConditions.visibilityOfElementLocated(product)).getText();
    }
}
