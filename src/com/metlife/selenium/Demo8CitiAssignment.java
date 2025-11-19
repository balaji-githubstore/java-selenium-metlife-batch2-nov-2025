package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Demo8CitiAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.online.citibank.co.in/");
        driver.findElement(By.xpath("//button[text()='Accept All']")).click();

//        driver.findElement(By.xpath("//div[text()='My Account']")).click();
        //mousehover on My Account
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[text()='My Account']"))).perform();

        driver.findElement(By.xpath("//div[text()='Banking with Citi']")).click();

        //Complete rest

    }
}
