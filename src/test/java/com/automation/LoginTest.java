package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by RashmiM on 3/16/2016.
 */
public class LoginTest {

    WebDriver driver;

    LoginPage objLogin;
    LandingPage objLanding;

    @BeforeTest
    public void setup(){

        String exePath = "C:\\Chrome Driver\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", exePath);

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demo.moodle.net/");

    }

    @Test(priority = 0)
    public void test_Login() throws InterruptedException {

        objLogin = new LoginPage(driver);

        objLogin.enterUsername("admin");
//        driver.wait(10000);
        objLogin.enterPassword("sandbox");
//        driver.wait(10000);
        objLanding = objLogin.clickLoginButton();

        objLanding.validate_Login("Admin User");

        driver.quit();

    }
}
