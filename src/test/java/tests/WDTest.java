package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Wrapper.DriverWrapper;

public class WDTest extends DriverCommonAction {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTestSetup() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new FirefoxDriver(capabilities);

	}

	@Test(dataProvider = "DP1", groups = { "All" })
	public void startTest(String url, String p1, String v1, String p2,
			String v2, String p3, String v3) throws Exception {

		DriverWrapper util = new DriverWrapper(driver);
		String aURL = url + p1 + v1 + "&" + p2 + v2 + "&" + p3 + v3;

		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		Thread.sleep(12000);
		// util.waitForPageLoad();
		//
		// System.out.print(driver.getTitle()+" " +v1 + " "+v2 + " "+v3+"\n");
		// System.out.println(driver.getPageSource());
		By by[] = {
				By.xpath("//img[@alt='Submit']"),
				By.xpath("//img[@id='submit-button-submit_button_paynow_blue']"),
				By.id("submit-button-submit_button_paynow_blue"),

		};
		boolean istrue = false;
		for (int i = 0; i < by.length; i++) {
			istrue = false;
			try {

				WebElement payNowButton = driver.findElement(by[i]);
				istrue = true;
				// Boolean
				// isEqual=payNowButton.getText().equalsIgnoreCase("Pay Now");
				// System.out.println(" pay now image present for "+" " +v1 +
				// " "+v2
				// + " "+v3 + payNowButton.getText());
			} catch (Exception e) {
				istrue = false;
				// System.out.println(by[i].toString()
				// +" pay now image not present for " + " " + v1
				// + " " + v2 + " " + v3);
			}

		}
		if (istrue) {
			System.out.println(aURL);
		} else {
			System.err.println(aURL);

		}

		
		
		if (v3.equalsIgnoreCase("2")) {
			boolean istrue1 = false;
			try {
				WebElement cancelButton = driver.findElement(By
						.linkText("Cancel"));
				istrue1=true;
			} catch (Exception e) {
				istrue = false;
				// System.out.println(by[i].toString()
				// +" pay now image not present for " + " " + v1
				// + " " + v2 + " " + v3);
			}
			if (!istrue1)  {
				System.err.println("Cancel Link "+ aURL);

			}
		}

	}

	@AfterTest
	public void teardown() {
		if (driver != null)
			driver.close();
	}

}
