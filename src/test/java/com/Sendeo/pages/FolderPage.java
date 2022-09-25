package com.Sendeo.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FolderPage extends HomePage{

    @AndroidFindBy(id = "io.selendroid.testapp:id/inputUsername  !")
    public MobileElement usernameInputBox;

    @AndroidFindBy(accessibility = "email of the customer")
    public MobileElement emailInputBox;

    @AndroidFindBy(id = "io.selendroid.testapp:id/inputPassword")
    public MobileElement passwordInputBox;

    @AndroidFindBy(id = "io.selendroid.testapp:id/inputName  !")
    public MobileElement nameInputBox;

    @AndroidFindBy(id = "io.selendroid.testapp:id/btnRegisterUser")
    public MobileElement registerUserButton;

    @AndroidFindBy(id = "io.selendroid.testapp:id/label_name_data")
    public MobileElement nameData;

    @AndroidFindBy(id = "io.selendroid.testapp:id/label_username_data")
    public MobileElement usernameData;

    @AndroidFindBy(id = "io.selendroid.testapp:id/label_password_data")
    public MobileElement passwordData ;

    @AndroidFindBy(id = "io.selendroid.testapp:id/label_email_data")
    public MobileElement emailData;


}
