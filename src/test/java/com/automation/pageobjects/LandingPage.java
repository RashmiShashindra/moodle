package com.automation.pageobjects;

import com.automation.browser.BasePage;
import org.apache.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPage extends BasePage{

    final static Logger logger = Logger.getLogger(LandingPage.class);

    public LandingPage(WebDriver driver) {
        super(driver);
        logger.info("Initialize Landing ...");
    }

    By user = By.xpath("//*[@id='action-menu-toggle-0']/span/span[1]");

    public void Check_DashboardProfile(String profile){
        Assert.assertTrue(driver.findElement(user).getText().equals(profile));
        logger.info("Verified the moodle dashboard ...");
    }

}
