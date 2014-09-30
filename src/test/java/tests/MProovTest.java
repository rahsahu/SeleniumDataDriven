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
	public static By homeLink=DriverWrapper.ByMProovefooter1XPATH;
	public static By termsLink=DriverWrapper.ByMProovefooter2XPATH;
	public static By privacyLink=DriverWrapper.ByMProovefooter3XPATH;
	public static By helpLink=DriverWrapper.ByMProovefooter4XPATH;
	public static By contactUSLink=DriverWrapper.ByMProovefooter5XPATH;
	public static By appImg=DriverWrapper.ByMProoveimg5XPATH;

	private String subMenu1Text="Home";
	private String subMenu2Text="Job Hunting with Confidence";
	private String subMenu3Text="Different Types of Job Interviews";
	private String subMenu4Text="Knowing when its Time to Leave";
	private String subMenu5Text="Itchy Feet";
	private String subMenu6Text="My Account";
	
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
		//Vefiry sub menu present and their text
		util.findElement(DriverWrapper.ByMProoveMenuXPATH).click();
		util.findElement(s1).getText();
		util.findElement(s2).getText();
		util.findElement(s3).getText();
		util.findElement(s4).getText();
		util.findElement(s5).getText();
		util.findElement(s6).getText();
		util.verifyText(s1, subMenu1Text);
		util.verifyText(s2, subMenu2Text);
		util.verifyText(s3, subMenu3Text);
		util.verifyText(s4, subMenu4Text);
		util.verifyText(s5, subMenu5Text);
		util.verifyText(s6, subMenu6Text);
		
		//Verified Menu on Body
		util.findElement(DriverWrapper.ByMProoveMenuXPATH).click();
		util.findElement(i1).getText();
		util.findElement(i2).getText();
		util.findElement(i3).getText();
		util.findElement(i4).getText();
		util.verifyText(i1, subMenu2Text);
		util.verifyText(i2, subMenu3Text);
		util.verifyText(i3, subMenu4Text);
		util.verifyText(i4, subMenu5Text);
		
		//Verification of footer link
		util.verifyText(homeLink, "Home");
		util.verifyText(termsLink, "Terms");
		util.verifyText(privacyLink, "Privacy");
		util.verifyText(helpLink, "Help");
		util.verifyText(contactUSLink, "Contact Us");
		
		//image varification
		util.findElement(appImg);
		System.out.println(util.findElement(header).getText());
	
	}

	
}
