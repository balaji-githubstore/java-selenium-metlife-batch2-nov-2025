package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo3FBSignUp {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        //firstname as john
        driver.findElement(By.name("firstname")).sendKeys("john");
        //lastname as john123
        driver.findElement(By.name("lastname")).sendKeys("welcome123");
        //click on custom radio button

        //15 Dec 2000
        Select selectDay=new Select(driver.findElement(By.id("day")));
        selectDay.selectByVisibleText("15");

        //select month as Dec
        Select selectMonth=new Select(driver.findElement(By.id("month")));
//        selectMonth.selectByValue("12");
//        selectMonth.selectByIndex(11);
        selectMonth.selectByVisibleText("Dec");

        //select year as 2000
        Select selectYear=new Select(driver.findElement(By.xpath("//select[@title='Year']")));
        selectYear.selectByVisibleText("2000");

        //label[text()='Custom']
        driver.findElement(By.xpath("//input[@value='-1']")).click();


    }

}
