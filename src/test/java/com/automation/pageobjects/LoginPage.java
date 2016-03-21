package com.automation.pageobjects;

import com.automation.browser.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.apache.log4j.*;

/**
 * Created by RashmiM on 3/15/2016.
 */
public class LoginPage extends BasePage{

    final static Logger logger = org.apache.log4j.Logger.getLogger(LoginPage.class);

    By username = By.id("login_username");
    By password = By.id("login_password");
    By login = By.xpath("//*[@id='login']/div[4]/input");
    By loginErrorMessage = By.xpath("//span[@class='error']");

    public LoginPage(WebDriver driver){
        super(driver);
        logger.info("Initialize Login ...");
    }

    public LandingPage step_Successful_User_Login(String uname,String pword){
        action_EnterUsername(uname);
        action_EnterPassword(pword);
        clickLoginButton();
        return new LandingPage(driver);
    }

    public LoginPage step_Unsuccessful_User_Login(String uname, String pwd){
        action_EnterUsername(uname);
        action_EnterPassword(pwd);
        clickLoginButton();
        return this;
    }

    public LoginPage step_Verify_Error_Message(String errorMessage) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(loginErrorMessage).getText().equals(errorMessage));
        logger.info("Validated error message successfully!");
        return this;
    }

    private void action_EnterUsername(String name){
        driver.findElement(username).sendKeys(name);
        logger.info("Entered username Successfully");
    }

    private void action_EnterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
        logger.info("Entered Password successfully");
    }

    private void clickLoginButton(){
        driver.findElement(login).click();
        logger.info("Clicked Login button Successfully");
    }


}
