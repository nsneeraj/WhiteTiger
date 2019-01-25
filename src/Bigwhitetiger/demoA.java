package Bigwhitetiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class demoA {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	// open the browser
	WebDriver driver = new ChromeDriver();
	//to mainage time for findelement
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//to maximize window 
	driver.manage().window().maximize();
	//to enter url
	driver.get("https://www.vtiger.com/");
	//To click or perform the Resourses
	WebElement link = driver.findElement(By.xpath("//a[text()='Resources']"));
	//To perform mouse action
	Actions action = new Actions(driver);
	action.moveToElement(link).perform();
	//To click on Drop Down'Contact'
	driver.findElement(By.xpath("//a[text()='Contact']")).click();
	//To store hr  contact number of Bangalore
	String num = driver.findElement(By.xpath("//div[text()='Human Resources']/../div[contains(text(),'+91 80 23501152')]")).getText();
	System.out.println("Bnglore hr number is "+num);
	//to store media email
	String email = driver.findElement(By.xpath("//div[text()='Media']/../div[contains(text(),'mktg@vtiger.com')]")).getText();
	System.out.println("email of media is"+email);
	driver.close();
}}

