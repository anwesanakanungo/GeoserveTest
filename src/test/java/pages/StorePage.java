package pages;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ui.ElementActions;
import java.util.List;
import java.util.stream.Collectors;
@Slf4j
public class StorePage extends BasePage {
    ElementActions actions = new ElementActions(driver);
    private final By searchInput = By.cssSelector("#woocommerce-product-search-field-0");
    private final By searchBtn = By.xpath("//button[normalize-space()='Search']");
    private final By addToCartBtn = By.cssSelector("a[aria-label='Add “Basic Blue Jeans” to your cart']");
    private final By viewCart = By.cssSelector("a[title='View cart']");
    private final By allSearchResult = By.xpath("//h2[@class='woocommerce-loop-product__title']");
    private final By sale = By.xpath("//span[text()='Sale!']");
    private final By noOfProduct = By.xpath("//h2[@class='woocommerce-loop-product__title']");
   private final By nextPage=By.xpath("//a[@class='next page-numbers']");
    private final By lastPage=By.xpath("//a[@class='prev page-numbers']");
    private final By selectFromDropdown=By.id("product_cat");

    @Override
    public boolean isDisplayed() {
        return this.actions.isElementDisplay(searchInput);
    }

    public StorePage(WebDriver driver) {
        super(driver);
    }

    public StorePage enterTextToSearch(String textSearch) {
        this.actions.sendKeysToElement(searchInput, textSearch);
        log.info("Enter search data"+textSearch);
        return this;
    }

    public StorePage clickOnSearchBtn() {
        this.actions.clickElement(searchBtn);
        log.info("click on search button");
        return this;
    }

    public StorePage clickAddToCart() {
        this.actions.clickElement(addToCartBtn);
        log.info("click on add to cart button");
        return this;
    }

    public CartPage clickViewCart() {
        this.actions.clickElement(viewCart);
        log.info("click on view cart button");
        return new CartPage(driver);
    }

    public List<String> allSearchResults() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elementList = driver.findElements(allSearchResult);
        return elementList.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public int allSalesResults() {
        List<WebElement> elementList = driver.findElements(sale);
        log.info("Number of item on sale sale");
        return elementList.size();
    }

    public int allProductResults() {
        List<WebElement> elementList = driver.findElements(noOfProduct);
        log.info("Number of item on product: ");
        return elementList.size();
    }
    public StorePage goToSecondPage(){
        this.actions.clickElement(nextPage);
        log.info("click on next page");
        return this;
    }
    public boolean previousPageButtonExist( ){
        return actions.isElementDisplay(lastPage);
    }
   @SneakyThrows
   public MenPage selectingDropDown(){
        Thread.sleep(2000);
       actions.selectFromDropdown(selectFromDropdown,select -> select.getOptions().stream()
               .filter(opt -> opt.getText().contains("men"))
               .findFirst()
               .ifPresent(WebElement::click));
       log.info("selecting dropdown");
       return new MenPage(driver);
   }

}
