package com.automation.pageobjects;

import com.automation.browser.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by RashmiM on 3/15/2016.
 */
public class LoginPage extends BasePage{

    By username = By.id("login_username");
    By password = By.id("login_password");
    By login = By.xpath("//*[@id='login']/div[4]/input");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LandingPage step_Successful_User_Login(String uname,String pword){
        action_EenterUsername(uname);
        action_EnterPassword(pword);
        clickLoginButton();
        return new LandingPage(driver);
    }

    private void action_EenterUsername(String name){
        driver.findElement(username).sendKeys(name);
        System.out.println("Entered username Successfully");
    }

    private void action_EnterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
        System.out.println("Entered Password successfully");
    }

    private void clickLoginButton(){
        driver.findElement(login).click();
        System.out.println("Clicked Login button Successfully");
    }

}
