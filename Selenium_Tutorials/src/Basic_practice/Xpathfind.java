package Basic_practice;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Xpathfind {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement value = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		
		Actions as=new Actions(driver);
		
		as.moveToElement(value).perform();
		
		
		
		
		
		
		
//		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
//		 int size = driver.findElements(By.tagName("iframe")).size();
//		 System.out.println(size);
		
		
//		driver.findElement(By.xpath("//input[@id='u_g_b']")).sendKeys("sudhir");
//		Thread.sleep(2000);
			
		
		
		
		
		
//		driver.get("http://www.airindia.in/");
//			
//		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//		
//		
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.manage().window().fullscreen();
//		
//		String ParentWindowId = driver.getWindowHandle();
//		System.out.println("ParentWindowId is::::----    "+ParentWindowId);
//		Thread.sleep(2000);
//		
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Go')]")).click();
//		Thread.sleep(2000);
//		
//		
//		driver.close();
		
		

	}

}
