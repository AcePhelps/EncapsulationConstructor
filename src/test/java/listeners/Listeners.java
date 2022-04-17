package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    private static Logger logger = LogManager.getLogger(Listeners.class) ;
    public  void onTestStart(ITestResult result) {
      logger.debug("Started test "+result.getTestName());

}
    public void onTestSuccess(ITestResult result) {

}
public  void onTestFailure(ITestResult result) {}
    

   public  void onTestSkipped(ITestResult result) {
   }
   }