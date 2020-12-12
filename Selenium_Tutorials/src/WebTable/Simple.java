package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/SUDHIR%20NITNAWARE/Desktop/selenium_file/WebTable.html");
		
		//totale no. of row present in webtable
		int rowcount = driver.findElements(By.xpath("//table[@id='12345']/tbody/tr")).size();
		System.out.println("totale no. of row present in webtable is :	"+rowcount);
	
		
		String exp="400";
		for (int i = 2; i <=rowcount; i++) {
			int colcount = driver.findElements(By.xpath("//table[@id='12345']/tbody/tr["+i+"]/td")).size();
			for (int j = 1; j <=colcount; j++) {
				
				String act =driver.findElement(By.xpath("//table[@id='12345']/tbody/tr["+i+"]/td["+j+"]")).getText();
				if (act.equals(exp)) {
					System.out.println("exp result found at row no: "+ i +" & "+" col no: "+ j);
					break;
					
				}
				
			
			}
		}
		
		
		driver.close();

	}

}
