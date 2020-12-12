package HandleWindowPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUPload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc.xlsx");

	}

}
