package ChromeDriver;
//import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();

		Driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		Driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		Driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Dimension d=new Dimension(200,300);
		Driver.manage().window().setSize(d);
		
		
		
		Point p =new Point(400,500);
		Driver.manage().window().setPosition(p);
		
		Thread.sleep(5000);
		Driver.close();
	}

}
