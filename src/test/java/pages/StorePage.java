package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ui.ElementActions;

import java.util.List;
import java.util.stream.Collectors;

public class StorePage extends BasePage {
    ElementActions actions = new ElementActions(driver);
    private final By searchInput = By.cssSelector("#woocommerce-product-search-field-0");
    private final By searchBtn = By.xpath("//button[normalize-space()='Search']");
    private final By addToCartBtn = By.cssSelector("a[aria-label='Add “Basic Blue Jeans” to your cart']");
    private final By viewCart = By.cssSelector("a[title='View cart']");
    private final By allSearchResult = By.xpath("//h2[@class='woocommerce-loop-product__title']");

    @Override
    public boolean isDisplayed() {
        return this.actions.isElementDisplay(searchInput);
    }

    public StorePage(WebDriver driver) {
        super(driver);
    }

    public StorePage enterTextToSearch(String textSearch) {
        this.actions.sendKeysToElement(searchInput,textSearch);
        return this;
    }

    public StorePage clickOnSearchBtn() {
        this.actions.clickElement(searchBtn);
        return this;
    }

    public StorePage clickAddToCart() {
        this.actions.clickElement(addToCartBtn);
        return this;
    }

    public CartPage clickViewCart() {
        this.actions.clickElement(viewCart);
        return new CartPage(driver);
    }

    public List<String> allSearchResults() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elementList = driver.findElements(allSearchResult);
        return elementList.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
