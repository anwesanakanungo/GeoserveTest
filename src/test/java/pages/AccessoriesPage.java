package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ui.ElementActions;

public class AccessoriesPage extends BasePage {
    ElementActions actions = new ElementActions(driver);
    private final By totalSale=By.xpath("//span[text()='Sale!']");
    private final By totalItems=By.xpath("//a[@class='ast-loop-product__link']");
    private final By sortDropDown=By.name("orderby");
    private final By firstSortItem=By.xpath("(//span[@class='woocommerce-Price-amount amount'])[5]");
    public AccessoriesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }
    public int totalSale(){
        return driver.findElements(totalSale).size();
    }
    public int totalAccessoriesProductCount(){
        return driver.findElements(totalItems).size();
    }
    public AccessoriesPage selectOrder(String dropDownValue){
        actions.selectFromDropdown(sortDropDown,select -> select.selectByVisibleText(dropDownValue));
        return this;
    }
   public String firstItemAfterHighToLow(){
       return actions.getText(firstSortItem);
   }
}
