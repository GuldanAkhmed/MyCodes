package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask2 {
   /* navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser*/
   public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       driver.get("https://fb.com");
       driver.manage().window().maximize();
       driver.findElement(By.linkText("Create new account")).click();
       Thread.sleep(2000);
       driver.findElement(By.name("firstname")).sendKeys("Jessica");
       driver.findElement(By.name("lastname")).sendKeys("Alba");
       driver.findElement(By.name("reg_email__")).sendKeys("jessicaalba@gmail.com");
       driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jessicaalba@gmail.com");
       driver.findElement(By.name("reg_passwd__")).sendKeys("1234567");
       driver.findElement(By.name("birthday_month")).sendKeys("Mar");
       driver.findElement(By.name("birthday_day")).sendKeys("18");
        driver.findElement(By.name("birthday_year")).sendKeys("1995");
        driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(4500);
        driver.quit();


   }
}
