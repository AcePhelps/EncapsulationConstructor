package listeners;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class RetryAnalizer implements IRetryAnalyzer {
    private int retryCount = 0;
    public boolean retry(ITestResult result) {
        int maxRetryCount = 3;
        if (retryCount < maxRetryCount) {
            retryCount++;
            System.out.println("Retry #" + retryCount + " for test: " + result.getMethod().getMethodName() + ", on thread: " + Thread.currentThread().getName());
            return true;
        }
        return false;
    }
}
