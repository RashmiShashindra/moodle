package com.automation.browser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by ShiwanthaK on 3/18/2016.
 */
public class BaseTest {

    private WebDriver driver;

    public WebDriver getDriver(){
        return this.driver;
    }

    @BeforeMethod(alwaysRun = true)
    public void initialized() throws InterruptedException {
        this.driver = BasePage.getConnection("chrome");
    }

    @AfterMethod(alwaysRun = true)
    public void terminated(){
        BasePage.closeConnection();
    }
}
