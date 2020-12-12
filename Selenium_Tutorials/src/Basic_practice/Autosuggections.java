package Basic_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Autosuggections {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("redmi note");//google serch box
		
		List<WebElement> alloption = driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]"));//google auto sugg. box
		System.out.println(alloption.size());
		
		
		
		for (WebElement option : alloption) {
			
			String act = option.getText();
			System.out.println(act);
			
			
//			if (option.getText().equalsIgnoreCase(" 7 pro")) {
//				
//				option.click();
//			break;
//			
//			}
			
		}
		Thread.sleep(10000);
		driver.close();
	}

}
