package browser;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
@Slf4j
public class FirefoxDriverManager extends DriverManager {
    @Override
    protected WebDriver createDriver() {
        log.info("Start FIREFOX browser");
        return new FirefoxDriver(getFirefoxOptions());

    }

    private FirefoxOptions getFirefoxOptions() {
        // A few valid Options for Chrome, showcase purpose.
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-features=EnableEphemeralFlashPermission");
        options.addArguments("--disable-infobars");

        return options;
    }

}

