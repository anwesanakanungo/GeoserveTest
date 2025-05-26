package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ui.ElementActions;
@Slf4j
public class AboutUsPage extends BasePage{
    private final By aboutUs=By.xpath("//h3[text()='About Us']");
    public AboutUsPage(WebDriver driver) {
        super(driver);
    }
    ElementActions actions=new ElementActions(driver);
    @Override
    public boolean isDisplayed() {
        return this.actions.isElementDisplay(aboutUs);
    }
    public String getTextAboutUs(){
        log.info("Getting the text from About us page");
        return this.actions.getText(aboutUs);

    }
    public AboutUsPage goTo(){
        driver.get("https://askomdch.com/about/");
        log.info("Go to About us page");
        return this;
    }

}
