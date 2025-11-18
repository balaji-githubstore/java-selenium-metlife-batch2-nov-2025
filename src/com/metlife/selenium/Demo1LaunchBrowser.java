package com.metlife.selenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo1LaunchBrowser {

    public static void main(String[] args) {

        WebDriver driver1=new ChromeDriver();
        WebDriver driver2=new ChromeDriver();


        driver1.get("https://www.facebook.com/");
        driver2.get("https://www.google.com/");

        //getTitle()
        String actualTitle= driver1.getTitle();
        System.out.println(actualTitle);

        //getCurrentUrl()
        String actualUrl=driver1.getCurrentUrl();
        System.out.println(actualUrl);

        System.out.println(driver2.getTitle());

        System.out.println(driver1.getPageSource());

        driver2.quit();





    }
}
