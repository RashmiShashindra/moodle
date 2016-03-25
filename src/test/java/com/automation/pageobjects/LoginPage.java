package com.automation.pageobjects;

import com.automation.browser.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.apache.log4j.*;
import org.testng.Reporter;

/**
 * Created by RashmiM on 3/15/2016.
 */
public class LoginPage extends BasePage{

    final static Logger logger = Logger.getLogger(LoginPage.class);

    @FindBy(id = "loginbtn")
    WebElement login;

    @FindBy(id = "username")
    WebElement txtUserName;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(xpath = "//*[@id='region-main']/div/div/div/div/div[1]/span")
    WebElement lblLoginErrorMessage;


    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        logger.info("Initialize Login ...");
        Reporter.log("Initialize Login ...");
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
        Assert.assertEquals(lblLoginErrorMessage.getText(),errorMessage);
        logger.info("Validated error message successfully!");
        Reporter.log("Validated error message successfully!");
        return this;
    }

    private void action_EnterUsername(String name){
        txtUserName.sendKeys(name);
        logger.info("Entered username Successfully");
        Reporter.log("Entered username Successfully");
    }

    private void action_EnterPassword(String pwd){
        txtPassword.sendKeys(pwd);
        logger.info("Entered Password successfully");
        Reporter.log("Entered Password successfully");
    }

    private void clickLoginButton(){
        login.click();
        logger.info("Clicked Login button Successfully");
        Reporter.log("Clicked Login button Successfully");
    }

}
