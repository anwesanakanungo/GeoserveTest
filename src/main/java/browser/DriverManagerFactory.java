package browser;

public class DriverManagerFactory {
    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager = null;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case CHROMEHEADLESS:
                driverManager = new ChromeDriverHeadlessManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;

        }
        return driverManager;

    }

}
