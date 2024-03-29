package model;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimeOut {

    FirefoxDriver driver;
    //ChromeDriver driver;
    WebDriverWait wait;

    public void timeOut(int timeOutNumber){
        try {
            Thread.sleep(timeOutNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitForElement(By elementLocator){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }
}
