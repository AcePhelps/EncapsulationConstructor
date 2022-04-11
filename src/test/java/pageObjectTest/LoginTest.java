package pageObjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;


public class LoginTest extends BaseTest{

  @Test
    public void loginTest_correctCredentials_loggedToApp(){
      LoginPage loginPage =new LoginPage(driver);
      loginPage.open(url);
      MainPage mainPage = loginPage.loginToApp("samulJackson@gmail.com","te$t$tudent");
      Assert.assertTrue(mainPage.isOpen());
  }
  @Test
    public void loginTest_IncorrectCredentials_errorRedFrame(){
      LoginPage loginPage =new LoginPage(driver);
      loginPage.open(url);
      loginPage.loginToApp("samulJackson@gmail.com","te$t$tudent123");
      Assert.assertTrue(loginPage.isError());

  }
}
