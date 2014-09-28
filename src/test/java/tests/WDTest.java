package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import Wrapper.Wrapper;
public class WDTest {

	WebDriver driver=null;
	
	@BeforeTest
	public void beforeTestSetup(){
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS);
		 driver = new FirefoxDriver(capabilities);
		
	}
	
	
	@Test(dataProvider="DP1")
	public void startTest(String url) 
	{
	
		driver.get(url);
		System.out.println(driver.getTitle());
		
		
		
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		if(driver!=null)
		driver.close();
	}
	
	
	@DataProvider(name = "DP1")
    public Object[][] createData() {
		final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
		return Wrapper.getTableArray("C:\\Users\\sahur\\lunaworkspace\\selenium"+"/src/test/resources/testdata/LINKS.xls", "Pages", "Pages");
		
//        Object[][] retObjArr={{"001","Jack","London"},
//                            {"002","John","New York"},
//                            {"003","Mary","Miami"},
//{"004","George","california"}};
//        return(retObjArr);
    }
	
	
}
