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

    final static Logger logger = Logger.getLogger(LoginPage.class);

    By login = By.id("loginbtn");
    By txtUserName = By.id("username");
    By txtPassword = By.id("password");
    By lblLoginErrorMessage = By.xpath("//*[@id='region-main']/div/div/div/div/div[1]/span");



    public LoginPage(WebDriver driver){
        super(driver);
        logger.info("Initialize Login ...");
    }

    public DashboardPage step_Successful_User_Login(String uname,String pword){
        action_EnterUsername(uname);
        action_EnterPassword(pword);
        clickLoginButton();
        return new DashboardPage(driver);
    }

    public LoginPage step_Unsuccessful_User_Login(String uname, String pwd){
        action_EnterUsername(uname);
        action_EnterPassword(pwd);
        clickLoginButton();
        return this;
    }

    public LoginPage step_Verify_Error_Message(String errorMessage) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(lblLoginErrorMessage).getText().equals(errorMessage));
        logger.info("Validated error message successfully!");
        return this;
    }

    private void action_EnterUsername(String name){
        driver.findElement(txtUserName).sendKeys(name);
        logger.info("Entered username Successfully");
    }

    private void action_EnterPassword(String pwd){
        driver.findElement(txtPassword).sendKeys(pwd);
        logger.info("Entered Password successfully");
    }

    private void clickLoginButton(){
        driver.findElement(login).click();
        logger.info("Clicked Login button Successfully");
    }


}
