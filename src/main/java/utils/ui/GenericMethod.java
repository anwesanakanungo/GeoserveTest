package utils.ui;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class GenericMethod {
    protected WebDriver driver;

    public void setSize(Dimension dimension) {
        driver.manage().window().setSize(dimension);
    }

}
