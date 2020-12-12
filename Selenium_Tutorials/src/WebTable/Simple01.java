package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/SUDHIR%20NITNAWARE/Desktop/selenium_file/WebTable.html");
		
		//totale no. of row present in webtable
		int rowcount = driver.findElements(By.xpath("//table[@id='12345']/tbody/tr")).size();
		System.out.println("totale no. of row present in webtable is :	"+rowcount);
		
		//totale no. of col present in webtable
		int colcount = driver.findElements(By.xpath("//table[@id='12345']/tbody/tr[2]/td")).size();
		System.out.println("totale no. of col present in webtable is :	"+colcount);
		driver.close();
	}

}
