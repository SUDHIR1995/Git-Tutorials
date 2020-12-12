package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> alloption = driver.findElements(By.xpath("//ul[@class='erkvQe']//div[@class='sbtc']"));
     	System.out.println(alloption.size());
		String exp=" grid";
		for (WebElement option:alloption) {
			String act=option.getText();
			System.out.println(act);
			if (act.endsWith(exp)) {
				option.click();
				break;
			}
			driver.close();
		}
	}

}
