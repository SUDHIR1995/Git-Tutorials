package Basic_practice;

import java.util.List;

import org.apache.poi.hssf.record.RightMarginRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class simple {

	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		Thread.sleep(5000);

		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(allOptions.size());

		String exp = "redmi 8";

		for (WebElement op : allOptions) {
			String act = op.getText();
			System.out.println(act);

			if (op.getText().equalsIgnoreCase(exp)) {
				op.click();
			}
		}
	
	    Thread.sleep(5000);

	    driver.close();
	}
}
