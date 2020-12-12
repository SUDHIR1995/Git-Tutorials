package PopUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_PopUp {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Generate ')]")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("sudhir nitnawre");
		Thread.sleep(5000);
		
	
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		
		driver.findElement(By.xpath("//input[@id='male']")).click();
		
//		driver.findElement(By.xpath("//a[contains(text(),'This ')]")).click();
//
//		String urlvalue = driver.getCurrentUrl();
//		System.out.println(urlvalue);
		
		
		
	}

}
