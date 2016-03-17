package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * Created by RashmiM on 3/15/2016.
 */
public class LoginPage {

    WebDriver driver;

    By username = By.id("login_username");
    By password = By.id("login_password");
    By login = By.xpath("//*[@id='login']/div[4]/input");

    public LoginPage(WebDriver driver){

        this.driver = driver;

    }

    /*
    Enter Username

     */

    public void enterUsername(String name){

        driver.findElement(username).sendKeys(name);
        System.out.println("Entered username Successfully");

    }

    /**
     * Enter Password
     */

    public void enterPassword(String pwd){

        driver.findElement(password).sendKeys(pwd);
        System.out.println("Entered Password successfully");
    }

    /**
     * Click Login Button
     */

    public LandingPage clickLoginButton(){

        driver.findElement(login).click();
        System.out.println("Clicked Login button Successfully");
        return new LandingPage(driver);
    }

}
