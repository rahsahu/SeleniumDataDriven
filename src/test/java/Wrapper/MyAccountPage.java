package Wrapper;

import org.openqa.selenium.By;

public class MyAccountPage {

	public static By myaccountHeading=By.xpath("//div[@id='main_contain']/div/h3");
	public static By myHistoryHeading=By.xpath("//div[@id='main_contain']/div/div[2]/h3");
	public static By myNumberHeading=By.xpath("//div[@id='main_contain']/div/div/table/tbody/tr[1]/td[1]");
	public static By myNumberValue=By.xpath("//div[@id='main_contain']/div/div/table/tbody/tr[1]/td[2]");
	public static By myCoinsHeading=By.xpath("//div[@id='main_contain']/div/div/table/tbody/tr[2]/td[1]");
	public static By myCoinsText=By.xpath("//div[@id='main_contain']/div/div/table/tbody/tr[2]/td[2]");
	public static By myHistory=By.xpath("//div[@id='main_contain']/div/div[2]/div/p");
	
	public static By getCoinsLink=By.xpath("//div[@id='main_contain']/div/p/a");
	public static String title="Home - mProov";
	public static String myAccountPageTitle="mProov";
	public static String myAccountHeadingValue="My Account";
	public static String MyHistoryHeadingValue="My Download History";
	public static String getCoinsLinkValue="What can I get with my MoCoins?";
	public static String myNumberHeadingValue="My Number:";
	public static String myCoinsHeadingValue="My MoCoins:";
	public static String myHistoryValue="No History";

	
	
	


	
	//div[@id='main_contain']/div/p/a
	
}
