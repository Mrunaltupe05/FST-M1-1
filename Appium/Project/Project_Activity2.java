import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

//Goal: Use the Google Keep app to add a note.
public class Project_Activity2 {


    AndroidDriver driver;
    WebDriverWait wait;

//Open the Google Keep app.

    @BeforeClass
    public void setup() throws MalformedURLException {
        //Setup desired capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();

        //URL

        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Initialize driver
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test()
    public void AddGoogleNote(){
        //Click the Create New Note button to add a new Note.
        driver.findElement(AppiumBy.accessibilityId("New text note")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.id("com.google.android.keep:id/backdrop"))));

        //Add a title for the note and add a small description.
        driver.findElement(AppiumBy.id("com.google.android.keep:id/backdrop")).click();
        driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys("This is Title of Note");

        driver.findElement(AppiumBy.id("com.google.android.keep:id/backdrop")).click();
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("This is note description");
        //Press the back button and make an assertion to ensure that the note was added.
        driver.findElement(AppiumBy.accessibilityId("Open navigation drawer")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.id("com.google.android.keep:id/open_search_bar_text_view"))));

        WebElement note = driver.findElement(AppiumBy.id("com.google.android.keep:id/browse_note_interior_content"));
        Assert.assertTrue(note.isDisplayed());

    }

    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }


}
