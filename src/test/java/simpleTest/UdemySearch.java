package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UdemySearch {
    @Test
    public void searchTest_searchingJava_1000ResultsForJava() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
         WebDriver driver = new ChromeDriver(); //WebDriver = interface , driver = browser, newChromeBrowser() =class
        driver.get("https://www.udemy.com");
        Thread.sleep(1000);
        WebElement searchField  = driver.findElement(By.xpath("(//*[@name ='q'])"));


        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement clickOnOracle = driver.findElement(By.xpath("(//h3)[1]"));
        Assert.assertEquals(clickOnOracle.getText(),"Java | Oracle");
        Thread.sleep(15000);
        driver.quit();
    }
    @Test
    public void printNumbers(){
        for(int i=0;true;i++)
            System.out.println(i);
    }

}
