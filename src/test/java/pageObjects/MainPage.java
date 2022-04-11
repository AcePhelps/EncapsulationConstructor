package pageObjects;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);
    }



    public boolean isOpen() {
        By homeIconLocator = By.className("active");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeIconLocator));
            return true;

        }catch (TimeoutException error){
            return false;
        }

    }
    private WebElement plusButton(){
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }
    private WebElement newPlaylist(){
        return driver.findElement(By.xpath("//*[text()= 'New Playlist']"));
    }
    private WebElement insertText(){
        return  driver.findElement(By.xpath("//*[@class='create']/input"));

    }
//    private WebElement popUpMessage(){
//        return driver.findElement(By.xpath("//*[@class='success show']"));
//    }
    public String createPlaylist(String playlist){
        By plusButton = By.xpath("//*[@class='fa fa-plus-circle control create']");

        wait.until(ExpectedConditions.visibilityOfElementLocated(plusButton));
    plusButton().click();
        wait.until(ExpectedConditions.visibilityOf(newPlaylist()));
    newPlaylist().click();
        wait.until(ExpectedConditions.visibilityOf(insertText()));
    insertText().sendKeys(playlist);
    insertText().sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));


        String url = driver.getCurrentUrl();
        String[]parts = url.split("/");
        return parts[parts.length-1];
    }


    private WebElement getPlaylist(String id){

        return driver.findElement(By.xpath("//*[@href='#!/playlist/"+id+"']"));
    }

    public boolean playListExist(String playlistId, String playlistName) {

        try {
            return getPlaylist(playlistId).isDisplayed() && getPlaylist(playlistId).getText().equals(playlistName);
        } catch (NoSuchElementException error) {


          return false;
        }

    }

    public void renamePlaylist(String playlistId, String newName) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",getPlaylist(playlistId));
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.doubleClick(getPlaylist(playlistId)).perform();
        Thread.sleep(2000);
        By editingElement = By.xpath("//*[@class='playlist playlist editing']/a");

        WebElement editing = driver.findElement(editingElement);
//        wait.until(ExpectedConditions.visibilityOf(editing));

        String a = Keys.chord(Keys.CONTROL,"a");
        editing.sendKeys(a);

        Thread.sleep(2000);
        getPlaylist(playlistId).sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        getPlaylist(playlistId).sendKeys(newName);
        Thread.sleep(2000);
        getPlaylist(playlistId).sendKeys(Keys.ENTER);

    }
}
