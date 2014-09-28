package Wrapper;

import java.io.File;
import java.util.Iterator;

import com.google.common.base.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import tests.AllDataProviderClass;

import jxl.*;

public class Wrapper {

	private static  WebDriver driver = null;
	private long defaultTimeOut = 10;

	public Wrapper(WebDriver driverdriver) {
		driver = driverdriver;
	}

	public static  WebDriver getDriver() {
		return driver;

	}

	public static String[][] getTableArray(String xlFilePath, String sheetName,
			String tableName) {
		String[][] tabArray = null;
		try {
			Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
			Sheet sheet = workbook.getSheet(sheetName);
			int startRow, startCol, endRow, endCol, ci, cj;
			Cell tableStart = sheet.findCell(tableName);
			startRow = tableStart.getRow();
			startCol = tableStart.getColumn();

			Cell tableEnd = sheet.findCell(tableName, startCol + 1,
					startRow + 1, 100, 64000, false);

			endRow = tableEnd.getRow();
			endCol = tableEnd.getColumn();
			System.out.println("startRow=" + startRow + ", endRow=" + endRow
					+ ", " + "startCol=" + startCol + ", endCol=" + endCol);
			tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
			ci = 0;

			for (int i = startRow + 1; i < endRow; i++, ci++) {
				cj = 0;
				for (int j = startCol + 1; j < endCol; j++, cj++) {
					tabArray[ci][cj] = sheet.getCell(j, i).getContents();
				}
			}
		} catch (Exception e) {
			System.out.println("error in getTableArray()");
			e.printStackTrace();
		}

		return (tabArray);
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
}
