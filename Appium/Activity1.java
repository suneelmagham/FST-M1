package activity;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class Activity1 {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options caps = new UiAutomator2Options();//Android
        caps.setPlatformName("android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("com.android.calculator2");
        caps.setAppActivity(".Calculator");
        caps.noReset(); //

        //Appium Server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Initialize AndroidDriver
        driver = new AndroidDriver(serverURL, caps);
    }

    @Test
    public void addTest(){

        //driver.findElement(AppiumBy.id("com.android.calculator2:id/del")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_5")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/op_add")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_6")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/eq")).click();
        String result1 = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
        System.out.println(result1);
        assertEquals(result1, "11");
        driver.findElement(AppiumBy.id("com.android.calculator2:id/clr")).click();
    }
    @Test
    public void multiplyTest(){
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_5")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/op_mul")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_6")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/eq")).click();
        String result = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
        System.out.println(result);
        assertEquals(result, "30");
        driver.findElement(AppiumBy.id("com.android.calculator2:id/clr")).click();
    }
    @Test
    public void subtractTest(){
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_1")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_0")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/op_sub")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_6")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/eq")).click();
        String result = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
        System.out.println(result);
        assertEquals(result, "4");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
