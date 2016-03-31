package com.automation.testcases;

import com.automation.browser.BaseTest;
import com.automation.pageobjects.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.automation.utils.Listener.class)

public class LoginTest extends BaseTest{


    @Test(groups = {"BAT","REG"} )
    public void test_Successful_User_Login(){
        new LoginPage(getDriver()).
                step_Successful_User_Login("demoadmin", "demoadmin").
                validate_Dashboard_Page();
    }

    @Test(groups = {"REG"})
    public void test_Unsuccessfull_User_Login() throws InterruptedException {
        new LoginPage(getDriver()).
                step_Unsuccessful_User_Login("Rashmim","demo").
                step_Verify_Error_Message("Invalid login, please try again");
    }

    @Test(groups = {"REG"})
    public void test_Navigation_To_MyCourses_Page(){
        new LoginPage(getDriver()).
                step_Successful_User_Login("demoadmin","demoadmin").
                click_MyCourses_Link().
                validate_Course_Page("Course overview");

    }

    @Test(groups = {"REG"})
    public void test_Navigation_To_MyCourses_Pageq(){
        new LoginPage(getDriver()).
                step_Successful_User_Login("demoadmin","demoadmin").
                click_On_Find_Learning_Tab();

    }

    @Test(groups = {"BAT"})
    public void test_Failing_Screenshot_Test_Case(){
        new LoginPage(getDriver()).
                step_Successful_User_Login("adfa","adfadf").
                validate_Dashboard_Page();
    }



}
