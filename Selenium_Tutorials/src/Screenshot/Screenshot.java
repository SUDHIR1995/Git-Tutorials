package Screenshot;

import java.awt.Container;
import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;



public class Screenshot {



	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.spicejet.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//span[text()='Flight Status']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//select[@id='FlifoSearchInputSearchView_originStation']")).sendKeys("Pune");
	    driver.findElement(By.xpath("//select[@id='FlifoSearchInputSearchView_destinationStation']")).sendKeys("Delhi");
	    
	Thread.sleep(3000);
	    WebElement date=driver.findElement(By.xpath("//select[@class='wMed5s required']"));
	    Select s=new Select(date);
	s.selectByIndex(1);
	    driver.findElement(By.xpath("//input[@id='FlifoSearchInputSearchView_ButtonSubmit']")).click();
	    Thread.sleep(3000);
	    File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	    File dest=new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc.jpg");
	    
	    
	    FileHandler.copy(source, dest);
	    Thread.sleep(2000);

	 

   driver.close();

	}

}
