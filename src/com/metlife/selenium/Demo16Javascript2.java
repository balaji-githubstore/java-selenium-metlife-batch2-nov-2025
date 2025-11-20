package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Demo16Javascript2 {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");

        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.malaysiaairlines.com/us/en/home.html");

        driver.findElement(By.xpath("//span[text()='Accept all cookies']")).click();



    }
}
