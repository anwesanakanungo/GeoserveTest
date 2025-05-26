package pages;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ui.ElementActions;

import java.util.List;
import java.util.stream.Collectors;
public class MenPage extends BasePage{
    public MenPage(WebDriver driver) {
        super(driver);
    }
    ElementActions actions=new ElementActions(driver);
    private final By searchAllPrice=By.xpath("//span[@class='woocommerce-Price-amount amount']");
@SneakyThrows
    public List<String> getAllItemPriceMen(){
        Thread.sleep(2000);
        List<WebElement> elementList=driver.findElements(By.xpath("//span[@class='woocommerce-Price-amount amount']"));
        return elementList.stream().map(WebElement::getText).collect(Collectors.toList());
    }
    @Override
    public boolean isDisplayed() {
        return actions.isElementDisplay(searchAllPrice);
    }
}
