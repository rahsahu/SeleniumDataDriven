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

import Wrapper.DriverWrapper;

public class CarrierTest extends DriverCommonAction {

	



	@Test(dataProvider = "DPTWO", groups = { "TWO" })
	public void carrierIDTWO(String url,String pid) throws Exception {
		String restURL="&territory=AU&mobile_carrier_id=2";
		

		String aURL = url + "/?pid="+pid + restURL;

		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		
		//Verify paynow button is present or not
		util.findElement(DriverWrapper.BypayNowButton);
		//Verify cancellink is present or not
		util.findElement(DriverWrapper.ByCancelLink);

	
		
	}



}
