package Wrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InGamePage {

	public static By myaccountHeading = By.xpath("//h1");
	public static By contactUsHeading = By.xpath("//h1[2]");
	public static By myNumberHeading = By.xpath("//tr[1]/td[1]");
	public static By myNumberValue = By.xpath("//tr[1]/td[2]");
	// public static By myCoinsHeading=By.xpath("//tr[2]/td[1]");
	// public static By myCoinsText=By.xpath("//tr[2]/td[2]");
	public static By contactUsP1 = By.xpath("//div[2]/p[1]");
	public static By contactUsP2 = By.xpath("//div[2]/p[2]");

//	public static By getCoinsLink = By.xpath("//div/p/a");
	public static String title = "Home - InGame";
	public static String myAccountPageTitle = "InGame";
	public static String myAccountHeadingValue = "My Account";
	public static String contactUsHeadingValue="Contact Us";
	// public static String getCoinsLinkValue="What can I get with my MoCoins?";
	public static String myNumberHeadingValue = "My Number:";
	// public static String myCoinsHeadingValue="My MoCoins:";
	// public static String myHistoryValue="//div[2]/p[2]";
	public static String contactUsP1Value = "INGAME" + "Locked Bag 4005"
			+ "6/78 William St" + "Sydney NSW 2000";
	public static String contactUsP2Value = "Customer Care: 1300886534"
			+ "-or-" + "help@ingame.com.au";

	public static By imgLink = By.xpath("//img[@alt='INGAME']");
	public static By myAccountShotrcutLink = By.xpath("//div[@id='footer']/p[4]/a");
	public static By menu = By.xpath("//div[@id='MatchCentre']/h1/span");
	public static By SubMenu1 = By.xpath("//li[1]/a");
	public static By SubMenu2 = By.xpath("//li[2]/a");
	public static By SubMenu3 = By.xpath("//li[3]/a");
	public static By SubMenu4 = By.xpath("//li[4]/a");
	public static By SubMenu5 = By.xpath("//li[5]/a");
	public static By SubMenu6 = By.xpath("//li[6]/a");
	public static By SubMenu7 = By.xpath("//li[7]/a");

	public static String subMenu1Text = "HOME";
	public static String subMenu2Text = "LATEST NEWS";
	public static String subMenu3Text = "fIXTURES & RESULTS";
	public static String subMenu4Text = "STANDINGS";
	public static String subMenu5Text = "TEAMS";
	public static String subMenu6Text = "STATS ZONE";
	public static String subMenu7Text = "VIDEO";

	public static By bodyMenu1 = By.xpath("//h1/span");
	public static By bodyMenu2 = By.xpath("//h2");
	public static By bodyMenu3 = By.xpath("//li[1]/header/span");
	public static By bodyMenu4 = By.xpath("//li[2]/header/span");
	public static By bodyMenu5 = By.xpath("//li[3]/header/span");

	public static String bodyMenu1Text = "PREMIER LEAGUE";
	public static String bodyMenu2Text = subMenu1Text;
	public static String bodyMenu3Text = subMenu3Text;
	public static String bodyMenu4Text = subMenu4Text;
	public static String bodyMenu5Text = "TOP SCORER";

	public static By footerLink1 = By.xpath("//div[@id='footer']/p[1]");
	public static By footerLink2 = By.xpath("//div[@id='footer']/p[2]/a");
	public static By footerLink3 = By.xpath("//div[@id='footer']/p[3]/a");
	public static By footerLink4 =myAccountShotrcutLink;

	public static String footer1Text = "Homepage";
	public static String footer2Text = "Terms";
	public static String footer3Text = "Privacy";
	public static String footer4Text = "My Account";

	public static By accountPagefooterLink1 = By.xpath("//ul/li[1]/a");
	public static By accountPagefooterLink2 = By.xpath("//ul/li[2]/a");
	public static By accountPagefooterLink3 = By.xpath("//ul/li[3]/a");

	public static String accountPagefooter1Text = footer4Text;
	public static String accountPagefooter2Text = footer2Text;
	public static String accountPagefooter3Text = footer3Text;

}
