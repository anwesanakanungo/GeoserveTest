package listerners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTest implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int MAXRETRYCOUNT = constants.FrameworkConstants.RETRY_COUNT;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < MAXRETRYCOUNT) {
            retryCount++;
            return true;
        }
        return false;
    }
}
