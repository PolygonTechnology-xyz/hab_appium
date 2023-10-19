package com.appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
/* import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder; */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;

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


	//create capabilities
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "android");
    desiredCapabilities.setCapability("appium:platformVersion", "11");
    desiredCapabilities.setCapability("appium:deviceName", "Pixel 6 API 30");
    desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
    desiredCapabilities.setCapability("appium:app", "/home/jarin/Desktop/knower-dev-debug.apk");
    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	//create object for android

    driver = new AndroidDriver (new URL("http://192.168.12.172:4723/wd/hub"), desiredCapabilities);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

  }

  @Test
  public void Login() {

    driver.findElement(By.xpath("//*[contains(@class, 'android.widget.CheckBox')]")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    driver.findElement(By.xpath("[@content-desc ='Googleでログイン']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }

  /* @After
  public void tearDown() {
    driver.quit();
  } */
}



