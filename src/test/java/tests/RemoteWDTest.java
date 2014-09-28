package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


import org.openqa.selenium.remote.DesiredCapabilities;
public class RemoteWDTest {

	WebDriver driver=null;
	
	@BeforeTest
	public void beforeTestSetup(){
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS);
		 driver = new FirefoxDriver(capabilities);
		
	}
	
	
	@Test
	public void startTest() 
	{
	
		driver.get("http://www.http://staging.gateway.conveybilling.com/gateway-failed/?pid=11&error_code=2");
		driver.findElement(By.xpath("//input[@id='masthead-search-term']")).sendKeys("selenium");
		
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		if(driver!=null)
		driver.close();
	}
	
	
//	@DataProvider(name = "DP1")
//    public Object[][] createData() {
//        Object[][] retObjArr={{"001","Jack","London"},
//                            {"002","John","New York"},
//                            {"003","Mary","Miami"},
//{"004","George","california"}};
//        return(retObjArr);
//    }
	
}
