package com.automation.testcases;

import com.automation.browser.BaseTest;
import com.automation.pageobjects.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void test_Successful_User_Login(){
        new LoginPage(getDriver()).
                step_Successful_User_Login("demoadmin", "demoadmin").
                validate_Dashboard_Page();
    }

    @Test
    public void test_Unsuccessfull_User_Login() throws InterruptedException {
        new LoginPage(getDriver()).
                step_Unsuccessful_User_Login("Rashmim","demo").
                step_Verify_Error_Message("Invalid login, please try again");
    }



}
