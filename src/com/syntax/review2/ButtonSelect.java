package com.syntax.review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonSelect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement femalebtn=driver.findElement(By.xpath("//div[@class='panel-body']//div//label[@class='radio-inline'][normalize-space()='Female']"));

        //check if the radio button is enabled
        System.out.println("the radio button is enabled "+femalebtn.isEnabled());

        //check if the radio btn female is Displayed
        System.out.println("the female btn is displayed "+femalebtn.isDisplayed());

        //check if its selected or not
        System.out.println("the female btn is Selected "+femalebtn.isSelected());

        //check if the button is not selected and select it
        if (!femalebtn.isSelected()){
            femalebtn.click();

        }

        //check the status of selection again
        System.out.println("the female btn is selected "+femalebtn.isSelected());
    }
}

