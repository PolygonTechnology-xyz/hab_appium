package com.appium;
import java.net.MalformedURLException;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AppTest {
  
  @Test
  public void Login() throws InterruptedException, MalformedURLException {

      AppiumDriver <WebElement> driver = AppiumDriverCapabilities.getAppiumDriver();
      
      WebElement forgetPass = driver.findElement(By.xpath("//android.view.View[@index = '5']"));
      forgetPass.click();
      Thread.sleep(2000);

      WebElement backToLogin = driver.findElement(By.xpath("//android.view.View[@index = '3']"));
      Thread.sleep(2000);
      backToLogin.click();
      Thread.sleep(3000);

      WebElement useridTextBox = driver.findElement(By.xpath("//android.widget.EditText[@index = '2']"));
      useridTextBox.click();
      Thread.sleep(2000);
      useridTextBox.sendKeys("+8107000000007");
      Thread.sleep(2000);

      WebElement passwordTextBox = driver.findElement(By.xpath("//android.widget.EditText[@index = '4']")); 
      passwordTextBox.click();
      Thread.sleep(2000);
      passwordTextBox.sendKeys("1234567*");
      Thread.sleep(3000);

      WebElement viewPass = driver.findElement(By.xpath("//android.widget.ImageView[@index = '0']")); 
      viewPass.click();
      Thread.sleep(3000);

      WebElement loginButton = driver.findElement(By.xpath("//android.view.View[@index = '6']"));
      loginButton.click();
      Thread.sleep(3000);

      WebElement nextButton1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"次へ進む\"]"));
      nextButton1.click();
      Thread.sleep(2000);
      
      WebElement nextButton2 = driver.findElement(By.xpath("//android.view.View[@index = '2']"));
      nextButton2.click();
      Thread.sleep(2000);

      WebElement nextButton3 = driver.findElement(By.xpath("//android.view.View[@index = '5']"));
      nextButton3.click();
      Thread.sleep(2000);


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

        Thread.sleep(2000);
        WebElement endenTrips = driver.findElement(By.xpath("//android.view.View[@index = '3']"));
        endenTrips.click();
        Thread.sleep(2000);

        touchAction.press(startPoint)
                .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                .moveTo(endPoint).release().perform();

        Thread.sleep(2000);
        WebElement profile = driver.findElement(By.xpath("//android.widget.ImageView[@index = '1']"));
        profile.click();
        Thread.sleep(2000);
        

        Thread.sleep(2000);
        WebElement backbutton2 = driver.findElement(By.xpath("//android.view.View[@index = '0']"));
        backbutton2.click();
        Thread.sleep(2000);
                


  }


  /* @After
  public void tearDown() {
    driver.quit();
  } */
}



