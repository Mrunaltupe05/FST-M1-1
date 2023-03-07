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

public class HrmActivity4 {
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
    public void newEmployee() throws Exception
    {
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        //Thread.sleep(2000);

        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("firstName")).sendKeys("Kavita");
        Thread.sleep(2000);

        driver.findElement(By.id("lastName")).sendKeys("Tupe");
        Thread.sleep(2000);

        driver.findElement(By.id("employeeId")).clear();
        driver.findElement(By.id("employeeId")).sendKeys("1006KT");
        Thread.sleep(2000);

        driver.findElement(By.id("chkLogin")).click();
        driver.findElement(By.id("user_name")).sendKeys("orange1");
        Thread.sleep(2000);

        driver.findElement(By.id("user_password")).sendKeys("orangepass123");
        driver.findElement(By.id("re_password")).sendKeys("orangepass123");
        Thread.sleep(2000);

        Select status1 = new Select(driver.findElement(By.id("status")));
        status1.selectByValue("Enabled");
        Thread.sleep(2000);

        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Kavita Tupe");
        driver.findElement(By.id("empsearch_id")).sendKeys("1006KT");
        Thread.sleep(2000);

        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(5000);

    }
    @AfterTest
    public void afterMethod()
    {
        driver.quit();
    }
}
