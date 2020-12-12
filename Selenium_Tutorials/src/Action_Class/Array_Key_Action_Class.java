package Action_Class;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Array_Key_Action_Class {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.airindia.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Go ')]")).click();
		Thread.sleep(5000);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='aMnu1']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Time Table']")).click();
		Thread.sleep(2000);
		
		Set<String> parentid = driver.getWindowHandles();
		System.out.println(parentid);
		WebElement value = driver.findElement(By.xpath("//ul[@class='moduleSearch codeShareTool']//select"));
		Select s=new Select(value);
		s.selectByValue("DESTINATION");
	}

}
