package pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UICatalogPage
        extends BasePage
{

    public static By alerts_views = By.xpath("//XCUIElementTypeStaticText[@name='Alert Views']");
    public static By app_title = By.xpath("//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText");

    public UICatalogPage(IOSDriver driver, WebDriverWait wait){
        super(driver, wait);
        isElementPresent(app_title);
    }

    public AlertViewsPage goToAlertViews(){
        System.out.println("Navigate to Alert views option.");
        isElementPresent(alerts_views);
        click(alerts_views);
        return new AlertViewsPage(super.driver, super.wait);
    }
}
