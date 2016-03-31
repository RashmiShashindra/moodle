package com.automation.testcases;

import com.automation.browser.BaseTest;
import com.automation.pageobjects.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.automation.utils.Listener.class)

/**
 * Created by RashmiM on 3/24/2016.
 */
public class MyCoursesTest extends BaseTest {

    //@Test(groups = {"BAT","REG"})
    public void test_verifying_click_Customize_Button(){
        new LoginPage(getDriver()).
                step_Successful_User_Login("demoadmin","demoadmin").
                click_MyCourses_Link().
                click_Customize_Page_Button();
    }

    @Test(groups = {"REG"})
    public void test_Verify_Click_Stop_Customize_Button(){
        new LoginPage(getDriver()).
                step_Successful_User_Login("demoadmin","demoadmin").
                click_MyCourses_Link().
                click_Customize_Page_Button().
                click_Stop_Customize_Page();

    }


}
