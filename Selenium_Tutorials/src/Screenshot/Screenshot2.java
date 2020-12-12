package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.spicejet.com/");
	    driver.manage().window().maximize();
	    File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\abc3.jpg");
	    FileHandler.copy(source, dest);
	    Thread.sleep(5000);
	    

	}

}
