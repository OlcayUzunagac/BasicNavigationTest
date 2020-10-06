package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {

        //StringUtility verify = new StringUtility();

        String[] webDriver = {"Chrome", "Firefox", "Edge"};

        for(String value:webDriver) {

            WebDriver driver = BrowserFactory.getDriver(value);
            driver.get("https://google.com");
            String titleGoogle = driver.getTitle();

            driver.get("https://etsy.com");
            String titleEtsy = driver.getTitle();

            driver.navigate().back();
            String actualGoogle = driver.getTitle();

            System.out.println("Verification-1");
            StringUtility.verifyEquals(titleGoogle,actualGoogle);
            //verify.verifyEquals(titleGoogle,actualGoogle);a

            driver.navigate().forward();
            String actualEtsy = driver.getTitle();

            System.out.println("Verification-2");
            StringUtility.verifyEquals(actualEtsy,titleEtsy);
            //verify.verifyEquals(actualEtsy,titleEtsy);

        }


    }
}
