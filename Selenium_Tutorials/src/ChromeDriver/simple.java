package ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.google.com/");               //only get url no addictinal fixture
		Thread.sleep(5000);                                  //execution wait 5 second
		Driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		
		
		
		
		
//		Driver.navigate().to("https://www.selenium.dev/");  //it is alternate way to url get some addictinal fixture forward ,backward and refresh...
//		Thread.sleep(5000);
//		Driver.navigate().back();
//		Thread.sleep(5000);
		
//		Thread.sleep(5000);
//		Driver.navigate().refresh();
//		Driver.close();                                      //close : use to close  only current tab of Chromebrowser
		Driver.quit();                                         //quite : use to close all  tab present in Chromebrowser
		

	}

}
