package ListBox;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simple1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.facebook.com/");

		
	WebElement rv1=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1=new Select(rv1);
		
//		s1.selectByIndex(5);
		
//		List<WebElement> selectoption=s1.getAllSelectedOptions();
	}

}
