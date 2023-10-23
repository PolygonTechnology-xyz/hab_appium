package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
/* import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder; */

public class AppTest {

  public AndroidDriver driver;
  
  


  @Before
  public void configAppium() throws MalformedURLException, InterruptedException {

	/* UiAutomator2Options options = new UiAutomator2Options();
	options.setDeviceName("Pixel 6 API 30"); 
		options.setApp(System.getProperty("user.dir")+"/hab/src/test/java/com/appium/resources/hab_driver.apk");
	AndroidDriver driver = new AndroidDriver(new URL("http://192.168.12.172:4723/wd/hub"), options);
	/home/jarin/document/workspace/appium/hab/hab/src/test/java/com/appium/resources/hab_driver.apk
 */

 String appiumServerURL = "http://192.168.12.172:4723/wd/hub";


	//create capabilities
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

	//create object for android

    driver = new AndroidDriver (new URL(appiumServerURL), desiredCapabilities);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

  }

  @Test
  public void Login() throws InterruptedException {

    //driver.findElement(By.xpath("//*[contains(@class, 'className')]"))

    WebElement forgetPass = driver.findElement(By.xpath("//android.view.View[@index = '6']"));
    Thread.sleep(2000);
    forgetPass.click();


    WebElement backToLogin = driver.findElement(By.xpath("//android.view.View[@index = '3']"));
    Thread.sleep(2000);
    backToLogin.click();


    WebElement useridTextBox =  driver.findElement(By.xpath("//android.widget.EditText[@index = '3']"));
    useridTextBox.click();
    Thread.sleep(2000);
    useridTextBox.sendKeys("user id");
    Thread.sleep(2000);


    WebElement passwordTextBox = driver.findElement(By.xpath("//android.widget.EditText[@index = '5']")); 
    passwordTextBox.click();
    Thread.sleep(2000);
    passwordTextBox.sendKeys("password");
    Thread.sleep(2000);

    WebElement loginButton = driver.findElement(By.xpath("//android.view.View[@index = '7']"));
    loginButton.click();
    
  }

  /* @After
  public void tearDown() {
    driver.quit();
  } */
}



