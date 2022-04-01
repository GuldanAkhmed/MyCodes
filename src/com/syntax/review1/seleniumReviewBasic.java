package com.syntax.review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumReviewBasic {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://gmail.com");
        driver.get("https://demoqa.com/text-box");
        WebElement userName = (WebElement) driver.findElement(By.id("userName"));
        userName.sendKeys("akbarakedabra");
        userName.clear();
        userName.sendKeys();
        driver.quit();
        Thread.sleep(5000);







    }
}
