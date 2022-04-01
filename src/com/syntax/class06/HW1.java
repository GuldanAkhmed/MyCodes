package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class HW1 {
    //Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    //verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
    //verify enroll today button is enabled

    public static String url="https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

      String expectedHeader ="Automation Testing Platform By Syntax";
      WebElement HeaderElement=driver.findElement(By.xpath("//a[@href='index.php']"));
      String HeaderText = HeaderElement.getText();

      if (expectedHeader.equals(HeaderText)) {
          System.out.println("there is a match on header text");
      }else{
          System.out.println("The header text does not match expected outcome");

      }
        Thread.sleep(2000);
      driver.switchTo().frame(1);
      WebElement enroll = driver.findElement(By.xpath("//a[@href='index.php']"));
      Thread.sleep(2000);

      if (enroll.isEnabled()){
          System.out.println("The enroll today is enabled");

      }else{
          System.out.println("The enroll button is not enabled");

       // to get all the links the current webpage
          List<WebElement> links=driver.findElements(By.tagName("a"));

          for(WebElement link:links){
            String name=  link.getText();
            if (!name.isEmpty());
              System.out.println(name);


          }


      }


    }
}
