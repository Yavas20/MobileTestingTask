# MobileTestingTask
## Before starting to implement Mobile Automation Testing with Appium, 
### 1) I installed :
* Android Studio
* NodeJS
* Appium Server
* Appium Inspector
* appium-doctor in CMD;
### 2) I set up ANDROID_HOME.
### 3) I created 
* Android Emulator (Nexus S Android 5.1.1) 
* Basic Maven project.
### 4) I added :
* Appium client for java
* JUnit5 for validation 
* ApachePOI to retrieve data from Excel into pom.xml
* Maven Surefire Plugin to run test scripts from command line as dependencies and plugins.

```
  <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
                <configuration>
                    <parallel>methods</parallel>
                    <threadCount>4</threadCount>
                    <perCoreThreadCount>false</perCoreThreadCount>
                    <testFailureIgnore>true</testFailureIgnore>
                    <includes>
                        <include>**/Tests*.java</include>
                    </includes>
                </configuration>
            </plugin>

        </plugins>
    </build>
    <dependencies>
        <dependency>
            <groupId>io.appium</groupId>
            <artifactId>java-client</artifactId>
            <version>7.6.0</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.9.0-M1</version>
        </dependency>
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>5.2.2</version>
        </dependency>
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>5.2.2</version>
        </dependency>

    </dependencies>
    
```


## 5)Framework:
### * I used Java as my programming language.
### * I used Maven as a build automation tool. Maven has pom.xml file allows me to manage my dependencies/versions easily.
### * I used Page Object Model to simplify managing and maintaing my framework for myself and others. This design pattern allows me to locate mobile web elements only once in their respective classes so that if there are any problems with any mobile web elements, I know exactly where to go and how to fix it.
### * I created Singleton Design Pattern to allow my framework to pass the same instance of my Appiumdriver in one session. I specified device type, model, application as DesiredCapabilities in Driver class.
### * I created a configuration.properties type of file where I keep the important test data about my framework. I keep Test data that can change the running flow of the whole framework, such as:platform, username/password.
### * I created utility class from existing java library to read from properties type of file. (ConfigurationReader)
### * I implemented the actual coding logic with JAVA-SELENIUM-JUNIT.
### * I created ExcelUtil class to be able to use ready method for retrieving data from Excel file in Test class.

## 6)Test Cases:
## Precondition for Test Cases:

* Background: In every test, user is on the home page.
* Given User is on the home page

         6.1) Test1(verifyDisplayTextViewMessage) :
        
     Scenario: User should be able to click “Display text view” button and see the “Text is sometimes displayed” message

     When User clicks “Display text view” button
     
     Then User should see the “Text is sometimes displayed” message on the screen

        6.2) Test2 (handleDisplayPopupWindow) :
     
     Scenario: User should be able to click “Display Popup Window” button and click any other buttons on the home page

     When User clicks “Display Popup Window” button
     
     Then Verify that other buttons on the home page can be clickable
     
        6.3) Test3 (verifyTouchActionsPartTexts) :
        
     Scenario: User should be able to click “Touch Actions” button and see the texts of the this part on the screen

    When User clicks “Touch Actions” button
    
    Then User should see the texts of the touch actions page on the screen
     
        6.4) Test4 (verifyHomePageTexts) :
        
     Scenario: User should be able to see the texts of the homepage functions

     Then User should be able to see the texts of the homepage functions on the screen

   
    
## 7) Bonus Activities:
        7.1 Test cases and scripts for iOS:
        
### * It is required to:
* Install Xcode 
* Change DesiredCapabilities according to emulator
* Use IOSDriver
* Use suitable methods for IOS 

         7.2 To run codes from command line using Maven:
        
  ### * It is required to:
  * Download and install apache-maven in local computer/laptop
  * Add maven-sure-file plugin into pom.xml
  * Go to project and right click with shift
  * Select open in command line
  * Type mvn clean test





