package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class GetALinkFromEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of Links " + allLinks.size());

        for (WebElement Link: allLinks){
            String LinkText = Link.getText();
            String fullLink =Link.getText();
            System.out.println(LinkText);
            if(!LinkText.isEmpty()){
                System.out.println(LinkText + "   "+fullLink);
            }
        }
    }
}
