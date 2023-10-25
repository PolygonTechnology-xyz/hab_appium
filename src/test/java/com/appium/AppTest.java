package com.appium;
import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class AppTest {
  
  @Test
  public void Login() throws InterruptedException, MalformedURLException {

    AppiumDriver <WebElement> driver = AppiumDriverCapabilities.getAppiumDriver();

    //driver.findElement(By.xpath("//*[contains(@class, 'className')]"))
    WebElement forgetPass = driver.findElement(By.xpath("//android.view.View[@index = '6']"));
    Thread.sleep(2000);
    forgetPass.click();

    WebElement backToLogin = driver.findElement(By.xpath("//android.view.View[@index = '3']"));
    Thread.sleep(2000);
    backToLogin.click();

    WebElement useridTextBox = driver.findElement(By.xpath("//android.widget.EditText[@index = '3']"));
    useridTextBox.click();
    Thread.sleep(2000);
    useridTextBox.sendKeys("+8107000000007");
    Thread.sleep(2000);

    WebElement passwordTextBox = driver.findElement(By.xpath("//android.widget.EditText[@index = '5']")); 
    passwordTextBox.click();
    Thread.sleep(2000);
    passwordTextBox.sendKeys("1234567*");
    Thread.sleep(3000);

    WebElement viewPass = driver.findElement(By.xpath("//android.widget.ImageView[@index = '0']")); 
    viewPass.click();
    Thread.sleep(3000);

    WebElement loginButton = driver.findElement(By.xpath("//android.view.View[@index = '7']"));
    loginButton.click();
    Thread.sleep(3000);

    WebElement nextButton1 = driver.findElement(By.xpath("//android.view.View[@index = '2']"));
    nextButton1.click();
    Thread.sleep(2000);
    
    WebElement nextButton2 = driver.findElement(By.xpath("//android.view.View[@index = '3']"));
    nextButton2.click();
    Thread.sleep(2000);

    WebElement nextButton3 = driver.findElement(By.xpath("//android.view.View[@index = '6']"));
    nextButton3.click();
    Thread.sleep(2000);

  }
  /* @After
  public void tearDown() {
    driver.quit();
  } */
}



