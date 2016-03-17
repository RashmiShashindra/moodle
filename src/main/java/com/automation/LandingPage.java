package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by RashmiM on 3/17/2016.
 */
public class LandingPage {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    By user = By.xpath("//*[@id='action-menu-toggle-0']/span/span[1]");

    /**
     * Validate login succesfully
     */

    public void validate_Login(String userN){

        Assert.assertTrue(driver.findElement(user).getText().equals(userN));
        System.out.println("Verified the Login successed");

    }

}
