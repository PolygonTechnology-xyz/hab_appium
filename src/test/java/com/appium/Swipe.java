package com.appium;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Swipe {

    public void screen() throws MalformedURLException
    {
        AppiumDriver <WebElement> driver = AppiumDriverCapabilities.getAppiumDriver();

        Dimension windowSize = driver.manage().window().getSize();
        int screenHeight = windowSize.getHeight();
        int screenWidth = windowSize.getWidth();

        int xStartPoint = 50 * screenWidth/100;
        int xEndPoint = xStartPoint;
        int yStartPoint = 90 * screenHeight/100;
        int yEndPoint = 10 * screenHeight/100;

        PointOption startPoint = new PointOption<>().withCoordinates(xStartPoint, yStartPoint);
        PointOption endPoint = new PointOption<>().withCoordinates(xEndPoint, yEndPoint);

        TouchAction touchAction = new TouchAction<>(driver);

        touchAction.press(startPoint)
                .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                .moveTo(endPoint).release().perform();


        touchAction.press(startPoint)
                .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                .moveTo(endPoint).release().perform();

    }
    

  /*   public void swipeUp() throws MalformedURLException
    {
        screen();
        
    }


    public void swipeDown() throws MalformedURLException
    {
       

    }

    public void swipeLeft() throws MalformedURLException
    {
       

    }


    public void swipeRight() throws MalformedURLException
    {
        
    } */

    

}
