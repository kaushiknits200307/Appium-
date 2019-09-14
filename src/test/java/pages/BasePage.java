package pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public IOSDriver driver;
    public WebDriverWait wait;

    public BasePage(IOSDriver driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    /*
        wait until element to be visible.
    */
    public void waitUntilElementVisible(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    /*
        click on the element.
    */
    public void click(By element) {
        System.out.println("Click on element.");
        driver.findElement(element).click();
    }

    /*
    check whether element is present or not.
    */
    public boolean isElementPresent(By by) {
        try {
            waitUntilElementVisible(by);
            driver.findElement(by);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
