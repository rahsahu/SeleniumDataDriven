package Wrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MHubPage {

	public static By myaccountHeading=By.xpath("//h1");
	public static By myHistoryHeading=By.xpath("//div[@id='main_contain']/div/div[2]/a");
	public static By myNumberHeading=By.xpath("//tr[1]/td[1]");
	public static By myNumberValue=By.xpath("//tr[1]/td[2]");
	public static By myCoinsHeading=By.xpath("//tr[2]/td[1]");
	public static By myCoinsText=By.xpath("//tr[2]/td[2]");
	// public static By myHistory=By.xpath("//div[2]/div/p");
	
	public static By getCoinsLink=By.xpath("//div/p/a");
	public static String title="Home - mHub";
	public static String myAccountPageTitle="mHub";
	public static String myAccountHeadingValue="My Account";
	public static String MyHistoryHeadingValue="My Download History";
	public static String getCoinsLinkValue="What can I get with my MoCoins?";
	public static String myNumberHeadingValue="My Number:";
	public static String myCoinsHeadingValue="My MoCoins:";
//	public static String myHistoryValue="No History";
	
	
	public static By imgLink=By.xpath("//img[@alt='mHub']");
	public static By myAccountShotrcutLink=By.xpath("//a[@id='tokens-navbar']/span");
	public static By menu=By.xpath("//img[@alt='Menu']");
	public static By SubMenu1=By.xpath("//li[1]/a");
	public static By SubMenu2=By.xpath("//li[2]/a");
	public static By SubMenu3=By.xpath("//li[3]/a");
	public static By SubMenu4=By.xpath("//li[4]/a");
	public static By SubMenu5=By.xpath("//li[5]/a");
	public static By SubMenu6=By.xpath("//li[6]/a");
	public static By SubMenu7=By.xpath("//li[7]/a");

	
	
	public static By bodyMenu1=By.xpath("//div[1]/div/h2");
	public static By bodyMenu2=By.xpath("//div[2]/div/h2");
	public static By bodyMenu3=By.xpath("//div[3]/div/h2");
	public static By bodyMenu4=By.xpath("//div[4]/div/h2");
	public static By bodyMenu5=By.xpath("//div[5]/div/h2");

	public static String bodyMenu1Text="Hottest Downloads";
	public static String bodyMenu2Text="Lifestyle";
	public static String bodyMenu3Text="Staff picks";
	public static String bodyMenu4Text="Featured Wallpapers";
	public static String bodyMenu5Text="Top Wallpapers";

	
	public static By footerLink1=By.xpath("//div[@id='footer']/ul/li[1]/a");
	public static By footerLink2=By.xpath("//div[@id='footer']/ul/li[2]/a");
	public static By footerLink3=By.xpath("//div[@id='footer']/ul/li[3]/a");
	public static By footerLink4=By.xpath("//div[@id='footer']/ul/li[4]/a");
	public static By footerLink5=By.xpath("//div[@id='footer']/ul/li[5]/a");
	
	public static String subMenu1Text="Home";
	public static String subMenu2Text="Games";
	public static String subMenu3Text="Wallpapers";
	public static String subMenu4Text="Apps";
	public static String subMenu5Text="Funtext";
	public static String subMenu6Text="Lifestyle";
	public static String subMenu7Text="Comedy";


	public static String footer1Text="My Account";
	public static String footer2Text="Terms";
	public static String footer3Text="Privacy";
	public static String footer4Text="Help";
	public static String footer5Text="Contact";
	
	

	

	
}
