package ActivitiesTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGActivity2 {
    WebDriver driver;
    @BeforeClass
    public void beforeTest()
    {
        driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test(priority = 0)
    public void testCase1()
    {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Target Practice");
    }
    @Test(priority=1)
    public void testCase2()
    {
        WebElement blackButton= driver.findElement(By.cssSelector("button.black"));
        Assert.assertEquals(blackButton.getText(),"Black");
    }
    @Test(priority=2,enabled = false)
    public void testCase3()
    {
        String subHeading=driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }
    @Test(priority=3)
    public void testCase4()
    {
        throw new SkipException("skipping this test case");
    }

    @AfterClass
    public void afterMethod()
    {
        driver.close();
    }
}

