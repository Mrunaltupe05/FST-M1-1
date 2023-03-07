package HrmProject;

import com.google.common.collect.RowSortedTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HrmActivity9 {
    WebDriver driver;

    @BeforeTest
    public void beforeMethod() throws Exception
    {
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("http://alchemy.hguy.co/orangehrm");

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        Thread.sleep(2000);

        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        Thread.sleep(2000);

        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);

    }

    @Test
    public void emergencyContacts()
    {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b")).click();
        driver.findElement(By.linkText("Emergency Contacts")).click();


        WebElement table= driver.findElement(By.xpath("//*[@id=\"emgcontact_list\"]"));
        List<WebElement> rowList = table.findElements(By.tagName("tr"));

        List<WebElement> columnValue = null;

        for(WebElement row : rowList)
        {
            columnValue = row.findElements(By.tagName("td"));

            for (WebElement column : columnValue)
            {
                System.out.println("column text:" +column.getText()+ ",");
            }
        }

    }
    @AfterTest
    public void quit()
    {
        driver.quit();
    }
}
