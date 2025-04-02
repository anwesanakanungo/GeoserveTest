package testcases;

import browser.DriverManager;
import browser.DriverManagerFactory;
import browser.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver ;

    @BeforeMethod
    public void beforeMethod() {
        DriverManager driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        this.driver = driverManager.getDriver();
    }
    @AfterMethod
    public void tearDown(){

        this.driver.quit();
    }
}
