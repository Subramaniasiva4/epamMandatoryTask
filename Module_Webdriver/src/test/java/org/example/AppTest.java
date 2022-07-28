package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
    /*This test is to test pastebin*/
    @Test
    public  void pasteBin() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pastebin.com/");
        driver.findElement(By.id("postform-text")).sendKeys("Hello from WebDriver");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,360)","");
        driver.findElement(By.xpath("//*[@id=\"select2-postform-expiration-container\"]")).click();
        driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[3]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,360)","");
        driver.findElement(By.id("postform-name")).sendKeys("helloweb");
        driver.findElement(By.tagName("button")).click();
    }
}

