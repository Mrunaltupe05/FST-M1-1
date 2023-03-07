package HrmProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HrmActivity8
{
    WebDriver driver;

    @BeforeTest
    public void beforeMethod() throws Exception
    {
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        driver.get("http://alchemy.hguy.co/orangehrm");

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        Thread.sleep(2000);

        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        Thread.sleep(2000);

        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);

    }

    @Test
    public void leaveApplication()
    {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).click();
        driver.findElement(By.xpath("//span[@class='quickLinkText']")).click();

        driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("Kavita Kakade");
        driver.findElement(By.id("assignleave_txtLeaveType")).click();
        Select type = new Select(driver.findElement(By.name("assignleave[txtLeaveType]")));
        type.selectByIndex(1);

        driver.findElement(By.cssSelector("#assignleave_txtFromDate")).click();
        Select leaveMonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
        leaveMonth.selectByIndex(1);

        Select leaveYear = new Select(driver.findElement(By.className("ui-datepicker-year")));
        leaveYear.selectByValue("2023");

        driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[4]/td[3]/a")).click();

        driver.findElement(By.cssSelector("#assignleave_txtToDate")).click();
        Select tillMonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
        tillMonth.selectByIndex(2);

        Select tillYear = new Select(driver.findElement(By.className("ui-datepicker-year")));
        tillYear.selectByValue("2023");
        driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[4]/a")).click();

        driver.findElement(By.id("assignleave_partialDays")).click();
        Select partialDay = new Select(driver.findElement(By.id("assignleave_partialDays")));
        partialDay.selectByValue("start");

        driver.findElement(By.id("assignleave_txtComment")).sendKeys("Vacation");

        driver.findElement(By.id("assignBtn")).click();
        driver.findElement(By.id("confirmOkButton")).click();

        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();


        }

        @AfterTest
    public void close()
        {
            driver.quit();
        }
}

