package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    private static Logger logger= LogManager.getLogger(LoginPage.class);

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private WebElement getEmailField(){
        return driver.findElement(By.xpath("//*[@type='email']"));
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.xpath("//*[@type='password']"));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.xpath("*//button"));
    }
    public MainPage loginToApp(String username,String password){
        logger.info("Logging to App Method");
        getEmailField().sendKeys(username);
        logger.info("Username "+username);
        getPasswordField().sendKeys(password);
        logger.info("Password "+ password);
        getLoginButton().click();
        logger.warn("Button clicked");
        return new MainPage(driver);
    }
    public void open(String url){
        driver.get(url);
    }

    public boolean isError() {
        By errorFrameLocator = By.xpath("//*[@class='error']");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorFrameLocator));
            return true;
        }catch (TimeoutException error){
            return false;
        }
    }
}
