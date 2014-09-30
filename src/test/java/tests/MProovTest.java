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

public class MProovTest extends DriverCommonAction {

	public static By Menu=DriverWrapper.ByMProoveMenuXPATH;
	public static By header=DriverWrapper.ByMProoveHeaderXPATH;
	public static By s1=DriverWrapper.ByMProoveS1XPATH;
	public static By s2=DriverWrapper.ByMProoveS2XPATH;
	public static By s3=DriverWrapper.ByMProoveS3XPATH;
	public static By s4=DriverWrapper.ByMProoveS4XPATH;
	public static By s5=DriverWrapper.ByMProoveS5XPATH;
	public static By s6=DriverWrapper.ByMProoveS6XPATH;
	public static By i1=DriverWrapper.ByMProoveItem1XPATH;
	public static By i2=DriverWrapper.ByMProoveItem2XPATH;
	public static By i3=DriverWrapper.ByMProoveItem3XPATH;
	public static By i4=DriverWrapper.ByMProoveItem4XPATH;

	//div[@id='footer']/ul/li[1]/
	
	@Test(dataProvider = "product", groups = { "mproov", "all", "app" })
	public void carrierIDONE(String url,String pid,String amount) throws Exception {
		String restURL="&territory=AU&mobile_carrier_id=1";
		

		String aURL = url;
		System.out.println(aURL);
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		util.findElement(DriverWrapper.ByMProoveMenuXPATH).click();
		System.out.println(util.findElement(s1).getText());
		System.out.println(util.findElement(s2).getText());
		System.out.println(util.findElement(s3).getText());
		System.out.println(util.findElement(s4).getText());
		System.out.println(util.findElement(s5).getText());
		System.out.println(util.findElement(s6).getText());
		util.findElement(DriverWrapper.ByMProoveMenuXPATH).click();
		System.out.println(util.findElement(i1).getText());
		System.out.println(util.findElement(i2).getText());
		System.out.println(util.findElement(i3).getText());
		System.out.println(util.findElement(i4).getText());
		
	
	
	}

	
}
