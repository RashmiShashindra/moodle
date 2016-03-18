package com.automation.pageobjects;

import com.automation.browser.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    By user = By.xpath("//*[@id='action-menu-toggle-0']/span/span[1]");

    public void Check_DashboardProfile(String profile){
        Assert.assertTrue(driver.findElement(user).getText().equals(profile));
        System.out.println("Verified the moodle dashboard ...");
    }

}
