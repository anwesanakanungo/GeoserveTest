package browser;

public class DriverManagerFactory {
    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case CHROMEHEADLESS:
                driverManager = new ChromeDriverHeadlessManager();
                break;
            default:
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;

        }
        return driverManager;

    }

}
