package examples;

import io.appium.java_client.AppiumDriver;
import net.bytebuddy.implementation.bytecode.ShiftLeft;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Arrays;

import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;


public class ActionBase {

    // Create a pointer
    private static final PointerInput pointer = new PointerInput(PointerInput.Kind.TOUCH,"finger");

    //Create scroll action
    //create a swipe method

    public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration){
        // Create sequence
        Sequence swipe =new Sequence(pointer,1)
                .addAction(pointer.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(),start.getX(), start.getY()))
                .addAction(pointer.createPointerDown(LEFT.asArg()))
                .addAction(pointer.createPointerMove(Duration.ofMillis(duration), PointerInput.Origin.viewport(),end.getX(), end.getY()))
                .addAction(pointer.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }
}
