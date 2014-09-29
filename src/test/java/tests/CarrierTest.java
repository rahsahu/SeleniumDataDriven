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
import org.testng.asserts.Assertion;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import Wrapper.DriverWrapper;

public class CarrierTest extends DriverCommonAction {

	



	@Test(dataProvider = "DPTWO", groups = { "TWO" } )
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
		util.findElement(DriverWrapper.ByPayNowButton);
		//Verify cancellink is present or not
		util.findElement(DriverWrapper.ByCancelLink);

	
	}

	@Test(dataProvider = "DPAMOUNT", groups = { "ONE" })
	public void carrierIDONE(String url,String pid,String amount) throws Exception {
		String restURL="&territory=AU&mobile_carrier_id=1";
		

		String aURL = url + "/?pid="+pid + restURL;
		System.out.println(aURL);
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		
		//Verify paynow button is present or not
		util.findElement(DriverWrapper.ByPayNowButton);
		util.findElement(DriverWrapper.ByCancelXPATH);
		
		WebElement heading=util.findElement(DriverWrapper.ByHeading);
		System.out.println(heading.getText());
		
		util.verifyHelplineMessage();
		
		if(!driver.getPageSource().contains("Only $"+amount+"/wk subscription service"))
			DriverWrapper.softAssert.assertEquals(true, false);
		
	
	}

	
	@Test(dataProvider = "DPTWO", groups = { "THREE" })
	public void carrierIDTHREE(String url,String pid) throws Exception {
		String restURL="&territory=AU&mobile_carrier_id=3";
		

		String aURL = url + "/?pid="+pid + restURL;

		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		
		//Verify paynow button is present or not
		util.findElement(DriverWrapper.ByPayNowButton);
		//Verify cancellink is present or not
	//	util.findElement(DriverWrapper.ByCancelLink);

	
	}
}
