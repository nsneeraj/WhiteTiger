package Bigwhitetiger;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Facebook {
static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws Exception {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	//open the browser
	WebDriver driver = new ChromeDriver(option);
	//to wait app loading
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//to maximize window
	driver.manage().window().maximize();
	//to enter url
	driver.get("https://www.facebook.com/");
	//enter the password
	driver.findElement(By.id("email")).sendKeys("ns1992neeraj@gmail.com");
	//enter password
	driver.findElement(By.id("pass")).sendKeys("9911891300");  
	//click login
	driver.findElement(By.id("u_0_2")).click();
	//click lon usernavugation label
    driver.findElement(By.id("userNavigationLabel")).click();
  // to log out
   // driver.findElement(By.xpath("(//span[contains(@class,'_54nh')])[9]")).click();
     
    	
   WebElement text = driver.findElement(By.xpath("//span[text()='Log Out']"));
   Actions action = new Actions(driver); 
   action.moveToElement(text).click().perform();
	/*TakesScreenshot ts = (TakesScreenshot)driver;
	File src =ts.getScreenshotAs(OutputType.FILE);

	File dest = new File("./Photo/"+"my"+".png");
    FileUtils.copyFile(src, dest);

	
	JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("document.getElementById('email').value='nsneerajsharma83'");
	
	for( int i=0;i<2;i++){
    	
    js.executeScript("window.scrollBy(0, 500)");
    //Thread.sleep(2000);
}
    for (int i=0;i<2;i++){
    	js.executeScript("window.scrollBy(0,-500)");
    	 Thread.sleep(2000);}*/
    
//driver.close();
}}
    
