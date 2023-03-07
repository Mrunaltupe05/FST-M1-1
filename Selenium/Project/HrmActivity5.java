package HrmProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HrmActivity5 {
    WebDriver driver;

    @BeforeTest
    public void verifyWebsite() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(5000);
    }
        @Test
                public void editUserDetails() throws Exception
        {

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("orange");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("orangepassword123");
        Thread.sleep(2000);


        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();
        Thread.sleep(2000);


        driver.findElement(By.cssSelector("#menu_pim_viewMyDetails > b:nth-child(1)")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("btnSave")).click();
       // WebElement editButton = driver.findElement(By.id("btnSave"));
       // JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        //executor1.executeScript("arguments[0].click();", editButton);
        Thread.sleep(2000);

        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Kavita");
        Thread.sleep(2000);

        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Kakade");
        Thread.sleep(5000);

         Select nationality = new Select(driver.findElement(By.id("personal_cmbNation")));
         nationality.selectByIndex(82);
         Thread.sleep(5000);
         driver.findElement(By.id("personal_optGender_1")).click();
         Thread.sleep(2000);

         driver.findElement(By.cssSelector("#frmEmpPersonalDetails > fieldset:nth-child(3) > ol:nth-child(3) > li:nth-child(4) > img:nth-child(3)")).click();
         Select month= new Select(driver.findElement(By.className("ui-datepicker-month")));
         month.selectByIndex(1);
         Thread.sleep(2000);

         Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
         year.selectByValue("1978");
         Thread.sleep(2000);

         driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[5]/td[3]")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//input[@id='btnSave']")).click();
         Thread.sleep(2000);


    }
    @AfterTest
    public void afterMethod()
    {
        driver.close();
    }


}