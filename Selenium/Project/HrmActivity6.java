package HrmProject;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.FileAssert.fail;

public class HrmActivity6 {
    WebDriver driver;

    WebDriverWait wait;

    @BeforeTest
    public void beforeMethod() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("http://alchemy.hguy.co/orangehrm");

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        Thread.sleep(2000);

        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        Thread.sleep(2000);

        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);

    }

    //@Test
    //public String verifyDirectory() {
        //driver.findElement(By.id("menu_directory_viewDirectory")).click();
        //Thread.sleep(1000);

       // String txt = getClass().getNestHost();
       // if (txt.equals(b))
       // {
          //  System.out.println("Title name present");
   // }


    @AfterTest
    public void closeMethod() {
        driver.close();


    }
}