package examples;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static examples.ActionBase.doSwipe;

public class ActionTest {
    // Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);


        // Open the page in Chrome
        driver.get("https://www.training-support.net/selenium");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    public void webAppTest() {
        Dimension dims = driver.manage().window().getSize();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@text='Get Started!']")));
        Point start = new Point((int) (dims.width * 0.5), (int) (dims.height * 0.9));
        Point end = new Point((int) (dims.width * 0.5), (int) (dims.height * 0.6));
        doSwipe(driver, start, end, 100);

        //To-Do List app actions
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.view.View[contains(@text,'To-Do List')]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@resource-id='taskInput']"))).click();
        WebElement addTask = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']"));
        WebElement taskInput = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='taskInput']"));
        taskInput.sendKeys("Add tasks to list");
        addTask.click();
        taskInput.sendKeys("Get Number of tasks");
        addTask.click();
        taskInput.sendKeys("Clear the list");
        addTask.click();
    }

    @AfterTest
    public void afterClass() {
        driver.quit();


    }
}
