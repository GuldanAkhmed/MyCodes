package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class HW1 {
    public static String url = "https://www.facebook.com/";
    public static void main(String[] args) throws InterruptedException {

        //TC 1: Facebook dropdown verification
       // Open chrome browser
       // Go to "https://www.facebook.com"
       // click on create new account
       // Verify:
       // month dd has 12 month options
       // day dd has 31 day options
       // year dd has 115 year options
        //Select your date of birth
       // Quit browser
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        WebElement month = driver.findElement(By.xpath(("(//select[@id='month'])[1]")));


        Select monthDD=new Select(month);
        List<WebElement> alloptions=monthDD.getOptions();
        int size=alloptions.size();
        System.out.println("Month DD "+size);
        monthDD.selectByVisibleText("Oct");
        Thread.sleep(1000);

        WebElement day=driver.findElement(By.cssSelector("#day"));
        Select dayDD=new Select(day);
        List<WebElement>allOption1=dayDD.getOptions();
        int size1=allOption1.size();
        System.out.println("Day DD "+size1);
        dayDD.selectByValue("20");
        Thread.sleep(1000);
        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
        Select yearDD=new Select(year);
        List<WebElement>allOption2=yearDD.getOptions();
        int size2=allOption2.size();
        System.out.println("Year "+size2);
        yearDD.selectByValue("1977");
        Thread.sleep(5000);
        driver.quit();










    }


}
