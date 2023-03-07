package HrmProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HrmActivity7
{
    WebDriver driver;

    WebDriverWait wait;

    @BeforeTest
    public void beforeMethod() throws Exception
    {
        driver= new FirefoxDriver();
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

    @Test
    public void employeeQualification() throws Exception
    {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b")).click();
        Thread.sleep(3000);

        WebElement q =driver.findElement(By.linkText("Qualifications"));
        q.click();
        Thread.sleep(3000);

        driver.findElement(By.id("addWorkExperience")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("experience[employer]")).sendKeys("TCS");
        Thread.sleep(2000);

        driver.findElement(By.name("experience[jobtitle]")).sendKeys("Tester");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#experience_from_date")).click();

        Select joinMonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
        joinMonth.selectByIndex(3);
        Thread.sleep(3000);

        Select joinYear = new Select(driver.findElement(By.className("ui-datepicker-year")));
        joinYear.selectByValue("2019");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[3]/td[1]/a")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#experience_to_date")).click();

        Select endMonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
        endMonth.selectByIndex(11);
        Thread.sleep(2000);

        Select endYear = new Select(driver.findElement(By.className("ui-datepicker-year")));
        endYear.selectByValue("2022");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[5]/td[5]/a")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("btnWorkExpSave")).click();
        Thread.sleep(3000);

    }
    @AfterTest
    public void closeWindow()
    {
        driver.close();
    }
}
