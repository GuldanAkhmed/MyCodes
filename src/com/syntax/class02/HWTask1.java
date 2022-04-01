package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("Gulden");
        driver.findElement(By.name("customer.lastName")).sendKeys("Akhmedova");
        driver.findElement(By.id("customer.address.street")).sendKeys("1008 Fidelity Dr");
        driver.findElement(By.id("customer.address.city")).sendKeys("Pittsburgh");
        driver.findElement(By.id("customer.address.state")).sendKeys("PA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("15236");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("456-985-3333");
        driver.findElement(By.name("customer.ssn")).sendKeys("123-45-6789");
        driver.findElement(By.id("customer.username")).sendKeys("GldAkh");
        driver.findElement(By.id("customer.password")).sendKeys("Password123456");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Password123456");
        Thread.sleep(5500);
        driver.findElement(By.className("button")).click();
        driver.close();


    }
}



