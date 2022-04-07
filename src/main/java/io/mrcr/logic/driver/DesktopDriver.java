package io.mrcr.logic.driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public interface DesktopDriver {
    @BeforeMethod(alwaysRun = true)
    default void initLocalCapabilities() {
        Configuration.timeout = 10000;
        Configuration.driverManagerEnabled = true;
        Configuration.holdBrowserOpen = true;
        Configuration.fastSetValue = true;
        Configuration.clickViaJs = true;
        Configuration.headless = false;
        Configuration.proxyEnabled = true;
        Configuration.baseUrl = "https://exchange.mrcr.io";

        open(Configuration.baseUrl);
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
