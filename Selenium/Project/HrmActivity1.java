package HrmProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class HrmActivity1 {
    WebDriver driver;
    WebDriverWait wait;

    @Test
    public void verifyWebsite() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("http://alchemy.hguy.co/orangehrm");

        System.out.println("Page Title is : " + driver.getTitle());


    }


    @AfterTest
            public void afterMethod() {

       driver.close();

    }
}

