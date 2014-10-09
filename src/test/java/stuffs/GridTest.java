package stuffs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {

	@Test
	public void gridTestMethod() throws MalformedURLException, InterruptedException{
		
		DesiredCapabilities c=new DesiredCapabilities();
		c.setBrowserName("firefox");
		
//		FirefoxProfile fp=new ProfilesIni().getProfile("fireFoxProfile");
//		fp.setAcceptUntrustedCertificates(true);

		WebDriver driver=new RemoteWebDriver(new URL("http://IN1W7L-522261.ttg.global:4444/wd/hub"), c);
		driver.get("https://www.google.com");
	
		Thread.sleep(10000);
		driver.close();
	}
	
}
