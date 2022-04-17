package pageObjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BasePage;
import pageObjects.MainPage;

public class LoginPageFactory  {
    private WebDriver driver;
    private WebDriverWait wait;



    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,5);
        PageFactory.initElements(factory,this);
    }


    @FindBy(css="[type='email']")
    private  WebElement emailField;
    @FindBy(xpath = "//*[@type='password']")
    private WebElement passwordField;
    @FindBy(tagName = "button")
    private WebElement loginbutton;

    @FindBy(className = "error")
    private WebElement errorframe;


    public MainPage loginToApp(String username,String password){
        this.emailField.sendKeys(username);
        passwordField.sendKeys(password);
        loginbutton.click();
        return new MainPage(driver);
    }
    public void open(String url){
        driver.get(url);
    }

    public boolean isError() {
        wait = new WebDriverWait(driver,5,200);
        try{


            wait.until(ExpectedConditions.visibilityOf(errorframe));
            return true;
        }catch (TimeoutException error){
            return false;
        }
    }
}
