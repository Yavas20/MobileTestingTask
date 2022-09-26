package com.Sendeo.test;

import com.Sendeo.pages.*;

import static org.junit.jupiter.api.Assertions.*;

import com.Sendeo.utils.Driver;
import com.Sendeo.utils.ExcelUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.Map;

public class Tests {

    HomePage homePage = new HomePage();
    DisplayTextViewPage displayTextViewPage = new DisplayTextViewPage();
    TouchActionsPage touchActionsPage = new TouchActionsPage();



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

    public static List<Map<String, String>> getExcelData(){

        ExcelUtil homePageText = new ExcelUtil("src/test/resources/homePageTexts.xlsx", "homepageTexts");
        return homePageText.getDataList();
    }

    @ParameterizedTest
    @MethodSource("getExcelData")
    public void verifyHomePageTexts(Map<String, String> homePageTxts){

        assertEquals(homePageTxts.get("chromeIcon"), homePage.chromeIcon.getAttribute("content-desc"));
        assertEquals(homePageTxts.get("folderIcon"), homePage.folderIcon.getAttribute("content-desc"));
        assertEquals(homePageTxts.get("showProgressBarButton"), homePage.showProgressBarButton.getText());
        assertEquals(homePageTxts.get("acceptAddsCheckBox"), homePage.acceptAddsCheckBox.getText());
        assertEquals(homePageTxts.get("displayTextWiev"), homePage.displayTextView.getText());
        assertEquals(homePageTxts.get("displayAToast"), homePage.displayAToastButton.getText());
        assertEquals(homePageTxts.get("displayWindoePopup"), homePage.displayPopUpWindow.getText());
        assertEquals(homePageTxts.get("throwUnhandledException"), homePage.throwUnhandledException.getText());
        assertEquals(homePageTxts.get("displayAndFocusOnLayout"), homePage.displayAndFocusOnLayout.getText());
        assertEquals(homePageTxts.get("thouchActions"), homePage.touchActions.getText());
    }


    @ParameterizedTest
    @CsvSource({"LAST GESTURE:, Gesture Type, Scale Factor: 1.0, Canvas"})
    public void verifyTouchActionsPartTexts(String actionsHeader, String gestureType, String scaleFactor,
                                            String canvas) {

        homePage.touchActions.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(touchActionsPage.lastGestureHeader));

        assertEquals(actionsHeader, touchActionsPage.lastGestureHeader.getText().trim());

        wait.until(ExpectedConditions.visibilityOf(touchActionsPage.gestureType));
        assertEquals(gestureType, touchActionsPage.gestureType.getText());

        wait.until(ExpectedConditions.visibilityOf(touchActionsPage.scaleFactor));
        assertEquals(scaleFactor, touchActionsPage.scaleFactor.getText());

        wait.until(ExpectedConditions.elementToBeClickable(touchActionsPage.canvasButton));
        assertEquals(canvas, touchActionsPage.canvasButton.getText());


    }



}
