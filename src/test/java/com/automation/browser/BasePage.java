package com.automation.browser;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.*;
import org.testng.log4testng.Logger;


public class BasePage {

    private static Logger logger = Logger.getLogger(BasePage.class);

    public static WebDriver driver = null;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public static WebDriver getConnection(String browser) throws InterruptedException {
        if (browser.equals("chrome")) {
            String exePath = "C:\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
            driver = new ChromeDriver();
        } else if (browser.equals("ie")) {
            String service = "C:\\IEDriverServer.exe";
            System.setProperty("webdriver.ie.driver", service);
            driver = new InternetExplorerDriver();
        } else {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.moodle.net/");
        Assert.assertEquals("Moodle sandbox demo", driver.getTitle());
        logger.info("Successfully page load ...");
        return driver;
    }

    public static void closeConnection(){
        driver.close();
        driver.quit();
        logger.info("Successfully terminate driver ...");
    }

}
