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
    public void test_Invalid_User_login(){
        new LoginPage(getDriver()).
                step_Successful_User_Login("admin", "sandbox").
                Check_DashboardProfile("Admin User");
    }

}
