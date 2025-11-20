package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo12Frame {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://netbanking.hdfcbank.com/netbanking/");

        //switch to frame using webelement
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));

        driver.findElement(By.name("fldLoginUserId")).sendKeys("jack123");

        //click on continue
        driver.findElement(By.linkText("CONTINUE")).click();

        //switch back to main html
        driver.switchTo().defaultContent();


    }
}
