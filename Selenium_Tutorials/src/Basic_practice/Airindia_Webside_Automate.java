package Basic_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.api.robot.Key;

public class Airindia_Webside_Automate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.airindia.in/");
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		System.out.println(driver.getCurrentUrl());
		
		String title=driver.getTitle();
		System.out.println(title);
		
		Point p=new Point(120,500);
		driver.manage().window().setPosition(p);
		
		Dimension d=new Dimension(300,600);
		driver.manage().window().setSize(d);
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		
		WebElement mvelement = driver.findElement(By.xpath("//a[text()='Manage Your Trip']"));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(mvelement).perform();
		driver.findElement(By.xpath("//a[text()='Time Table']")).click();
		Thread.sleep(5000);
		
		
		WebElement list = driver.findElement(By.xpath("//select[contains(@id,'ContentPlaceHolder1_TimeTableControl1_ddlType')]"));
		action.moveToElement(list).click().build().perform();
		
		Select s=new Select(list);
		s.selectByVisibleText("FLIGHTNUMBER");
		
		
		
		
//		driver.close();
	}

}
	