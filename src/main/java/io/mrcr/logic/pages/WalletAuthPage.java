package io.mrcr.logic.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WalletAuthPage {
    private SelenideElement elEmailField = $x("//input[@name='email']");

    public WalletAuthPage sendKeysEmailField() {
        elEmailField
                .sendKeys("mrcrtest@yandex.ru");
        return this;
    }


}
