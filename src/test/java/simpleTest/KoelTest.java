package simpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class KoelTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
       wait = new WebDriverWait(driver,10,200);
       fluentWait = new FluentWait<>(driver)
               .pollingEvery(Duration.ofMillis(200))
               .withTimeout(Duration.ofSeconds(10))
               .ignoring(NoSuchElementException.class)
               .ignoring(ElementClickInterceptedException.class)
               .ignoring(StaleElementReferenceException.class);
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://bbb.testpro.io/");
    }
    @AfterMethod
    public void finish() throws InterruptedException {

        driver.quit();
    }


    @Test
    public void correctCredentials_succsessfulLogin() throws InterruptedException {


     //   WebElement userName = driver.findElement(By.xpath( "//*[@type='email']"));
        By usernamelocator = By.xpath("//*[@type='email']");
        WebElement username = driver.findElement(usernamelocator);
        By passwordLocatorField = By.xpath("//*[@type='password']");
        WebElement passwordField = driver.findElement(passwordLocatorField);
        By loginButtonLocator = By.xpath("*//button");
        WebElement loginButton = driver.findElement(loginButtonLocator);



        username.sendKeys("samulJackson@gmail.com");

        passwordField.sendKeys("te$t$tudent");


        loginButton.click();

        By homeIconLocator = By.xpath("//*[@class='home active1']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeIconLocator));
        WebElement homeIcon = driver.findElement(homeIconLocator);

        Assert.assertTrue(homeIcon.isDisplayed());



    }
    @Test

    public void incorrectCredentials_errorFrame() throws InterruptedException {


        By usernamelocator = By.xpath("//*[@type='email']");
        WebElement username = driver.findElement(usernamelocator);
        By passwordLocatorField = By.xpath("//*[@type='password']");
        WebElement passwordField = driver.findElement(passwordLocatorField);
        By loginButtonLocator = By.xpath("*//button");
        WebElement loginButton = driver.findElement(loginButtonLocator);



        username.sendKeys("samulJackson@gmail.com");

        passwordField.sendKeys("WrongPassword");


        loginButton.click();


        By errorFrameLocator = By.xpath("//*[@class='error']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorFrameLocator));
        WebElement errorFrame = driver.findElement(errorFrameLocator);

        Assert.assertTrue(errorFrame.isDisplayed());



    }
    @Test
    public void createPlaylist_succseful() throws InterruptedException {
        By usernamelocator = By.xpath("//*[@type='email']");
        WebElement username = driver.findElement(usernamelocator);
        By passwordLocatorField = By.xpath("//*[@type='password']");
        WebElement passwordField = driver.findElement(passwordLocatorField);
        By loginButtonLocator = By.xpath("*//button");
        WebElement loginButton = driver.findElement(loginButtonLocator);



        username.sendKeys("samulJackson@gmail.com");

        passwordField.sendKeys("te$t$tudent");


        loginButton.click();

        By plusLocator = By.xpath("//*[@class='fa fa-plus-circle control create']");
        WebElement plus = driver.findElement(plusLocator);
        By newPlaylistOption =By.xpath("//*[text()= 'New Playlist']");
        WebElement newPlaylist = driver.findElement(newPlaylistOption);


        plus.click();

        newPlaylist.click();

        By newPlaylistField =By.xpath("//*[@class='create']/input");
        WebElement newlistField = driver.findElement(newPlaylistField);
        newlistField.sendKeys("AsetPlaylist");
        newlistField.sendKeys(Keys.ENTER);

        By popUpMessageSuccess =By.xpath("//*[@class='success show']");
        WebElement poUpMessage = driver.findElement(popUpMessageSuccess);
        Assert.assertTrue(poUpMessage.isDisplayed());






    }

    }

//*[@class='success show']
////koeluser06@testpro.io
//// te$t$tudent
//samulJackson@gmail.com
  //      type="email"