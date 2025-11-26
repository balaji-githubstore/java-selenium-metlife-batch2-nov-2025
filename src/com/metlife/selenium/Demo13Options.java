package com.metlife.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Demo13Options {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "D:\\balaji");



        options.setExperimentalOption("prefs", prefs);

        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.malaysiaairlines.com/us/en/home.html");

        System.out.println(driver.getTitle());
    }
}
