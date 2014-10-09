package stuffs;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import tests.DriverCommonAction;
import Wrapper.DriverWrapper;
import Wrapper.MHubPage;
import Wrapper.MyCapibilities;


public class MHubTestOnMob extends DriverCommonAction {

	SoftAssert softAssert=new SoftAssert();
	
	@Test(dataProvider = "MHubTest", groups = { "MHubTest", "all", "app" })
	public void carrierIDONE(String url) throws Exception {
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "15e0b14");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	//	capabilities.setCapability("automationName", "Appium");
		URL curl = new URL("http://IN1W7L-522261.ttg.global:4723/wd/hub");
		AppiumDriver driver = new AppiumDriver(curl, capabilities);
	
		MHubPage page=new MHubPage();
		
		String aURL = url;
		System.out.println(aURL);
		driver.manage().deleteAllCookies();
		driver.get(aURL);
	//	driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
	//	util.waitForPageLoad();
		softAssert.assertEquals(driver.getTitle().equalsIgnoreCase(page.title), true);

		//Vefiry sub menu present and their text
		util.findElement(page.menu).click();
		util.verifyText(page.SubMenu1, page.subMenu1Text);
		util.verifyText(page.SubMenu2, page.subMenu2Text);
		util.verifyText(page.SubMenu3, page.subMenu3Text);
		util.verifyText(page.SubMenu4, page.subMenu4Text);
		util.verifyText(page.SubMenu5, page.subMenu5Text);
		util.verifyText(page.SubMenu6, page.subMenu6Text);
		util.verifyText(page.SubMenu7, page.subMenu7Text);

		
		//Verified Menu on Body
		util.findElement(page.menu).click();
		util.verifyText(page.bodyMenu1, page.bodyMenu1Text);
		util.verifyText(page.bodyMenu2, page.bodyMenu2Text);
		util.verifyText(page.bodyMenu3, page.bodyMenu3Text);
		util.verifyText(page.bodyMenu4, page.bodyMenu4Text);
		util.verifyText(page.bodyMenu5, page.bodyMenu5Text);
		
		//Verification of footer link and its text

		util.verifyText(page.footerLink1, page.footer1Text);
		util.verifyText(page.footerLink2, page.footer2Text);
		util.verifyText(page.footerLink3, page.footer3Text);
		util.verifyText(page.footerLink4, page.footer4Text);
		util.verifyText(page.footerLink5, page.footer5Text);

		
		//image varification
		util.findElement(page.imgLink);
		
		//My Account Page Verification
		util.findElement(page.myAccountShotrcutLink).click();
		util.waitForPageLoad();
		softAssert.assertEquals(driver.getTitle().equalsIgnoreCase(page.myAccountPageTitle), true);
		util.verifyText(page.myaccountHeading, page.myAccountHeadingValue);
		util.verifyContainText(page.myHistoryHeading, page.MyHistoryHeadingValue);
		util.verifyText(page.myNumberHeading, page.myNumberHeadingValue);
		util.verifyText(page.getCoinsLink, page.getCoinsLinkValue);


		//Vefiry sub menu present and their text
		util.findElement(page.menu).click();
		util.verifyText(page.SubMenu1, page.subMenu1Text);
		util.verifyText(page.SubMenu2, page.subMenu2Text);
		util.verifyText(page.SubMenu3, page.subMenu3Text);
		util.verifyText(page.SubMenu4, page.subMenu4Text);
		util.verifyText(page.SubMenu5, page.subMenu5Text);
		util.verifyText(page.SubMenu6, page.subMenu6Text);
		util.verifyText(page.SubMenu7, page.subMenu7Text);
		
	
		//Verification of footer link and its text

		util.verifyText(page.footerLink1, page.footer1Text);
		util.verifyText(page.footerLink2, page.footer2Text);
		util.verifyText(page.footerLink3, page.footer3Text);
		util.verifyText(page.footerLink4, page.footer4Text);
		util.verifyText(page.footerLink5, page.footer5Text);

	}
}
