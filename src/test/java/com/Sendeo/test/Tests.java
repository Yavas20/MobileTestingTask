package com.Sendeo.test;

import com.Sendeo.pages.ChromeIconPage;
import com.Sendeo.pages.DisplayTextViewPage;
import com.Sendeo.pages.FolderPage;
import com.Sendeo.pages.HomePage;
import static org.junit.jupiter.api.Assertions.*;

import com.Sendeo.utils.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.Alert;

public class Tests {

    HomePage homePage = new HomePage();
    DisplayTextViewPage displayTextViewPage = new DisplayTextViewPage();
    ChromeIconPage chromeIconPage = new ChromeIconPage();
    FolderPage folderPage = new FolderPage();



    @ParameterizedTest
    @ValueSource(strings = {"Text is sometimes displayed"})
    public void verifyDisplayTextViewMessage(String message){

        homePage.displayTextView.click();

        String expectedMessage = message;
        String actualMessage = displayTextViewPage.textIsSometimesDisplayed.getText();
        assertEquals(expectedMessage,actualMessage);

    }


    @Test
    public void handleDisplayPopupWindow(){

        homePage.displayPopUpWindow.click();

        //Alert alert = Driver.getDriver().switchTo().alert();
        //alert.dismiss();

        assertTrue(homePage.displayPopUpWindow.isEnabled());
        assertTrue(homePage.chromeIcon.isEnabled());

    }


    @ParameterizedTest
    @CsvFileSource(resources = "/names.csv", numLinesToSkip = 1)
    public void verifyNamesAndCar(String name) {

     homePage.chromeIcon.click();
     chromeIconPage.enterYourNameInputBox.click();
     chromeIconPage.enterYourNameInputBox.clear();
     chromeIconPage.enterYourNameInputBox.sendKeys(name);
     chromeIconPage.volvoCar.click();
     chromeIconPage.sendMeYourNameButton.click();

     String expectedName = "\"" + name + "\"";
     String actualName = chromeIconPage.yourNameIsData.getAttribute("content-desc");

     assertEquals(expectedName, actualName);

     String expectedCar = "\"Volvo\"";
     String actualCar = chromeIconPage.yourNameIsData.getAttribute("content-desc");

     assertEquals(expectedCar, actualCar);

     chromeIconPage.goToHomeScreenButton.click();


    }

    @Test
    public void verifyNamesAndCars() {

        homePage.chromeIcon.click();
        //System.out.println(chromeIconPage.volvoCar.isDisplayed());
        //chromeIconPage.goToHomeScreenButton.click();


    }

    @Test
    public void verifyRegisterUserFunction(){

        homePage.folderIcon.click();
        folderPage.emailInputBox.click();
        folderPage.passwordInputBox.click();
        folderPage.nameInputBox.click();
        folderPage.registerUserButton.click();


    }


}
