package io.mrcr.logic.pages.exchange;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement elConfirmCountryButton = $("button[data-test='country_confirm']");
    private final SelenideElement elCountrySelector = $x("//button[text()='Germany']");
    private final SelenideElement elCountryField = $x("//*[@id=\"Ra4SSXJIkULIFPSJwRQSD\"]");
    private final ElementsCollection elsCountries = $$x("//*[@data-test='country']");
    private final SelenideElement elConfirmButton = $x("//button[@type='button' and text()='Confirm']");
    private final SelenideElement elFromAmountField = $("input[data-testid='fromAmount']");
    private final SelenideElement elToAmountField = $x("input[data-testid='fromAmount']");
    private final SelenideElement elAddressField = $x("//*[@data-test=\"address_input\"]");
    private final SelenideElement elTermsSwitcher = $x("//button[@data-test=\"amount_switch\"]");
    private final SelenideElement elAmountButton = $x("//button[@data-test=\"amount_button\"]");
    private final SelenideElement elCurrencyFromButton = $x("//div[@class=\"brkt1\"]/span[text()='USD']");
    private final SelenideElement elUahCurrencyButton = $x("//button[@data-testid=\"currencyUAH\"]");

    public MainPage clickConfirmCountryButton() {
        elConfirmCountryButton.click();
        return this;
    }

    public MainPage clickCountrySelector() {
        elCountrySelector
                .should(Condition.visible)
                .click();
        return this;
    }

    public MainPage clickCountryField() {
        elCountryField
                .should(Condition.visible)
                .click();
        return this;
    }

    public MainPage inputAndSelectCountryName(String country) {
        elCountryField
                .sendKeys(country);
        elsCountries
                .should(CollectionCondition.sizeGreaterThan(0))
                .stream().findFirst()
                .orElseThrow(NoClassDefFoundError::new)
                .$(".//span")
                .shouldHave(Condition.text(country))
                .click();
        return this;
    }

    public MainPage clickConfirmButton() {
        elConfirmButton
                .should(Condition.visible)
                .click();
        return this;
    }

    public MainPage checkCountryAfterSelect(String country) {
        $(byText(country)).should(Condition.visible);

        return this;
    }

    public MainPage sendKeysFromAmountField(String fromAmount) {
        elFromAmountField
                .sendKeys(fromAmount);
        return this;
    }

    public MainPage sendKeysToAmountField(String toAmount) {
        elToAmountField
                .sendKeys(toAmount);
        return this;
    }

    public MainPage sendKeysAddressField(String address) {
        elAddressField
                .sendKeys(address);
        return this;
    }

    public MainPage clickTermsSwitcher() {
        elTermsSwitcher
                .click();
        return this;
    }

    public MainPage clickAmountButton() {
        elAmountButton
                .should(Condition.enabled)
                .click();
        return this;
    }

    public MainPage clickCurrencyFromButton() {
        elCurrencyFromButton
                .click();
        return this;
    }

    public MainPage clickUahCurrencyButton() {
        elUahCurrencyButton
                .click();
        return this;
    }
}
