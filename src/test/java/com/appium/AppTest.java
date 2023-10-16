package com.appium;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppTest {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
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

    driver = new AndroidDriver(new URL("http://192.168.12.172:4723/wd/hub"), desiredCapabilities);
  }

  @Test
  public void sampleTest() {

  }

  @After
  public void tearDown() {
    // driver.quit();
  }
}