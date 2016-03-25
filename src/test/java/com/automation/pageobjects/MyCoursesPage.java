package com.automation.pageobjects;

import com.automation.browser.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * Created by RashmiM on 3/24/2016.
 */
public class MyCoursesPage extends BasePage {

    final static Logger logger = Logger.getLogger(LoginPage.class);


    @FindBy(id = "instance-202-header")
    WebElement lblCourse;

    @FindBy(xpath = "//*[@id='page-navbar']/nav/div/form/div/input[1]")
    WebElement btnCustomizePage;

    @FindBy(xpath = "//*[@id='page-navbar']/nav/div[2]/form/div/input[1]")
    WebElement btnStopCustomizePage;


    public MyCoursesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        logger.info("Intialize My Courses Page...");
        Reporter.log("Intialize My Courses Page...");
    }

    public MyCoursesPage validate_Course_Page(String header){
        Assert.assertEquals(lblCourse.getText(),header);
        logger.info("validated Courses page successfully...");
        Reporter.log("validated Courses page successfully...");
        return this;
    }

    public MyCoursesPage click_Customize_Page_Button(){
        btnCustomizePage.click();
        logger.info("Clicked Customize Page button successfully...");
        Reporter.log("Clicked Customize Page button successfully...");
        return this;
    }

    public MyCoursesPage click_Stop_Customize_Page(){
        btnStopCustomizePage.click();
        logger.info("Clicked Stop Customize button successfully...");
        Reporter.log("Clicked Stop Customize button successfully...");
        return this;
    }


}
