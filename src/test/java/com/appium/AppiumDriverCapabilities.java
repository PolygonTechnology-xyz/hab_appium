package com.appium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;

import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverCapabilities {
    public static AppiumDriver <WebElement> driver = null;
    
    @BeforeTest
    public static AppiumDriver <WebElement> getAppiumDriver() throws MalformedURLException{
        
        //AppiumDriver <WebElement> driver = null;

        String appiumServerURL = "http://192.168.12.172:4723/wd/hub";

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appium:platformVersion", "11");
        desiredCapabilities.setCapability("appium:deviceName", "Pixel 6 API 30");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appium:app", "/home/jarin/Desktop/hab_driver.apk");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        driver = new AppiumDriver<WebElement>(new URL(appiumServerURL), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        return driver;
    }
   

}
   
