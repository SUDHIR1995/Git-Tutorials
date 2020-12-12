package Basic_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple7 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.airindia.in/");
		long start_time = System.currentTimeMillis();
			
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getClass());
	
		WebElement ele=driver.findElement(By.xpath("//img[@alt='Valid CSS! External website that opens in a new window']"));
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1500)");
		js.executeScript("window.scrollBy(0,-1000)");
		
		
		Thread.sleep(5000);
		
		System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));	
		
		ele.getLocation();
		
		ele.getLocation();
		
		js.executeScript("window.scrollBy(0,-1000)");
		driver.close();
		
	}

}
