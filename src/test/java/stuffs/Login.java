package stuffs;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

public static void main(String[] args) {
    WebDriver driver;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the gmail id: ");
    String emailId = in.next();
    System.out.println("Enter the pass: ");
    String pass = in.next();
 
    driver = new FirefoxDriver(); //open firefox browser
 
    //login to gmail
    driver.get("http://www.gmail.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    driver.findElement(By.name("Email")).sendKeys(emailId);
    driver.findElement(By.name("Passwd")).sendKeys(pass);
    driver.findElement(By.name("signIn")).click();
    String name="";
    //friends with available status
    try {
        List<WebElement> available = driver.findElements(By.xpath("//tr[td[img[contains(@alt,'Available')]]]//td[2]/span[1]"));
        System.out.println("number of friends with available status in the gmail chat: "+available.size());
        if(available.size()!=0){
            System.out.println("Name of the friends with Available status: ");
        }
        for (int i=0; i <available.size(); i++)
        {
            name = available.get(i).getAttribute("textContent");
            System.out.println((i+1)+") "+name);
        }
    } catch (NoSuchElementException e) {
        System.out.println("No one is there with available status.");
    }
   
  //friends with busy status in the gmail chat
    try {
        List<WebElement> busy = driver.findElements(By.xpath("//tr[td[img[@alt='Busy']]]//td[2]/span[1]"));
        System.out.println("number of friends with busy status in the gmail chat: "+busy.size());
        if(busy.size()!=0){
            System.out.println("Name of the friends with busy status: ");
        }
        for (int i=0; i <busy.size(); i++)
        {
            name = busy.get(i).getAttribute("textContent");
            System.out.println((i+1)+") "+name);
        }
    } catch (NoSuchElementException e) {
        System.out.println("No one is with busy status.");
    }
   
  //friends with idle status
    try {
        List<WebElement> idle = driver.findElements(By.xpath("//tr[td[img[@alt='Idle']]]//td[2]/span[1]"));
        System.out.println("number of friends with idle status in the gmail chat: "+idle.size());
        if(idle.size()!=0){
            System.out.println("Name of the friends with idle status: ");
        }
        for (int i=0; i <idle.size(); i++)
        {
            name = idle.get(i).getAttribute("textContent");
            System.out.println((i+1)+") "+name);
        }
    } catch (NoSuchElementException e) {
        System.out.println("No one is with idle status.");
    }
   
  //friends with offline status
    try {
        List<WebElement> offline = driver.findElements(By.xpath("//tr[td[img[@alt='Offline']]]//td[2]/span[1]"));
        System.out.println("number of friends offline in the gmail chat: "+offline.size());
        if(offline.size()!=0){
            System.out.println("Name of the friends offline: ");
        }
        for (int i=0; i <offline.size(); i++)
        {
            name = offline.get(i).getAttribute("textContent");
            System.out.println((i+1)+") "+name);
        }
    } catch (NoSuchElementException e) {
        System.out.println("No one is offline.");
    }
    driver.close();
}
}