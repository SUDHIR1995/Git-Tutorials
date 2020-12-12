package Basic_practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Simple4 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.airindia.in");
		Point p= new Point(200,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
	
		Dimension d= new Dimension(200,300);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		
	String title=	driver.getTitle();
	System.out.println("current page title::-"+"  "+title);

	String current_url=	driver.getCurrentUrl();
	System.out.println("current page url::-"+"  "+current_url);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		
    File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest=  new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\AirindiaHomePage.jpg");
    FileHandler.copy(Source, dest);
		
		
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for(int i=0;i<linklist.size();i++) {
			
			System.out.println(linklist.get(i).getText());
		}
		
	
		driver.close();
	}
}
