package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    private static Logger  logger=LogManager.getLogger(MainPage.class);


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
    private WebElement allSongField(){
        return driver.findElement(By.xpath("//*[@href='#!/songs']"));
    }
    private WebElement OpeningHorizonSong(){
        return driver.findElement(By.xpath("//*[text()='Opening Horizons (Kielokaz ID 361)']"));
    }
    private WebElement addToField(){
        return driver.findElement(By.xpath("//*[@class='has-sub']"));
    }
    private WebElement subMenuToBeOpen(){
        return driver.findElement(By.xpath("//*[@class='menu submenu menu-add-to']"));
    }
    private WebElement playListToBeAdded(){
        return driver.findElement(By.xpath(("(//*[text()='xxxa'])[2]")));
    }
    private WebElement playlistsongToBeDeleted(){
        return driver.findElement(By.xpath(("(//*[text()='xxxa'])[1]")));
    }
    private WebElement rightCkickOnplaylistToDeleteIt(){
        return driver.findElement(By.xpath("//*[@href='#!/playlist/25924']/following-sibling::nav/ul/li[2]"));
    }
    private void toBeSelected(){
        By toBeSelectedAAA = By.xpath("//*[@id='playlistWrapper']/div/div/div/table/tr");///parent::div
        WebElement toBeSelected = driver.findElement(toBeSelectedAAA);
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(toBeSelectedAAA));
        toBeSelected.click();
        actions.sendKeys(Keys.DELETE).perform();
    }


    private  void  ClickButton(){

        {
            By getPlusbutton = By.xpath("//*[@class='fa fa-plus-circle control create']");


            for (int i = 0; i < 20; i++) {
                try {
                    driver.findElement(getPlusbutton).click();
                    return;
                } catch (NoSuchElementException | ElementClickInterceptedException err) {
                  logger.fatal("Exception happens" +err.getLocalizedMessage() );
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ignored ) {

                    }
                }
            }throw new TimeoutException("Element not found");
        }
    }


    public String createPlaylist(String playlist){
        ClickButton();
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
    private WebElement getPlaylist1(String id){

        return driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
    }

    public boolean playListExist(String playlistId, String playlistName) {

        try {
            return getPlaylist(playlistId).isDisplayed() && getPlaylist(playlistId).getText().equals(playlistName);
        } catch (NoSuchElementException error) {


          return false;
        }

    }


    public void renamePlaylist(String playlistId, String newName) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",getPlaylist(playlistId));
        Actions actions = new Actions(driver);
        actions.doubleClick(getPlaylist(playlistId)).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='playlist playlist editing']/input")));
        String a = Keys.chord(Keys.CONTROL,"a");
        getPlaylist1(playlistId).sendKeys(a);
        getPlaylist1(playlistId).sendKeys(Keys.DELETE);
        getPlaylist1(playlistId).sendKeys(newName);
        getPlaylist1(playlistId).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show' and contains(text(),'"+newName+"')]")));
    }

    public boolean songIsAddedandRemoved() {
        By songisdeleted = By.xpath("//*[contains (text(),'Removed 1 song from')]");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(songisdeleted));
            return true;
        }catch (TimeoutException error){
            return false;
        }
    }

    public void addSongstoThePlaylist() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='#!/songs']")));
        allSongField().click();
        wait.until(ExpectedConditions.visibilityOf(OpeningHorizonSong()));
        Actions actions = new Actions(driver);
        actions.contextClick(OpeningHorizonSong()).perform();
        actions.moveToElement(addToField());
        addToField().click();
        playListToBeAdded().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",playlistsongToBeDeleted());
        wait.until(ExpectedConditions.visibilityOf(playlistsongToBeDeleted()));
        playlistsongToBeDeleted().click();
        toBeSelected();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains (text(),'Removed 1 song from')]")));



    }



}
