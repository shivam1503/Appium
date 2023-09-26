package Appium_Test;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Appium_First_Test extends BaseTest {

    @Test
    public void firstTest() throws InterruptedException {

        //AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();


            driver.findElement(AppiumBy.accessibilityId("Preference")).click();
            driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
            driver.findElement(AppiumBy.id("android:id/checkbox")).click();
            driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
            driver.findElement(By.id("android:id/edit")).sendKeys("Shivam Rai");
            driver.findElement(By.id("android:id/button1")).click();


    }
}
