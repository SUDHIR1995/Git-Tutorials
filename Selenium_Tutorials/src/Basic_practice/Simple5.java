package Basic_practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.api.robot.Key;


public class Simple5 {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement Dropdown = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(Dropdown).click().build().perform();
		
	}
}

