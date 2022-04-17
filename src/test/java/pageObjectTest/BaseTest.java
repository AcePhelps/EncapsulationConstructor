package pageObjectTest;

import enums.BrowserType;
import helpers.BrowserFabric;
import helpers.Screenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String url;
    protected String username;
    protected String password;
//@Parameters({"url","username","password"})
    @BeforeMethod
    public void startUp(){
      driver= BrowserFabric.getWebDriver(BrowserType.CHROME);
      url="https://bbb.testpro.io";
      username ="samulJackson@gmail.com";
      password ="te$t$tudent";
//        this.url=url//"https://bbb.testpro.io";
//        this.username =email//"samulJackson@gmail.com";
//        this.password =password//"te$t$tudent";
    }
    @AfterMethod
    public void finish(ITestResult testReuslt) {
        if(testReuslt.getStatus()==testReuslt.FAILURE){
            Screenshot.get(driver,testReuslt.getTestName());
        }
        driver.quit();
    }

}
