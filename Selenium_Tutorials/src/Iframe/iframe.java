package Iframe;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		 List<WebElement> size = Driver.findElements(By.tagName("iframe"));
		 System.out.println(size.size());
		 
		 
		 Driver.switchTo().frame("iframeResult");
		 
		 
	//OR 	Driver.switchTo().frame(Driver.findElement(By.id("iframeResult")));

		
	
		
		Driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		Thread.sleep(5000);
//		Driver.close();
	}

}
























//Driver.findElement(By.id("iframeResult"))