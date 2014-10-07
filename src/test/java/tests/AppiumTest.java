package tests;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppiumTest {

	@Test
	public void mainTest() throws MalformedURLException, InterruptedException
	{
		// java
		//setup the web driver and launch the webview app.
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "15e0b14");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver driver = new AppiumDriver(url, capabilities);

		
	//	Thread.sleep(10000);
		// Navigate to the page and interact with the elements on the guinea-pig page using id.
		driver.get("http://saucelabs.com/test/guinea-pig");
		//Thread.sleep(30000);
		WebElement div = driver.findElement(By.id("i_am_an_id"));
		Assert.assertEquals("I am a div", div.getText()); //check the text retrieved matches expected value
		driver.findElement(By.id("comments")).sendKeys("My comment"); //populate the comments field by id.

		//close the app.
		//driver.quit();
	}
	
}
