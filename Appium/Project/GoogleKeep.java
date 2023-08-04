package liveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GoogleKeep {

    WebDriverWait wait;
    AndroidDriver driver;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setCapability("deviceName", "RZ8M93DMJSZ");
        options.setCapability("platformName", "android");
        options.setCapability("automationName", "UiAutomator2");
        options.setCapability("appPackage", "com.google.android.keep");
        options.setCapability("appActivity", ".activities.BrowseActivity");
        options.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void addnote() {
        driver.findElement(AppiumBy.id("new_note_button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("editable_title")));
        //enter the title
        String notestitle = "NotesTitle";
        driver.findElement(AppiumBy.id("editable_title")).sendKeys(notestitle);
        //enter the desc
        driver.findElement(AppiumBy.id("edit_note_text")).sendKeys("Test Notes for mobile automation");

        //click on back button
        driver.findElement(AppiumBy.accessibilityId("Open navigation drawer")).click();

        //wait for the notes to be added
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("index_note_title")));

        String notesadded = driver.findElement(AppiumBy.id("index_note_title")).getText();
        //Assert to check if the notes added
        Assert.assertEquals(notesadded, notestitle);

    }
}
