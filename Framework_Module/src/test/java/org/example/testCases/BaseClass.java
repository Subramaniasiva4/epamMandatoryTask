package org.example.testCases;

import org.example.App;
import org.example.utilities.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.log4j.Logger;

import static java.lang.Character.getName;

public class BaseClass {
    ReadConfig readConfig = new ReadConfig();
    public String baseURL = readConfig.getApplicationURL();
    public String username = readConfig.getUsername();
    public String password = readConfig.getPassword();
    public static WebDriver driver;
    static Logger logger=  Logger.getLogger(App.class.getName());

    @Parameters("browser")
    @BeforeClass
    public void setup(String br)
    {
        if(br.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//src//Drivers//chromedriver.exe");
            driver=new ChromeDriver();
        } else if (br.equals("ie")) {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") +"//Drivers//msedgedriver.exe");
            driver=new InternetExplorerDriver();
        }
        driver.get(baseURL);
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
