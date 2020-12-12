package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;



public class Airindia {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
	    driver.navigate().to("http://www.airindia.in/");
	    driver.findElement(By.xpath("//a[text()='Book Flight']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//ins[@class='iCheck-helper']")).click();
	    driver.findElement(By.xpath("//input[@title='From']")).sendKeys("Pune, Lohegaon Airport, PNQ, India");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@title='To']")).sendKeys("Delhi, Indira Gandhi International Airport, DEL, India");
	    Thread.sleep(2000);
	    
	    Actions s =new Actions(driver);
	    s.moveToElement(driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"))).click().build().perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='25']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@value='Book Now']")).click();
	    Thread.sleep(20000);
	    
	    File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    FileHandler.copy(Source, new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\Ticket.jpg"));

	    driver.close();
	    
	}

}
