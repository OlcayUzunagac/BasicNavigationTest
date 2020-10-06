package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String webBrowser){

        WebDriver driver=null;

        if(System.getProperty("os.name").toLowerCase().contains("windows") && webBrowser.toLowerCase().equals("safari")){
            driver=null;
        }else if(System.getProperty("os.name").toLowerCase().contains("mac") && webBrowser.toLowerCase().equals("edge")){
            driver=null;

        }else{
            switch(webBrowser.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

            }

        }
        return driver;

    }

}
