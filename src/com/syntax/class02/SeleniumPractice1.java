package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice1 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.instagram.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Sign up']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("emailOrPhone")).sendKeys("1234567890");
        driver.findElement(By.name("fullName")).sendKeys("Arianna Grande");
        driver.findElement(By.name("username")).sendKeys("arya");
        driver.findElement(By.name("password")).sendKeys("grande");
        driver.findElement(By.xpath("//div[1]//div[1]//div[1]//form[1]//div[7]//div[1]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
