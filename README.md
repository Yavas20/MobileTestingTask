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
* ApachePOI to retrieve data from Excel into pom.xml as dependencies. 

``<dependencies>
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
    </dependencies>``
    
### I used Java as my programming language.
### I used Maven as a build automation tool. Maven has pom.xml file allows me to manage my dependencies/versions easily.
### I used Page Object Model to simplify managing and maintaing my framework for myself and others. This design pattern allows me to locate mobile web elements only once, in their respective classes so that if there are any problems with any web elements, I know exactly where to go and how to fix it.
### I created Singleton Design Pattern to allow my framework to pass the same instance of my Appiumdriver in one session.
### I created a configuration.properties type of file where I keep the important test data about my framework. I keep Test data that can change the running flow of the whole framework, such as:platform, username/password, url.
### I created utility class from existing java library to read from properties type of file. (ConfigurationReader)
### I implemented the actual coding logic with JAVA-SELENIUM-JUNIT.
### 
### 
