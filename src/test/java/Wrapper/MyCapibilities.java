package Wrapper;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;

public class MyCapibilities extends DesiredCapabilities{

	
	public MyCapibilities()
	{
		setJavascriptEnabled(true);
	    setCapability("avd", "api19");
	    setCapability("deviceName", "15e0b14");

	    // capabilities.setCapability("platform", "Windows");

	    setCapability("platformName", "Android");
	    setCapability("platformVersion", "4.4.2");
	    setCapability("automationName", "Appium");
	    setCapability("browserName", "Chrome");
	}
	public AppiumDriver getAppiumDriver(String deviceName,String browser) throws MalformedURLException{
		
		AppiumDriver appiumDriver;
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,browser);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		appiumDriver = new AppiumDriver(url, capabilities);
		return appiumDriver;
	}
	
}
