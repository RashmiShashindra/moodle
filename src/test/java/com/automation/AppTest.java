package com.automation;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

import static junit.framework.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest   {

    public static void main( String[] args ) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter number of the desired browser");
        System.out.println("1. Chrome");
        System.out.println("2. IE");
        System.out.println("3. FireFox");
        System.out.println("");

        int number = sc.nextInt();

        App x = new App();
        x.OpenBrowser(number);

    }


}

