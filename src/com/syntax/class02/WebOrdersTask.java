package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrdersTask {
    /**
     * Task
     * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/
     * WebOrders/login.aspx
     * Login
     * Get title and verify
     * logout
     * close the browser
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        String title = driver.getTitle();
        String expected = "Web Orders";
        if (title.equals(expected)) {
            System.out.println("Correct title.");
        } else {
            System.out.println("Incorrect title.");
        }
        Thread.sleep(2000);
        driver.findElement(By.name("ctl00_logout")).click();
        driver.quit();

    }
}







