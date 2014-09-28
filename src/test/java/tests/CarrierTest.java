package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import Wrapper.Wrapper;

public class CarrierTest extends AllDataProviderClass {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTestSetup() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new FirefoxDriver(capabilities);

	}

	@Test(dataProvider = "DPTWO", groups = { "TWO" })
	public void carrierIDTWO(String url,String pid) throws Exception {
		String restURL="&territory=AU&mobile_carrier_id=2";
		
		Wrapper util = new Wrapper(driver);
		String aURL = url + "/?pid="+pid + restURL;

		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		Thread.sleep(9000);
		boolean istrue = false;
		try{
		WebElement payNowButton=driver.findElement(By.xpath("//img[@id='submit-button-submit_button_paynow_blue']"));
		
				} catch (ElementNotFoundException e) {
		Assert.assertEquals(true, false);
			}

		try{
		WebElement CancelLink=driver.findElement(By
				.linkText("Cancel"));
		
				} catch (ElementNotFoundException e) {
		Assert.assertEquals(true, false);
			}		
	
		
	}

	@AfterTest(alwaysRun=true)
	public void teardown() {
		if (driver != null)
			driver.close();
	}

}
