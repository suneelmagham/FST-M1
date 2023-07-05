package Examples;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Assert;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import static Examples.ActionsBase.doSwipe;

public class ActionsTest {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options caps = new UiAutomator2Options();//Android
        caps.setPlatformName("android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("com.android.chrome");
        caps.setAppActivity("com.google.android.apps.chrome.Main");
        caps.noReset(); //

        //Appium Server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Initialize AndroidDriver
        driver = new AndroidDriver(serverURL, caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/selenium");
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

        List<WebElement> tasks = driver.findElements(AppiumBy.xpath("//android.view.View[@resource-id='taskList']//android.widget.TextView[@text=' Clear List']"));
        Assert.assertEquals(tasks.size(), 4);

        for (WebElement task : tasks){
            task.click();
        }
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=' Clear List']")).click();
    }

    @AfterTest
    public void afterClass() {
        driver.quit();
    }
}
