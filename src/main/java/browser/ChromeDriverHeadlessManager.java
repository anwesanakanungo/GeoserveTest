package browser;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
@Slf4j
public class ChromeDriverHeadlessManager extends DriverManager {

    @Override
    protected WebDriver createDriver() {
        log.info("Start headless CHROME");
        return new ChromeDriver(getChromeOptions());
    }

    private ChromeOptions getChromeOptions() {
        final ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        return options;
    }
}

