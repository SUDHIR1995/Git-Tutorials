package Basic_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com"); //enter URL
		
		WebElement email=driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='sudhirnitnawre@gmail.com'", email);
		
		//OR 
		
		js.executeScript("document.getElementById('pass').value='8600131302'");


		Thread.sleep(5000);
	
//		js.executeScript("alert('Welcome To FacebookHomePage');");
		
		
//		js.executeScript("history.go(0)");
	
	String sText =  js.executeScript("return document.title;").toString();
	System.out.println(sText);
	Thread.sleep(5000);
	driver.close();
		
	}

}
