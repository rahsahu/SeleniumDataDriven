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
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import Wrapper.DriverWrapper;
import Wrapper.MyAccountPage;
import Wrapper.ProSportsPage;

public class ProSportsTest extends DriverCommonAction {

	SoftAssert softAssert=new SoftAssert();
	
	@Test(dataProvider = "ProSportsTest", groups = { "ProSports", "all", "app" })
	public void carrierIDONE(String url) throws Exception {
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
		util.findElement(ProSportsPage.menu).click();
		
		
		softAssert.assertEquals(driver.getTitle().equalsIgnoreCase(ProSportsPage.title), true);
		util.verifyText(ProSportsPage.SubMenu1, ProSportsPage.subMenu1Text);
		util.verifyText(ProSportsPage.SubMenu2, ProSportsPage.subMenu2Text);
		util.verifyText(ProSportsPage.SubMenu3, ProSportsPage.subMenu3Text);
		util.verifyText(ProSportsPage.SubMenu4, ProSportsPage.subMenu4Text);
		util.verifyText(ProSportsPage.SubMenu5, ProSportsPage.subMenu5Text);
		util.verifyText(ProSportsPage.SubMenu6, ProSportsPage.subMenu6Text);
		util.verifyText(ProSportsPage.SubMenu7, ProSportsPage.subMenu7Text);

		
		//Verified Menu on Body
		util.findElement(ProSportsPage.menu).click();
		util.verifyText(ProSportsPage.bodyMenu1, ProSportsPage.subMenu2Text);
		util.verifyText(ProSportsPage.bodyMenu2, ProSportsPage.subMenu3Text);
		util.verifyText(ProSportsPage.bodyMenu3, ProSportsPage.subMenu4Text);
		util.verifyText(ProSportsPage.bodyMenu4, ProSportsPage.subMenu5Text);
		util.verifyText(ProSportsPage.bodyMenu5, ProSportsPage.subMenu6Text);
		
		//Verification of footer link and its text

		util.verifyText(ProSportsPage.footerLink1, ProSportsPage.subMenu1Text);
		util.verifyText(ProSportsPage.footerLink2, ProSportsPage.subMenu2Text);
		util.verifyText(ProSportsPage.footerLink3, ProSportsPage.subMenu3Text);
		util.verifyText(ProSportsPage.footerLink4, ProSportsPage.subMenu4Text);
		util.verifyText(ProSportsPage.footerLink5, ProSportsPage.subMenu5Text);
		util.verifyText(ProSportsPage.footerLink6, ProSportsPage.subMenu6Text);
		util.verifyText(ProSportsPage.footerLink7, ProSportsPage.subMenu7Text);
		util.verifyText(ProSportsPage.footerLink8, ProSportsPage.footer8Text);
		util.verifyText(ProSportsPage.footerLink9, ProSportsPage.footer9Text);
		util.verifyText(ProSportsPage.footerLink10, ProSportsPage.footer10Text);
		util.verifyText(ProSportsPage.footerLink11, ProSportsPage.footer11Text);
		
		//image varification
		util.findElement(ProSportsPage.imgLink);
		
		//My Account Page Verification
		util.findElement(ProSportsPage.menu).click();
		util.findElement(ProSportsPage.SubMenu7).click();
		util.waitForPageLoad();
		softAssert.assertEquals(driver.getTitle().equalsIgnoreCase(ProSportsPage.myAccountPageTitle), true);
		util.verifyText(ProSportsPage.myaccountHeading, ProSportsPage.myAccountHeadingValue);
		util.verifyContainText(ProSportsPage.myHistoryHeading, ProSportsPage.MyHistoryHeadingValue);
		util.verifyText(ProSportsPage.myNumberHeading, ProSportsPage.myNumberHeadingValue);
		util.verifyText(ProSportsPage.getCoinsLink, ProSportsPage.getCoinsLinkValue);


		//Vefiry sub menu present and their text
		util.findElement(ProSportsPage.menu).click();

		util.verifyText(ProSportsPage.SubMenu1, ProSportsPage.subMenu1Text);
		util.verifyText(ProSportsPage.SubMenu2, ProSportsPage.subMenu2Text);
		util.verifyText(ProSportsPage.SubMenu3, ProSportsPage.subMenu3Text);
		util.verifyText(ProSportsPage.SubMenu4, ProSportsPage.subMenu4Text);
		util.verifyText(ProSportsPage.SubMenu5, ProSportsPage.subMenu5Text);
		util.verifyText(ProSportsPage.SubMenu6, ProSportsPage.subMenu6Text);
		util.verifyText(ProSportsPage.SubMenu7, ProSportsPage.subMenu7Text);

		
	
		//Verification of footer link and its text

		util.verifyText(ProSportsPage.footerLink1, ProSportsPage.subMenu1Text);
		util.verifyText(ProSportsPage.footerLink2, ProSportsPage.subMenu2Text);
		util.verifyText(ProSportsPage.footerLink3, ProSportsPage.subMenu3Text);
		util.verifyText(ProSportsPage.footerLink4, ProSportsPage.subMenu4Text);
		util.verifyText(ProSportsPage.footerLink5, ProSportsPage.subMenu5Text);
		util.verifyText(ProSportsPage.footerLink6, ProSportsPage.subMenu6Text);
		util.verifyText(ProSportsPage.footerLink7, ProSportsPage.subMenu7Text);
		util.verifyText(ProSportsPage.footerLink8, ProSportsPage.footer8Text);
		util.verifyText(ProSportsPage.footerLink9, ProSportsPage.footer9Text);
		util.verifyText(ProSportsPage.footerLink10, ProSportsPage.footer10Text);
		util.verifyText(ProSportsPage.footerLink11, ProSportsPage.footer11Text);

		
	}

	
}
