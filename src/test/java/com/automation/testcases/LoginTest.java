package com.automation.testcases;

import com.automation.browser.BaseTest;
import com.automation.pageobjects.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void test_Successful_User_Login(){
        new LoginPage(getDriver()).
                step_Successful_User_Login("admin", "sandbox").
                Check_DashboardProfile("Admin User");
    }

    @Test
    public void test_Invalid_User_login() throws InterruptedException {
        new LoginPage(getDriver()).
                step_Unsuccessful_User_Login("Sister","sandbox").
                step_Verify_Error_Message("Invalid login, please try again");
    }

}
