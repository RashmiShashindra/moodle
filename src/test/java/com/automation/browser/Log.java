package com.automation.browser;

import com.automation.pageobjects.LoginPage;
import com.automation.testcases.LoginTest;
import org.testng.log4testng.Logger;

/**
 * Created by RashmiM on 3/21/2016.
 */
public class Log {


    private static Logger logger = Logger.getLogger(Log.class);


    public static void main (String[] args){

        Log L = new Log();

        logger.error("Hi");

        L.runMe("mkyong");

    }


    public void runMe(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }


}
