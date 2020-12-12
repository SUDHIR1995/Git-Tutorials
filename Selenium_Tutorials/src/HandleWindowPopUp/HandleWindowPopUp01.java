package HandleWindowPopUp;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp01 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://www.popuptest.com/goodpopups.html");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
	
	Set<String> AllWindowId = driver.getWindowHandles();
	
	Iterator<String> Itr = AllWindowId.iterator();
//	while (Itr.hasNext()) {
//		System.out.println(Itr.next());
//	}
	String parentwindowid=Itr.next();
	System.out.println("parent window id is::>>"+"   "+parentwindowid);
	
	String childwindowid1=Itr.next();
	System.out.println("child window id is::>>"+"   "+childwindowid1);
	
	String childwindowid2=Itr.next();
	System.out.println("child window id is::>>"+"   "+childwindowid2);
	
	
	driver.switchTo().window(childwindowid2);
	String current_url = driver.getCurrentUrl();
	System.out.println("current active url is ::-"+current_url);
	
	
	
	driver.switchTo().window(childwindowid2).close();
	
	
}
}
