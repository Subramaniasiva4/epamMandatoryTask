package org.example;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static java.lang.Thread.sleep;


public class AppTest {
    @Test
    public void CloudGoogleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cloud.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        sleep(1000);
        driver.findElement(By.name("q")).click();
        WebElement usernameTxt = driver.findElement(By.name("q"));
        usernameTxt.sendKeys("Google Cloud Platform Pricing Calculator");
        String enteredText = usernameTxt.getAttribute("value");
        usernameTxt.submit();
        sleep(5000);
        WebElement documentation= driver.findElement(By.linkText("Google Cloud Pricing Calculator"));
        documentation.click();
        sleep(3000);
        driver.switchTo().frame(0);
        WebElement frame= driver.findElement(By.id("myFrame"));

        driver.switchTo().frame(frame);
        System.out.println(driver.findElement(By.className("md-title")).getText());

        WebElement documentation1 = driver.findElement(By.name("quantity"));
        System.out.println(documentation1.isDisplayed());
        new WebDriverWait(driver, Duration.ofSeconds(3000))
                .until(ExpectedConditions.visibilityOf(documentation1)).sendKeys("4");
        sleep(3000);
        WebElement documentation2= driver.findElement(By.id("select_99"));
        documentation2.click();
        System.out.println(documentation2.isDisplayed());
        driver.findElement(By.id("select_option_88")).click();
        sleep(3000);
        driver.findElement(By.id("select_103")) .click();
        driver.findElement(By.id("select_option_101")).click();
        sleep(1000);
        driver.findElement(By.id("select_111")).click();
        driver.findElement(By.id("select_option_196")).click();
        sleep(3000);
        driver.findElement(By.id("select_113")).click();
        //driver.findElement(By.xpath("//*[@id=select_option_")
        new WebDriverWait(driver, Duration.ofSeconds(2000))
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.id("select_option_419")))).click();
        sleep(1000);
        WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[13]/div[1]/md-input-container/md-checkbox/div[2]"));
        checkbox.click();
        sleep(1000);
        WebElement gpu= driver.findElement(By.id("select_457"));
        gpu.click();
        WebElement gpu1=driver.findElement(By.id("select_option_465"));
        gpu1.click();
        WebElement nGpu= driver.findElement(By.id("select_459"));
        nGpu.click();
        WebElement nGpu1= driver.findElement(By.id("select_option_469"));
        nGpu1.click();
        WebElement ssd= driver.findElement(By.id("select_414"));
        ssd.click();
        WebElement ssd1= driver.findElement(By.id("select_option_441"));
        ssd1.click();
        WebElement dcl= driver.findElement(By.id("select_119"));
        dcl.click();
        new WebDriverWait(driver, Duration.ofSeconds(2000))
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.id("select_option_222")))).click();
        WebElement usage = driver.findElement(By.id("select_126"));
        usage.click();
        WebElement usage1 = driver.findElement(By.id("select_option_124"));
        usage1.click();

//change xpath every time while running because it will change time to time  https://cloud.google.com/products/calculator
        //driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[3]/form/div[13]/button")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'Add to Estimate')]")).click();


    }

}
