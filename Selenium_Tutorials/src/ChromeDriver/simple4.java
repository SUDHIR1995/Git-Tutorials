package ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	
	
	Driver.get("https://www.facebook.com/");
	
	Driver.manage().window().maximize();

		
	Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sudhirnitnawre@gmail.com");
	
	Thread.sleep(5000);

	Driver.findElement(By.xpath("//input[@id='email']")).clear();
	
	
	Thread.sleep(5000);
//	
//	Driver.findElement(By.id("email")).sendKeys("sudhirnitnawre@gmail.com");
//	Thread.sleep(2000);
//	Driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
//
//	Driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
//
//	Driver.findElement(By.xpath("//input[@id='pass']")).clear();
//	//	Driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sudhir");
//	
//	
//	

//	Driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	Thread.sleep(5000);
	Driver.close();
	
	
	
}
	
	
	
	
}
