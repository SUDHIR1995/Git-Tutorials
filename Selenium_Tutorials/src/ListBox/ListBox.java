package ListBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
//		WebElement value = driver.findElement(By.xpath("//select[@id='month']"));
//		
//		Select s=new Select(value);
//		
//		s.selectByValue("7");
//		
//		s.selectByVisibleText("dec");
		
		
		
		
//
//		List<WebElement> value = driver.findElements(By.xpath("//select[@id='month']/option"));
//		
//		int length=value.size();
//		System.out.println(length);
//		
//		for (int i = 0; i <=length-1; i++) {
//			String alltextprint=value.get(i).getText();
//			System.out.println(alltextprint);
//			
//			
//			if (alltextprint.equalsIgnoreCase("jan")) {
//				
//				value.get(i).click();
//			}	
//		}
	

			
	}

}
