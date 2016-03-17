package com.automation;

import org.apache.http.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DriverCommand;

import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.testng.*;
import org.testng.annotations.Test;


public class App
{
       public void OpenBrowser (int no) throws InterruptedException {

        if (no == 1) {
            String exePath = "C:\\Chrome Driver\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
            WebDriver driver = new ChromeDriver();
            driver.get("http://google.com");
            System.out.println("Successfully opened the website google.com");
           // driver.manage().timeouts().wait(2);
            Assert.assertEquals("Google",driver.getTitle());
            System.out.println("Validated Title Tab successfully");
            driver.close();

        }else if (no == 2){
            String service = "C:\\IE Driver\\IEDriverServer.exe";
            System.setProperty("webdriver.ie.driver", service);
            InternetExplorerDriver  driver = new InternetExplorerDriver();
            driver.get("http://google.com");
            System.out.println("Successfully opened the website google.com");
            Assert.assertEquals("Google",driver.getTitle());
            System.out.println("Validated Title Tab successfully");
            driver.quit();

        }else{
            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();
//            Launch the Online Store Website
            driver.get("http://google.com");
            // Print a Log In message to the screen
            System.out.println("Successfully opened the website www.Store.Demoqa.com");
            // Close the driver
            Assert.assertEquals("Google",driver.getTitle());
            System.out.println("Validated Title Tab successfully");
            driver.quit();
        }


    }


    public void ValidateTab (){

        WebDriver driver = null;

        if(driver == new ChromeDriver()){

            Assert.assertEquals("Google", driver.getTitle());
            driver.quit();

        }else if(driver == new InternetExplorerDriver()){

            Assert.assertEquals("Google",driver.getTitle());
            driver.quit();
        }else {

            Assert.assertEquals("Google",driver.getTitle());
            driver.quit();
        }

    }

}
