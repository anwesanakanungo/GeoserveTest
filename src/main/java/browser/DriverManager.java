package browser;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
@Slf4j
public abstract class DriverManager {
    protected static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    protected abstract WebDriver createDriver();

    public void quitDriver() {
        if (null != driver.get()) {
            try {
                driver.get().quit();
                log.info("quit driver");
                /* driver.remove(); */
            } catch (Exception e) {
                log.error("Failed to quit driver", e);
            }
            finally {
                driver.remove(); // Always clean up the ThreadLocal to prevent memory leaks
            }
        }
    }

    public WebDriver getDriver() {
        if (null == driver.get()) {
            driver.set(this.createDriver());
        }
        return driver.get();
    }
}
