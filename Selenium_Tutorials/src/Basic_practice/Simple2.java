package Basic_practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Simple2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Dimension d=new Dimension(200,300);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Point p=new Point(200,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);

		driver.manage().window().maximize();
	    
		driver.navigate().to("http://www.airindia.in/");
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    Thread.sleep(8000);

	    String title=driver.getTitle();
	    System.out.println(title);
	    
	    String url=  driver.getCurrentUrl();
	    System.out.println(url);
	   
	    Actions action=new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Manage')]"))).build().perform();
	    driver.findElement(By.xpath("//a[contains(text(),'Time')]")).click();
	    Thread.sleep(3000);
	    
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\Timetable.jpg"));
		Thread.sleep(5000);
		
		WebElement option=driver.findElement(By.xpath("//select[contains(@id,'ContentPlaceHolder1_TimeTable')]"));
	   Select Select=new Select(option);
	   Select.selectByVisibleText("ORIGIN");
	   
	   driver.findElement(By.xpath("//input[contains(@id,'ContentPlaceHolder1_TimeTableControl1_txtSearch')]")).sendKeys("Pune");
	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//div//ul//li//input[@class='goButton']")).click();
	   
	   Thread.sleep(2000);
	   
	    driver.close();
	}

}
