package pageObjectTest;

import com.github.javafaker.Faker;
import helpers.TestDataGenerator;
import listeners.RetryAnalizer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlayListTest extends BaseTest {
    private int count =0;

    @Test(retryAnalyzer = RetryAnalizer.class)
    public void flakytest(){
        if(count++ == 4){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
    }

    @Test
    public void playList_createPlaylist_playlistCreated() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName = faker.cat().breed();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.playListExist(playlistId, playlistName));

    }

    @Test
    public void playlistTest_renamePlaylist_PlaylistRenaimed() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName = faker.cat().breed();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        String newName = faker.gameOfThrones().character();
        mainPage.renamePlaylist(playlistId, newName);
        Assert.assertTrue(mainPage.playListExist(playlistId, newName));
    }

    @Test
    public void addSongToPlaylist_chooseSong_songSuccessefulyAdded1() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        mainPage.addSongstoThePlaylist();
        Assert.assertTrue(mainPage.songIsAddedandRemoved());

    }

    @Test
    public void playList_createPlaylist_playlistCreated1() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName = faker.cat().breed();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.playListExist(playlistId, playlistName));

    }

    @Test
    public void playlistTest_renamePlaylist_PlaylistRenaimed1() {
        Faker faker = new Faker();
        String playlistName = faker.cat().breed();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        String newName = faker.gameOfThrones().character();
        mainPage.renamePlaylist(playlistId, newName);
        Assert.assertTrue(mainPage.playListExist(playlistId, newName));
    }

    @Test
    public void addSongToPlaylist_chooseSong_songSuccessefulyAdded() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        mainPage.addSongstoThePlaylist();
        Assert.assertTrue(mainPage.songIsAddedandRemoved());
    }
        @Test
        public void playList_createPlaylist_playlistCreated2 () {
            Faker faker = new Faker();
            String playlistName = faker.cat().breed();
            LoginPage loginPage = new LoginPage(driver);
            loginPage.open(url);
            MainPage mainPage = loginPage.loginToApp(username, password);
            String playlistId = mainPage.createPlaylist(playlistName);
            Assert.assertTrue(mainPage.playListExist(playlistId, playlistName));

        }

        @Test
        public void playlistTest_renamePlaylist_PlaylistRenaimed2 () {
            Faker faker = new Faker();
            String playlistName = faker.cat().breed();
            LoginPage loginPage = new LoginPage(driver);
            loginPage.open(url);
            MainPage mainPage = loginPage.loginToApp(username, password);
            String playlistId = mainPage.createPlaylist(playlistName);
            String newName = faker.gameOfThrones().character();
            mainPage.renamePlaylist(playlistId, newName);
            Assert.assertTrue(mainPage.playListExist(playlistId, newName));
        }

        @Test
        public void addSongToPlaylist_chooseSong_songSuccessefulyAdded2 (){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.open(url);
            MainPage mainPage = loginPage.loginToApp(username, password);
            mainPage.addSongstoThePlaylist();
            Assert.assertTrue(mainPage.songIsAddedandRemoved());
        }
            @Test
            public void playList_createPlaylist_playlistCreated3 () {
                Faker faker = new Faker();
                String playlistName = faker.cat().breed();
                LoginPage loginPage = new LoginPage(driver);
                loginPage.open(url);
                MainPage mainPage = loginPage.loginToApp(username, password);
                String playlistId = mainPage.createPlaylist(playlistName);
                Assert.assertTrue(mainPage.playListExist(playlistId, playlistName));

            }
            @Test
            public void playlistTest_renamePlaylist_PlaylistRenaimed3 ()  {
                Faker faker = new Faker();
                String playlistName = faker.cat().breed();
                LoginPage loginPage = new LoginPage(driver);
                loginPage.open(url);
                MainPage mainPage = loginPage.loginToApp(username, password);
                String playlistId = mainPage.createPlaylist(playlistName);
                String newName = faker.gameOfThrones().character();
                mainPage.renamePlaylist(playlistId, newName);
                Assert.assertTrue(mainPage.playListExist(playlistId, newName));
            }


            @Test
            public void addSongToPlaylist_chooseSong_songSuccessefulyAdded3 (){
                LoginPage loginPage = new LoginPage(driver);
                loginPage.open(url);
                MainPage mainPage = loginPage.loginToApp(username, password);
                mainPage.addSongstoThePlaylist();
                Assert.assertTrue(mainPage.songIsAddedandRemoved());
            }
        }

