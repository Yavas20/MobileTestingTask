package com.Sendeo.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TouchActionsPage extends HomePage{


    @AndroidFindBy(id = "io.selendroid.testapp:id/last_gesture_text_view")
    public MobileElement lastGestureHeader;

    @AndroidFindBy(id = "io.selendroid.testapp:id/gesture_type_text_view")
    public MobileElement gestureType;

    @AndroidFindBy(id = "io.selendroid.testapp:id/scale_factor_text_view")
    public MobileElement scaleFactor;

    @AndroidFindBy(id = "io.selendroid.testapp:id/canvas_button")
    public MobileElement canvasButton;











}
