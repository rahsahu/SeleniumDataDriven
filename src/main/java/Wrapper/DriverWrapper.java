package Wrapper;

import java.io.File;
import java.util.Iterator;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.base.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import tests.DriverCommonAction;
import jxl.*;

public class DriverWrapper {

	private static  WebDriver driver = null;
	private long defaultTimeOut = 10;
	
	public static By BypayNowButton=By.xpath("//img[@id='submit-button-submit_button_paynow_blue']");
	public static By ByCancelLink=By.linkText("Cancel");
	
	public DriverWrapper(WebDriver driverdriver) {
		driver = driverdriver;
	}

	public static  WebDriver getDriver() {
		return driver;

	}


	public void moveToWindow(String title) {
		Iterator<String> wh = getDriver().getWindowHandles().iterator();
		while (wh.hasNext()) {
			getDriver().switchTo().window(wh.next().toString());
			if (!getDriver().getTitle().contains(title))
				getDriver().close();

		}
	}

	public void waitForPageToLoad(By by, long waitInMilliSeconds) {
		WebElement element = (new WebDriverWait(getDriver(), waitInMilliSeconds))
				.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitForPageToLoad(By by) {
		waitForPageToLoad(by, defaultTimeOut);

	}

	public void waitForPageLoad() {

		Wait<WebDriver> wait = new WebDriverWait(getDriver(), 1000);
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				System.out.println("Current Window State       : "
						+ String.valueOf(((JavascriptExecutor) driver)
								.executeScript("return document.readyState")));
				return String.valueOf(
						((JavascriptExecutor) driver)
								.executeScript("return document.readyState"))
						.equals("complete");
			}
		});
	}
	
//    public WebElement waitForMe(By locatorname, int timeout){
//        WebDriverWait wait = new WebDriverWait(driver, timeout);
//        return wait.until(presenceOfElementLocated(locatorname));
//   }
//
//   public static Function<WebDriver, WebElement> presenceOfElementLocated(final By locator) {
//        
//         return new Function<WebDriver, WebElement>() {
//              @Override
//              public WebElement apply(WebDriver driver) {
//                   return driver.findElement(locator);
//              }
//         };
//   }
	
	public WebElement findElement(By by)
	{
		WebElement element=null;
		try{
			element=getDriver().findElement(by);
			
					} catch (ElementNotFoundException e) {
						Assert.assertEquals(true, false);
				}	
		return element;
	}
	
}
