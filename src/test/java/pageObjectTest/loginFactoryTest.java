package pageObjectTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BasePage;
import pageObjects.MainPage;

public class loginFactoryTest extends BaseTest {
    @Test
    public void loginTestFactory_correctLogin_loggedToApp() {
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username, password);
        Assert.assertTrue(mainPage.isOpen());

    }
    @Test
    public void loginTestFactory_incorrectLogin_loggedToApp(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPageFactory.isError());
}
    @Test
    public void loginTestFactory_correctLogin_loggedToApp1() {
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username, password);
        Assert.assertTrue(mainPage.isOpen());

    }
    @Test
    public void loginTestFactory_incorrectLogin_loggedToApp1(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPageFactory.isError());
    }

    @Test
    public void loginTestFactory_correctLogin_loggedToApp2() {
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username, password);
        Assert.assertTrue(mainPage.isOpen());

    }
    @Test
    public void loginTestFactory_incorrectLogin_loggedToApp2(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPageFactory.isError());
    }

    @Test
    public void loginTestFactory_correctLogin_loggedToApp3() {
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username, password);
        Assert.assertTrue(mainPage.isOpen());

    }
    @Test
    public void loginTestFactory_incorrectLogin_loggedToApp3(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPageFactory.isError());
    }



}
