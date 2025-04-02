package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public class StorePage extends BasePage{
    public StorePage(WebDriver driver) {
        super(driver);
    }
    private final By searchInput = By.cssSelector("#woocommerce-product-search-field-0");
    private final By searchBtn = By.xpath("//button[normalize-space()='Search']");
    private final By searchResult = By.cssSelector(".woocommerce-products-header__title.page-title");
    private final By addToCartBtn=By.cssSelector("a[aria-label='Add “Basic Blue Jeans” to your cart']");
    private final By viewCart=By.cssSelector("a[title='View cart']");
    private final By allSearchResult=By.xpath("//h2[@class='woocommerce-loop-product__title']");

    public StorePage enterTextToSearch(String textSearch){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput)).sendKeys(textSearch);
        return this;
    }
    public StorePage clickOnSearchBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
        return this;
    }
    public String getSearchTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(searchResult)).getText();
    }
    public StorePage clickAddToCart(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
        return this;
    }
    public CartPage clickViewCart() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(viewCart)).click();
        return new CartPage(driver);
    }

    public List<String> allSearchResults() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elementList = driver.findElements(allSearchResult);
        return elementList.stream().map(WebElement::getText).collect(Collectors.toList());
    }






}
