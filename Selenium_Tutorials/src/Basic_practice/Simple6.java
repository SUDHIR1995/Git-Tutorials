package Basic_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Simple6 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
		driver.get("http://www.airindia.in/");
		driver.findElement(By.partialLinkText("Login")).click();
		
		WebDriverWait waitElementLode=new WebDriverWait(driver,10);
		waitElementLode.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));
		
		Thread.sleep(5000);
		driver.close();
	}

}
