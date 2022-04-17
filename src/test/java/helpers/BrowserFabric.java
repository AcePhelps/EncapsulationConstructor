package helpers;

import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFabric {
    public static WebDriver getWebDriver(BrowserType type){
        switch (type){
            case CHROME : return getChromeDriver();
            case EDGE : return getEdgeDriver();
            default: return getFirefoxDriver();
        }
    }

    private static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--width=1920");
        options.addArguments("--height=622");
        return new FirefoxDriver(options);
    }

    private static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("window-size=1400,1000");
        return  new ChromeDriver(options);
    }

    private static WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return  new EdgeDriver();
    }
}
