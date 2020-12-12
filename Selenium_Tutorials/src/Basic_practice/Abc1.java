package Basic_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc1 {

	public static void main(String[] args) throws InterruptedException {
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("redmi note ");
//	
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='sbl1']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='cfxYMc JfZTW c4Djg MUxGbd v0nnCb']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Samsung ')]")).click();
//		
//		String mainwindowid = driver.getWindowHandle();
//		
//		Set<String> Windowid = driver.getWindowHandles();
//		System.out.println(Windowid);
//		Thread.sleep(2000);
//		for (String id : Windowid) {
//			
//		
//		if (!Windowid.equals(mainwindowid)){
//			driver.switchTo().window(id );
//		}
//		}
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
//		Thread.sleep(2000);
//		
		
	}

}
