package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locater {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver(); //upcasting
		
//		ChromeDriver obj=(ChromeDriver) Driver; downcasting

		Driver.get("https://www.facebook.com/");

		WebElement un=Driver.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("8600131302");
		

//		WebElement button=Driver.findElement(By.xpath("//button[text(),'Sign Up']"));
//		button.click();
		
		
	//---------------------------------------------------------------------------------------
		
		
		
//		WebElement link1=Driver.findElement(By.xpath("//a[contains(text(),'Create']"));
//		link1.click();
		
		WebElement pwd=Driver.findElement(By.xpath("//input[contains(@id,'pa')]"));
		pwd.sendKeys("9922675374");
		
		Thread.sleep(5000);
		Driver.close();

	}

}
