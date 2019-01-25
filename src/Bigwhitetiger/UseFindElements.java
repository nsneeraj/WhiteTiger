package Bigwhitetiger;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseFindElements {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
       List<WebElement> alllinks = driver.findElements(By.tagName("a"));
     
     //WebElement link = alllinks.get(0);
    // link.click();
     
     int count = alllinks.size();
	 System.out.println(count);
	 for(int i=0;i<count;i++){
		WebElement ase = alllinks.get(i);
	String text = ase.getText();
		System.out.println(text);
    //  List<WebElement> linksal =  driver.findElements(By.xpath("(//a)[2])"));
     
}driver.close();
}}
