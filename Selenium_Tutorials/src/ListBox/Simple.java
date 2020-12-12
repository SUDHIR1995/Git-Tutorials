package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simple {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.facebook.com/");
		
		

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sudhir");
		
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nitnawre");
		
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8600131302");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("856532651245");
		
		Thread.sleep(2000);

		
	WebElement rv1=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s1=new Select(rv1);
		
		s1.selectByIndex(17);
		Thread.sleep(2000);
	WebElement rv=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(rv);
		
		s.selectByIndex(8);
		Thread.sleep(2000);
		
		
	WebElement rv2=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s2=new Select(rv2);
		
		s2.selectByIndex(26);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//label[@for='u_0_7']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(2000);
		
		
		Thread.sleep(8000);
		
		
		
//		s.selectByValue("4");
//		Thread.sleep(5000);
//		s.selectByVisibleText("Dec");
//	
//		Thread.sleep(5000);
	 
		
		driver.close();
	}
}
