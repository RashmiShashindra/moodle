package com.automation.pageobjects;

import com.automation.browser.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;


/**
 * Created by RashmiM on 3/21/2016.
 */
public class DashboardPage extends BasePage{

    final static Logger logger = Logger.getLogger(LoginPage.class);

//    By tabFindLearning = By.xpath("//*[@id='totaramenu']/ul/li[5]/a");
//    By drpDwnCourses = By.xpath("//*[@id='totaramenu']/ul/li[5]/ul/li[1]/a");
//    By drpDwnPrograms = By.xpath("//*[@id='totaramenu']/ul/li[5]/ul/li[2]/a");
//    By drpDwnCertifications = By.xpath("//*[@id='totaramenu']/ul/li[5]/ul/li[3]/a");

    @FindBy(xpath = "//*[@id='page-navbar']/div/nav/ul/li[2]/span[3]")
    WebElement dashboardText;

    @FindBy(xpath = "//*[@id='expandable_branch_0_mycourses']/a")
    WebElement lnkMyCourses;



    public DashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        logger.info("Initialize Dashboard Page...");
    }

    public DashboardPage validate_Dashboard_Page(){
        Assert.assertEquals(dashboardText.getText(),"Admin Dashboard");
        logger.info("Verified Dashboard text...");
        return this;
    }

    public MyCoursesPage click_MyCourses_Link(){
        lnkMyCourses.click();
        logger.info("Clicked on My Courses Link...");
        return new MyCoursesPage(driver);
    }

    public DashboardPage click_On_Find_Learning_Tab(){

        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        return this;

    }

}
