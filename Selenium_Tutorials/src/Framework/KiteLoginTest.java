package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLoginTest {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		KiteLogin1Page login1=new KiteLogin1Page(driver);
		login1.setKiteLogin1PageUN();
		login1.setKiteLogin1PagePWD();
		login1.clickKiteLogin1PageButton();
		Thread.sleep(4000);
		
		KiteLogin2Page login2=new KiteLogin2Page(driver);
		login2.setKiteLogin2PagePIN();
		login2.clickKiteLogin2PageCNT();
		
		KiteHomePage home=new KiteHomePage(driver);
		home.verifyKiteHomePageProfilename();
		Thread.sleep(5000);
		driver.close();
		
	}

}
