package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertViewsPage;
import pages.UICatalogPage;

public class AlertViewsPageTest
        extends TestBase
{
    private UICatalogPage _catalogPage;
    private AlertViewsPage _alertViewsPage;

    @BeforeMethod
    void setUp(){
        System.out.println("Clicks on Alerts Menu...");
        _catalogPage = new UICatalogPage(_driver, _wait);
        System.out.println("Select Alert Views options.");
        _alertViewsPage = _catalogPage.goToAlertViews();
    }

    @Test
    void verifyTextEntryAlert(){
        System.out.println("Verify the Text Entry Alert Type.");
        _alertViewsPage.goToTextEntryAlert();
    }

    @Test
    void verifyOtherAlert(){
        System.out.println("Verify the Other Alert Type.");
        _alertViewsPage.goToOtherAlert();
    }
}
