package tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class WhatsAppTest {

    @Test
    public void whatsAppTest() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
        capabilities.setCapability("device", "Android");
        capabilities.setCapability(CapabilityType.VERSION, "4.2");
        capabilities.setCapability(CapabilityType.PLATFORM, "Windows");
        
        capabilities.setCapability("app", "C:"+"\\"+"Users/sahur/lunaworkspace/selenium/src/test/resources/com.whatsapp.apk");      //This is path of your application
        capabilities.setCapability("app-package", "com.whatsapp");                    // This is package name of your app
        capabilities.setCapability("app-activity", "com.whatsapp.Main");                          // This Launcher activity of your app

    RemoteWebDriver remoteWebDriver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    remoteWebDriver.get("https:\\www.google.com");
    }

}