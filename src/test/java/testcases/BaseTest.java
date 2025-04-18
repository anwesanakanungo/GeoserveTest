package testcases;
import browser.DriverManager;
import browser.DriverManagerFactory;
import browser.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    private DriverManager driverManager;
    @BeforeMethod
    public void beforeMethod() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        this.driver = driverManager.getDriver();
    }
    @AfterMethod
    public void tearDown() {
        driverManager.quitDriver();
    }
}
