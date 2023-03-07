package HrmProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HrmActivity2and3
{
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/orangehrm");

        WebElement img= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/img"));
        String src= img.getAttribute("src");
        System.out.println("The url is :" +img.getAttribute("src"));


        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("orange");

        WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys("orangepassword123");

        WebElement login= driver.findElement(By.id("btnLogin"));
        login.click();
        driver.close();

    }

}
