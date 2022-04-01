package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com/");//navigate to the specified url
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title= driver.getTitle();
        System.out.println(title + " " +url);
        Thread.sleep(5000);
        driver.quit();
    }
}
