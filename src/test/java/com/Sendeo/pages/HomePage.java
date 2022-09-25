package com.Sendeo.pages;

import com.Sendeo.utils.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);

    }

    @AndroidFindBy(accessibility = "buttonStartWebviewCD")
    public MobileElement chromeIcon;

    @AndroidFindBy(accessibility = "startUserRegistrationCD")
    public MobileElement folderIcon;

    @AndroidFindBy(accessibility = "showPopupWindowButtonCD")
    public MobileElement displayPopUpWindow;

    @AndroidFindBy(accessibility = "visibleButtonTestCD")
    public MobileElement displayTextView;


}
