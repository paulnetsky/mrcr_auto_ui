package io.mrcr.logic.pages.exchange;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AuthPage {
    private SelenideElement elEmailField = $x("//input[@data-test=\"email_input\"]");
    private SelenideElement elSendCodeButton = $x("data-test=\"email_button\"");

}
