package WebElementCountList;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementlist {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

		driver.get("http:/www.facebook.com");
		
//		Thread.sleep(2000);
		Dimension d=new Dimension(200,300);
		driver.manage().window().setSize(d);
//		Thread.sleep(2000);
		
		Point p=new Point(400,300);
		driver.manage().window().setPosition(p);
//		Thread.sleep(2000);	
		
		driver.manage().window().maximize();
		
		List <WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println("link prasent in current web page::====>>>"+"   "+linklist.size());
		System.out.println();
		

		List <WebElement> inputlist=driver.findElements(By.tagName("input"));
		System.out.println("input prasent in current web page::====>>>"+"   "+inputlist.size());
		System.out.println();
		
		
		List <WebElement> buttonlist=driver.findElements(By.tagName("button"));
		System.out.println("button prasent in current web page::====>>>"+"   "+buttonlist.size());
		System.out.println();
	
		List <WebElement> divlist=driver.findElements(By.tagName("div"));
		System.out.println("divlist prasent in current web page::====>>>"+"   "+divlist.size());
		System.out.println();
	
		WebElement day= driver.findElement(By.id("day"));
		WebElement month= driver.findElement(By.id("month"));
		 WebElement year=driver.findElement(By.id("year"));
		
		 
		    Select s=new Select(day);
			s.selectByVisibleText("17");
		
			
			
			Select s1=new Select(month);
			s1.selectByVisibleText("Aug");
			
			Select s2=new Select(year);
			s2.selectByVisibleText("1995");
		 
			
//		 ----------OR---------------------------
//		String dob="17-Aug-1995"; 
//		String arr[]=dob.split("-");
//		
//		
//		 ScrollDownSelect(day,arr[0]);
//		 ScrollDownSelect(month,arr[1]);
//		 ScrollDownSelect(year,arr[2]);
//		 
		 
//		 ----------OR---------------------
//		 ScrollDownSelect(day,"10");
//		 ScrollDownSelect(month,"Feb");
//		 ScrollDownSelect(year,"1990");
		
		
	}

	public static void ScrollDownSelect(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByVisibleText(value);
		
	}

}
