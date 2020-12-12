package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.facebook.com/");
boolean display=driver.findElement(By.xpath("//input[@name='email']")).isDisplayed();
		System.out.println(display);
		Thread.sleep(2000);
		
		
		boolean enable=driver.findElement(By.xpath("//input[@name='email']")).isEnabled();
		System.out.println(enable);
		Thread.sleep(2000);
		
		boolean select=driver.findElement(By.xpath("//input[@name='email']")).isSelected();
		System.out.println(select);
		Thread.sleep(2000);
		
	driver.close();

	}

}
