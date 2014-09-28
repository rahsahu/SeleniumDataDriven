package tests;

import org.testng.annotations.DataProvider;

import Wrapper.Wrapper;

public class AllDataProviderClass {
	@DataProvider(name = "DP1")
	public static Object[][] createData() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return Wrapper.getTableArray(
				dir
						+ "/src/test/resources/testdata/LINKS.xls", "Pages",
				"Pages");

	}
	
	
	@DataProvider(name = "DPTWO")
	public static Object[][] createDataDPTWO() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return Wrapper.getTableArray(
				dir
						+ "/src/test/resources/testdata/LINKS.xls", "pid",
				"pidtwo");

	}
	
}
