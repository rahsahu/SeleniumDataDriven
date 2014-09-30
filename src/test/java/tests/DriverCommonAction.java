package tests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import Wrapper.DriverWrapper;
import Wrapper.UtilWrapper;

public class DriverCommonAction {
	protected WebDriver driver = null;

	@DataProvider(name = "DP1")
	public static Object[][] createData() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "Pages", "Pages");

	}

	@DataProvider(name = "DPTWO")
	public static Object[][] createDataDPTWO() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "pid", "pidtwo");

	}

	@DataProvider(name = "DPAMOUNT")
	public static Object[][] createDataDPAmount() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "pid", "pidamount");

	}
	
	@BeforeTest(groups={"loadDriver"},alwaysRun=true)
	public void LoadDriverBeforeTest() {
		System.out.println("Before Test is getting called");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new FirefoxDriver(capabilities);
		

	}
	
	@DataProvider(name = "product")
	public static Object[][] createDataProduct() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "product", "mproovtest");

	}
	
	@AfterTest(alwaysRun=true)
	public void teardown() {
		System.out.println("After Test is getting called");
		if(driver!=null)
		 driver.quit();
	}
}
