package AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']//div[@class='sbtc']"));
		System.out.println(list.size());
		
		for (WebElement alloption : list) {
		String option = alloption.getText();
			System.out.println(option);
			
			if (option.endsWith("9 pro max")) {
				
				alloption.click();
				break;
				
			}
				
		}
		
		driver.close();
	}

}
