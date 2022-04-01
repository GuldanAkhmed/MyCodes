package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {


    // Go to https://syntaxprojects.com/javascript-alert-box-demo.php
    //click on each button and handle the alert accordingly}
  public static String url= "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement alert=driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        alert.click();;
        Thread.sleep(2000);
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();
        Thread.sleep(2000);

        WebElement confirmBox=driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        confirmBox.click();
        Thread.sleep(2000);
        Alert confirm=driver.switchTo().alert();
        confirm.accept();
        Thread.sleep(2000);

        WebElement alert2= driver.findElement(By.cssSelector(" button[onclick='myPromptFunction()']"));
        alert2.click();
        Thread.sleep(2000);
        Alert text=driver.switchTo().alert();
        Thread.sleep(2000);
        text.sendKeys("My Selenium HW");
        text.accept();
        Thread.sleep(2000);















    }

}