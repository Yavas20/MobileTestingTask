package com.Sendeo.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class Driver {
    private static AppiumDriver<MobileElement> driver;
    private static URL url;

    private Driver() {
    }

    public static AppiumDriver<MobileElement> getDriver() {
        String platform = ConfigurationReader.getProperty("platform");
        if (Objects.isNull(driver)) {
            switch (platform) {
                case "android":
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus S");
                    desiredCapabilities.setCapability(MobileCapabilityType.APP, "http://search.maven.org/remotecontent?filepath=io/selendroid/selendroid-test-app/0.17.0/selendroid-test-app-0.17.0.apk");
                    try {
                        url = new URL("http://localhost:4723/wd/hub");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    driver = new AndroidDriver<>(url, desiredCapabilities);
                    break;
                case "sauce-mobile":
                    MutableCapabilities caps = new MutableCapabilities();
                    caps.setCapability("platformName","Android");
                    caps.setCapability("appium:deviceName","Android GoogleAPI Emulator");
                    caps.setCapability("appium:deviceOrientation", "portrait");
                    caps.setCapability("appium:platformVersion","12.0");
                    caps.setCapability("appium:automationName", "UiAutomator2");
                    caps.setCapability("appium:app", "storage:filename=selendroid-test-app-0.17.0.apk");
                    MutableCapabilities sauceOptions = new MutableCapabilities();
                    sauceOptions.setCapability("build", "<your build id>");
                    sauceOptions.setCapability("name", "<your test name>");
                    caps.setCapability("sauce:options", sauceOptions);



                    try {
                        URL url = new URL("https://EmreYavas:b2c7b98d-0e1e-42fb-b4cd-335d08b15189@ondemand.apac-southeast-1.saucelabs.com:443/wd/hub");
                        AppiumDriver driver = new AndroidDriver(url, caps);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (Objects.nonNull(driver)) {
            driver.closeApp();
            driver = null;
        }
    }
}