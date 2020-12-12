package BrokenLinkTestHandle;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkbrokenhandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	    driver.navigate().to("http://www.airindia.in/");
	    
	    driver.findElement(By.xpath("//a[@class='goHomebtn']")).click();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   //1. get the list of all the links and images...
	    
	   List<WebElement> linklist=driver.findElements(By.tagName("a"));
	   linklist.addAll(driver.findElements(By.tagName("img")));
//	   linklist.addAll(driver.findElements(By.tagName("input")));
	   
	   //size of linklist and images...
	   System.out.println("Size of  full link and images::---->"+linklist.size());
	   Thread.sleep(2000);
	   //2. iterater linklist exclude all the links and images...
	   
	   List<WebElement> activelinks=new ArrayList<WebElement>(6);
	   for(int i=0;i<=linklist.size();i++) {
		   
		   if(linklist.get(i).getAttribute("href") !=null) {
			   activelinks.add(linklist.get(i));
		   }
		   
	   }
	   //3. get the active link lists...
	   System.out.println("size of active list and images::--->"+activelinks.size());
	}
}
