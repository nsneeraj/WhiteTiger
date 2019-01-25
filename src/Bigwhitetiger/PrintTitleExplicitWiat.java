package Bigwhitetiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintTitleExplicitWiat {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//open the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--distance-notification");
		WebDriver driver = new ChromeDriver(options);
		//to wait app loading
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//to maximize window
		driver.manage().window().maximize();
		//to enter url
		driver.get("https://www.naukri.com/");
	     driver.findElement(By.xpath("//div[text()='Login']")).click();
	   
	     driver.findElement(By.id("eLoginNew")).sendKeys("nsneerajsharma83@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("Neeraj@1992");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
}
