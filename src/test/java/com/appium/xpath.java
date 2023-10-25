package com.appium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xpath extends AppTest{
    WebElement forgetPass = driver.findElement(By.xpath("//android.view.View[@index = '6']"));
    WebElement backToLogin = driver.findElement(By.xpath("//android.view.View[@index = '3']"));
    WebElement useridTextBox =  driver.findElement(By.xpath("//android.widget.EditText[@index = '3']"));
    WebElement passwordTextBox = driver.findElement(By.xpath("//android.widget.EditText[@index = '5']")); 
    WebElement viewPass = driver.findElement(By.xpath("//android.widget.ImageView[@index = '0']"));
    WebElement loginButton = driver.findElement(By.xpath("//android.view.View[@index = '7']"));
}
