package Basic_practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window_Tab_Handles{

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		
		driver.get("https://www.google.com/");
		
		Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_T);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_T);
        
   
        
        Set < String > handles = driver.getWindowHandles();
        for (String actual: handles) {
        	System.out.println(actual);
              
                driver.switchTo().parentFrame();             
        	
            
        }
	}

}
