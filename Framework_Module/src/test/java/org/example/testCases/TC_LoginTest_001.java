package org.example.testCases;

import org.apache.commons.io.FileUtils;
import org.example.page_object.LoginPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TC_LoginTest_001 extends BaseClass {
@Test
    public void loginTest() {

    logger.debug("URL is opened");
    LoginPage lp = new LoginPage(driver);
    lp.setUserName(username);
    logger.debug("Entered username");
    lp.setPassword(password);
    logger.debug("Entered password");
    // Implementing Screenshot with TakesScreenshot interface
    TakesScreenshot ts = (TakesScreenshot) driver;

    //capture screenshot as output type FILE
    File file = ts.getScreenshotAs(OutputType.FILE);

    try {
        //save the screenshot taken in destination path
        FileUtils.copyFile(file, new File("./ScreenShot_Folder/Test1_Login.png"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println("the login page screenshot is taken");

 }
}
