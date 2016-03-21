package com.automation.pageobjects;

import com.automation.browser.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by RashmiM on 3/21/2016.
 */
public class DashboardPage extends BasePage{

    final static Logger logger = Logger.getLogger(LoginPage.class);

    By dashboardText = By.xpath("//*[@id='page-navbar']/div/nav/ul/li[2]/span[3]");

    public DashboardPage(WebDriver driver) {
        super(driver);
        logger.info("Initialize Dashboard Page...");
    }

    public void validate_Dashboard_Page(){
        Assert.assertEquals(driver.findElement(dashboardText).getText(),"Admin Dashboard");
        logger.info("Verified Dashboard text...");
    }
}
