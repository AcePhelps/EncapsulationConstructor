package pageObjectTest;

import com.github.javafaker.Faker;
import helpers.TestDataGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlayListTest extends BaseTest {

    @Test
    public void playList_createPlaylist_playlistCreated() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName = faker.cat().breed();
        LoginPage loginPage =new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp("samulJackson@gmail.com","te$t$tudent");
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.playListExist(playlistId,playlistName));

        }
        @Test
    public void playlistTest_renamePlaylist_PlaylistRenaimed() throws InterruptedException {
            Faker faker = new Faker();
            String playlistName = faker.cat().breed();
            LoginPage loginPage =new LoginPage(driver);
            loginPage.open(url);
            MainPage mainPage = loginPage.loginToApp("samulJackson@gmail.com","te$t$tudent");
            String playlistId = mainPage.createPlaylist(playlistName);
            String newName = "Nihua";//faker.gameOfThrones().character();
            mainPage.renamePlaylist(playlistId,newName);
           // Assert.assertTrue(mainPage.playListExist(playlistId,newName));
        }
    }

