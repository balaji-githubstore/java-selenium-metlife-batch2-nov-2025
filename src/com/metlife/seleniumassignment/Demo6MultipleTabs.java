package com.metlife.seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class Demo6MultipleTabs {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://secure1.inmotionhosting.com/index/login");

//        Click on visit our support center
        driver.findElement(By.xpath("(//span[contains(text(),' Visit Our Support Center')])[2]")).click();

        //switch to 2nd tab
        ArrayList<String> windows=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
        //        Search for “diskspace”
        driver.findElement(By.xpath("//input[@placeholder='Search InMotion Hosting Support Center']")).sendKeys("diskspace");

        driver.findElement(By.xpath("//input[@placeholder='Search InMotion Hosting Support Center']")).sendKeys(Keys.ENTER);

    }
}
