package com.automation.pageobjects;

import com.automation.browser.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by RashmiM on 3/24/2016.
 */
public class MyCoursesPage extends BasePage {

    final static Logger logger = Logger.getLogger(LoginPage.class);

    By lblCourse = By.id("instance-202-header");
    By btnCustomizePage = By.xpath("//*[@id='page-navbar']/nav/div/form/div/input[1]");
    By drpDwnAddBlock = By.xpath("//*[@id='single_select56f3c54e3d2469']");
    By lblCalendarHeader = By.xpath("//*[@id='instance-310-header']");
    By btnStopCustomizePage = By.xpath("//*[@id='page-navbar']/nav/div[2]/form/div/input[1]");


    public MyCoursesPage(WebDriver driver) {
        super(driver);
        logger.info("Intialize My Courses Page...");
    }

    public MyCoursesPage validate_Course_Page(String header){
        Assert.assertEquals(driver.findElement(lblCourse).getText(),header);
        logger.info("validated Courses page successfully...");
        return this;
    }

    public MyCoursesPage click_Customize_Page_Button(){
        driver.findElement(btnCustomizePage).click();
        logger.info("Clicked Customize Page button successfully...");
        return this;
    }

//    public MyCoursesPage add_A_Calendar(String value){
//        driver.findElement(drpDwnAddBlock).click();
//        logger.info("clicked drop down");
//        driver.findElement(drpDwnAddBlock).sendKeys(value);
//        logger.info("Added a dropdown value successfully...");
//        return this;
//    }
//
//    public MyCoursesPage check_And_Validate_Calendar(String header){
//        Assert.assertEquals(driver.findElement(lblCalendarHeader).getText(),header);
//        logger.info("Validated Calendar Header Successfully...");
//        return this;
//    }

    public MyCoursesPage click_Stop_Customize_Page(){
        driver.findElement(btnStopCustomizePage).click();
        logger.info("Clicked Stop Customize button successfully...");
        return this;
    }


}
