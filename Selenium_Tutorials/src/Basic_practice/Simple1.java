package Basic_practice;

import java.util.List;

import org.apache.xmlbeans.impl.xpath.saxon.XBeansXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Simple1 {
	
	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	
	Select Select= new Select(day);
	
	List<WebElement> daylist=Select.getOptions();
	
	System.out.println(daylist.size()-1);
	
	for(int i=0;i<=daylist.size()-1;i++) {
		
	String text=daylist.get(i).getText();
	System.out.println(text);
	}
driver.close();
	
	}
	
}