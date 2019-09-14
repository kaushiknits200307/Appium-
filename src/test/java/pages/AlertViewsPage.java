package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertViewsPage
        extends BasePage
{
    public static By text_entry_alert = By.xpath("//XCUIElementTypeStaticText[@name='Text Entry']");
    public static By other_alert = By.xpath("//XCUIElementTypeStaticText[@name='Other']");
    public static By alert_desc = By.xpath("//XCUIElementTypeStaticText[@name='A Short Title Is Best']");
    public static By ok_btn = By.xpath("//XCUIElementTypeStaticText[@name='OK']");
    public static By choice_one_btn = By.xpath("//XCUIElementTypeStaticText[@name='Choice One']");


    public AlertViewsPage(IOSDriver driver, WebDriverWait wait){
        super(driver, wait);
        isElementPresent(text_entry_alert);
    }

    public void goToTextEntryAlert(){
        isElementPresent(text_entry_alert);
        click(text_entry_alert);
        isElementPresent(alert_desc);
        click(ok_btn);
    }

    public void goToOtherAlert(){
        isElementPresent(other_alert);
        click(other_alert);
        isElementPresent(alert_desc);
        click(choice_one_btn);
    }
}
