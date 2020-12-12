package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginProgrameWithoutPom {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("Dv1510");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("April@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("038631");
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	String actual = driver.findElement(By.xpath("//div[@class='avatar']")).getText();
	
	String exp="KV";
	
	if (actual.equals(exp)) {
		System.out.println(actual);
		System.out.println("pass");
		
	}else {
		System.out.println("false");
	}
	
driver.close();
	
	}

}
