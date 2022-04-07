package io.mrcr.tests;

import com.codeborne.selenide.*;
import io.mrcr.logic.driver.DesktopDriver;
import io.mrcr.logic.pages.exchange.MainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class test001TransactionRoutingWithCardUsa implements DesktopDriver {
    private MainPage mainPage;
    private SelenideElement iframe;

    @BeforeMethod
    void setUp() {
        mainPage = new MainPage();
        iframe = $("#widget-container > iframe");
        switchTo().frame(iframe);
    }

    @Test
    void test() {

        mainPage
                .clickCurrencyFromButton()
                .clickUahCurrencyButton()
                .sendKeysFromAmountField("3000")
                .sendKeysAddressField("2NEc63mgqaMF18zttQ94Wy3c4qN7o2MFAAE")
                .clickTermsSwitcher()
                .clickAmountButton()
        ;
    }
}
