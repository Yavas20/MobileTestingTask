package com.Sendeo.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChromeIconPage extends HomePage{

    @AndroidFindBy(id = "io.selendroid.testapp:id/goBack")
    public MobileElement goToHomeScreenButton;

    //@AndroidFindBy(accessibility = "Enter your name here!")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Enter your name here!\"]")
    public MobileElement enterYourNameInputBox;

    //@AndroidFindBy(accessibility = "Volvo")
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Volvo\"]")
    public MobileElement volvoCar;

    //@AndroidFindBy(accessibility = "Send me your name!")
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Send me your name!\"]")
    public MobileElement sendMeYourNameButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc=\"Hello: em\"]/android.view.View[4]")
    public MobileElement yourNameIsData;

    @AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc=\"Hello: em\"]/android.view.View[6]")
    public MobileElement yourPreferredCarIsData ;

}
