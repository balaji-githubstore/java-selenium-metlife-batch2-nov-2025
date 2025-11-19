package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Demo5MultipleTabs {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.db4free.net/");

        //click on phpMyAdmin »
        //b[contains(text(),'phpMyAdmi')]
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();

        //switch to 2nd tab
        ArrayList<String> windows=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        driver.findElement(By.id("input_username")).sendKeys("admin");
        //enter the password as admin123
        //click on login

        driver.close(); //close the current tab

        driver.switchTo().window(windows.get(0));

        System.out.println(driver.getTitle());

    }
}
