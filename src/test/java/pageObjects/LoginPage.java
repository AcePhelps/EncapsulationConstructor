package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{


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
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
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
