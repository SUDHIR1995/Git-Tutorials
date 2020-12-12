package ResponsiveBasic;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Responsive_Basic {
	@DataProvider
	public Object[][]  MobileEmulations(){
		
		return new Object[][] {
			{"iPad Pro"},
			{"Nexus 5"},
			{"Pixel 2"}
		};
	}	
	

	@Test (dataProvider="MobileEmulations")
	public void validateResponsive(String emulation)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\chromedriver.exe");
		
		Map<String, String> deviceMobEmu=new HashMap<>();
		ChromeOptions chromeOpt=new ChromeOptions();
		chromeOpt.setExperimentalOption("mobileEmulation", deviceMobEmu);
		
		deviceMobEmu.put("deviceName", emulation);
		
		WebDriver driver=new ChromeDriver(chromeOpt);
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
	}
}
