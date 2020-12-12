package Diff_Way_Use_SendKay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:/www.facebook.com");
	WebElement	un=driver.findElement(By.xpath("//input[@id='email']"));
		un.sendKeys("sudhir");
		Thread.sleep(3000);
		un.clear();
		
		
		//----------------->>---OR-->>-----------------------
		StringBuffer sb=new StringBuffer();
		
		sb.append("Sudhir");
		sb.append(" ");
		sb.append("Rajendra");
		sb.append(" ");
		sb.append("Nitnawre");
		un.sendKeys(sb);
		Thread.sleep(5000);
		un.clear();
		
		//----------------->>---OR-->>-----------------------
		StringBuilder SB=new StringBuilder();
		SB.append("sunil");
		SB.append(" ");
		SB.append("Rajendra");
		SB.append(" ");
		SB.append("Nitnawre");
		un.sendKeys(SB);
		Thread.sleep(5000);
		un.clear();
		driver.close();
		
	}

}
