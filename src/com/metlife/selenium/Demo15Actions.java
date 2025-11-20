package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Demo15Actions {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://online-video-cutter.com/");

        //mousehover on Audio
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Audio']"))).perform();

        driver.findElement(By.xpath("//a[normalize-space()='Change Volume']")).click();


    }
}
