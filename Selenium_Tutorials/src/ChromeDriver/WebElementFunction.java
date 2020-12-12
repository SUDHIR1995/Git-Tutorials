package ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFunction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SUDHIR NITNAWARE\\\\Desktop\\\\Newchrome\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https:/www.facebook.com/");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		

		boolean result=driver.findElement(By.xpath("//label[text()='Female']")).isEnabled();
		
		
		System.out.println(result);
		Thread.sleep(5000);

		boolean result1=driver.findElement(By.xpath("//label[text()='Female']")).isDisplayed();
		
		
		System.out.println(result1);
		Thread.sleep(5000);

		boolean result2=driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
		
		
		System.out.println(result2);
		Thread.sleep(5000);

		
		
		driver.close();
	}

}
