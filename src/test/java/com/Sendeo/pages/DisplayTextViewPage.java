package com.Sendeo.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DisplayTextViewPage extends HomePage{

    @AndroidFindBy(id = "io.selendroid.testapp:id/visibleTextView")
    public MobileElement textIsSometimesDisplayed ;
}
