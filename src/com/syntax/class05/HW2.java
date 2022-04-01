package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static String url = "https://www.facebook.com/";
    public static void main(String[] args) throws InterruptedException {

       // Go to facebook sign up page
       // Fill out the whole form
       // Click signup
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Gul");
        driver.findElement(By.name("lastname")).sendKeys("Ahmed");
        driver.findElement(By.name("reg_email__")).sendKeys("gulahmeda@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("gulahmeda@gmail.com");
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
