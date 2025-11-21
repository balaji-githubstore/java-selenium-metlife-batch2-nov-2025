package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Demo15Javascript1 {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");

        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.malaysiaairlines.com/us/en/home.html");

        driver.findElement(By.xpath("//span[text()='Accept all cookies']")).click();

        //approach 1 - not works
//        driver.findElement(By.xpath("//input[@name='dateDeparture']")).sendKeys("05 Feb 2026");

        //approach 2 - automate the calendar

        //approach 3 - option 1 - using javascript
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("document.querySelector(\"input[name='dateDeparture']\").value='06 Feb 2026'");
        js.executeScript("document.querySelector(\"input[name='dateReturn']\").value='16 Feb 2026'");


        //approach 3 - option 2 - using javascript and webelement
        WebElement ele1= driver.findElement(By.xpath("//input[@name='dateDeparture']"));
        js.executeScript("arguments[0].value='06 Feb 2026'",ele1);

        WebElement ele2= driver.findElement(By.xpath("//input[@name='dateReturn']"));
        js.executeScript("arguments[0].value='16 Feb 2026'",ele2);
    }
}
