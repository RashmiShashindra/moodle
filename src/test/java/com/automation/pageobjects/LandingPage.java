package com.automation.pageobjects;

import com.automation.browser.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.log4testng.Logger;

public class LandingPage extends BasePage{

    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(LandingPage.class);

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
