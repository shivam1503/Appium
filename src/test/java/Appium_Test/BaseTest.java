package Appium_Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public AndroidDriver driver;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {
        AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).withLogFile(new File("/Users/shivam.rai/Desktop/AppiumPractice/LearnAppium/src/test/java/resources/appium.log")).build();
        //service.start();


        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel_4_API_30");
        options.setApp("/Users/shivam.rai/Desktop/AppiumPractice/LearnAppium/src/test/java/resources/ApiDemos-debug.apk");


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }

    @AfterClass
    public void tearDown() {
        //driver.quit();
        //service.close();
    }
}
