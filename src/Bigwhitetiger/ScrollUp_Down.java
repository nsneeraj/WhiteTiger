package Bigwhitetiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        for( int i=0;i<2;i++){
	        	
	        js.executeScript("window.scrollBy(0, 500)");
	        Thread.sleep(2000);
}
	        for (int i=0;i<2;i++){
	        	js.executeScript("window.scrollBy(0,-500)");
	        	 Thread.sleep(2000);
	        }
}
}
