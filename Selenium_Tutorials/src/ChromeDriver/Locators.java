package ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();  
		Driver.navigate().to("https://www.google.com/");
		Driver.navigate().to("https://www.facebook.com/");
		
		
		
		
		
		
		WebElement  un=Driver.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("8600131302");//		

		WebElement  pwd=Driver.findElement(By.xpath("//input[@id='pass']"));
		pwd.sendKeys("9922675374");
	Thread.sleep(5000);
		
		WebElement  login=Driver.findElement(By.xpath("//input[@id='u_0_b']"));
		login.click();                                                    //with store use
		
//		Driver.findElement(By.xpath("//input[@id='u_0_b']")).click(); without store use

//		Thread.sleep(5000);

//		Thread.sleep(5000);
//		Driver.close();
		
	}

}
