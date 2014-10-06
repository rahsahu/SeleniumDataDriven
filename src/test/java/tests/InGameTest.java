package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Wrapper.DriverWrapper;
import Wrapper.InGamePage;



public class InGameTest extends DriverCommonAction {

	SoftAssert softAssert=new SoftAssert();
	
	@Test(dataProvider = "InGameTest", groups = { "InGameTest", "all", "app" })
	public void carrierIDONE(String url) throws Exception {

		InGamePage page=new InGamePage();
		
		String aURL = url;
		System.out.println(aURL);
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		softAssert.assertEquals(driver.getTitle().equalsIgnoreCase(page.title), true);
	//	util.waitForMe(page.menu,9000);
		
		Thread.sleep(20000);
		
		//Verification of footer link and its text

		util.verifyText(page.footerLink1, page.footer1Text);
		util.verifyText(page.footerLink2, page.footer2Text);
		util.verifyText(page.footerLink3, page.footer3Text);
		util.verifyText(page.footerLink4, page.footer4Text);
		
		//image varification
		util.findElement(page.imgLink);	
		
		//Verified Menu on Body		
		util.verifyText(page.bodyMenu1, page.bodyMenu1Text);
		util.verifyText(page.bodyMenu2, page.bodyMenu2Text);
		util.verifyText(page.bodyMenu3, page.bodyMenu3Text);
		util.verifyText(page.bodyMenu4, page.bodyMenu4Text);
		util.verifyText(page.bodyMenu5, page.bodyMenu5Text);
		
		//Vefiry sub menu present and their text
		util.findElement(page.menu).click();
		util.verifyText(page.SubMenu1, page.subMenu1Text);
		util.verifyText(page.SubMenu2, page.subMenu2Text);
		util.verifyText(page.SubMenu3, page.subMenu3Text);
		util.verifyText(page.SubMenu4, page.subMenu4Text);
		util.verifyText(page.SubMenu5, page.subMenu5Text);
		util.verifyText(page.SubMenu6, page.subMenu6Text);
		util.verifyText(page.SubMenu7, page.subMenu7Text);

		
		
		util.findElement(page.menu).click();

		

		
		//My Account Page Verification
		util.findElement(page.myAccountShotrcutLink).click();
		util.waitForPageLoad();
		softAssert.assertEquals(driver.getTitle().equalsIgnoreCase(page.myAccountPageTitle), true);
		util.verifyText(page.myaccountHeading, page.myAccountHeadingValue);
		util.verifyContainText(page.contactUsHeading, page.contactUsHeadingValue);
		util.verifyText(page.myNumberHeading, page.myNumberHeadingValue);
		util.verifyText(page.contactUsP1, page.contactUsP1Value);
		util.verifyText(page.contactUsP2, page.contactUsP2Value);

	
	
		//Verification of footer link and its text
		util.verifyText(page.accountPagefooterLink1, page.accountPagefooter1Text);
		util.verifyText(page.accountPagefooterLink2, page.accountPagefooter2Text);
		util.verifyText(page.accountPagefooterLink3, page.accountPagefooter3Text);

	}
}
