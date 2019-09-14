package tests;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public IOSDriver _driver;
    public WebDriverWait _wait;

    public DesiredCapabilities _capabilities;

    @BeforeClass
    public void openBrowser () {

        System.out.println("Opening the iOS Simulator.");
        _capabilities = new DesiredCapabilities();
        _capabilities.setCapability("platformName", "iOS");
        _capabilities.setCapability("deviceName", "iPhone 7");
        _capabilities.setCapability("platformVersion", "10.0");
        _capabilities.setCapability("app", "/Users/hardikkumar.diyora/Desktop/UICatalog.app");
        _capabilities.setCapability("noReset", true);
        _capabilities.setCapability("deviceOrientation", "portrait");
        _capabilities.setCapability("automationName", "XCUITest");

        try {
            //Create the driver object using iOSDriver, All the TestClasses & PageClasses have to use this driver object.
            _driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), _capabilities);
            //Create a wait. All the TestClasses & PageClasses have to use this wait object.
            _wait = new WebDriverWait(_driver,15);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("Closing the iOS Simulator.");
        _driver.quit();
    }
}