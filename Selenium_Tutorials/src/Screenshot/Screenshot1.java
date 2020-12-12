package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.spicejet.com/");
	    driver.manage().window().maximize();
	  
	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@id='MultiCityModelAlert']")).click();
	    Thread.sleep(1000);
	    File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc.jpg");
	    FileHandler.copy(source, dest);
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//a[@id='hlnkholidaypacks']")).click();
	    Thread.sleep(5000);
	    File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest1=new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc1.jpg");
	    FileHandler.copy(source1, dest1);
	    driver.close();
	}

}
