package HandleWindowPopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.popuptest.com/goodpopups.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #1']")).click();
		Thread.sleep(2000);
		
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		
		String parentwindowid=it.next();
		System.out.println("parent window id is::>>"+"   "+parentwindowid);
		
		String childwindowid=it.next();
		System.out.println("child window id is::>>"+"   "+childwindowid);
		
		
		driver.switchTo().window(childwindowid);
		Thread.sleep(2000);
		System.out.println("child window title is::>>"+"   "+driver.getTitle());
		driver.close();
	
		driver.switchTo().window(parentwindowid);
		Thread.sleep(2000);
		System.out.println("parent window title is::>>"+"    "+driver.getTitle());
		
		driver.close();
	}

}
