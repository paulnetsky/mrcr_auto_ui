package io.mrcr.logic.pages.exchange;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AuthPage {
    private final SelenideElement elEmailField = $x("//input[@data-test=\"email_input\"]");
    private final SelenideElement elSendCodeButton = $x("//button[@data-test=\"email_button\"]");

}
