package listerners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTest implements IRetryAnalyzer {

    private static final int COUNTRYMAN = constants.FrameworkConstants.RETRY_COUNT;
    private int retryCount = 0;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < COUNTRYMAN) {
            retryCount++;
            return true;
        }
        return false;
    }
}
