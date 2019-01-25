package Bigwhitetiger;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetionPrint {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		 WebElement e = driver.switchTo().activeElement();
		e.sendKeys("java");
	Thread.sleep(2000);
     List<WebElement> allASE = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	
	 int count = allASE.size();
	 System.out.println(count);
	 for(int i=0;i<count;i++){
		WebElement ase = allASE.get(i);
	String text = ase.getText();
		System.out.println(text);
	 }driver.close();
	 
	}
}   
