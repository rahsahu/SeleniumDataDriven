package Wrapper;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class DriverHelper {

	public WebDriver getFirefoxDriver() throws MalformedURLException{
		return new FirefoxDriver();
	}
	
	public RemoteWebDriver getRemoteWebDriver(){
		return new RemoteWebDriver(new DesiredCapabilities())
	}
	
	public AppiumDriver getAppiumBrowesrDriver(String host,String port,String platformName,String platformVersion,String deviceName,String browserName) throws MalformedURLException,NullPointerException{
		
		DesiredCapabilities capabilities =new  DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, browserName);
	//	capabilities.setCapability("automationName", "Appium");
		URL curl = new URL("http://host:port/wd/hub");
		AppiumDriver driver = new AppiumDriver(curl, capabilities);
		
		
		return driver;
	}
	
	public AppiumDriver getAppiumAppDriver(String host,String port,String platformName,String platformVersion,String deviceName,String app,String appPackage,String startActivity) throws MalformedURLException{
		
		DesiredCapabilities capabilities =new  DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.whatsapp");
		capabilities.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY, "com.whatsapp.Main");
		capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.whatsapp.Main");

		URL curl = new URL("http://host:port/wd/hub");
		AppiumDriver driver = new AppiumDriver(curl, capabilities);
		return driver;
	}
	
	
}
