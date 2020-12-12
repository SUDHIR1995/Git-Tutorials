package ChromeDriver;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class simple1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver(); 
		Driver.get("https://www.facebook.com/");
		
		Driver.manage().window().maximize();
		
		String act=Driver.getCurrentUrl();
	
		String exp="https://www.facebook.com/";
		
		
		boolean result =act.equals(exp);
		if(result==true) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("faile");
		}
		Thread.sleep(5000);
		
		String Title=Driver.getTitle();
		System.out.println(Title);
		
		
		
		
		
		 Dimension d=new Dimension(200,300);
		 Driver.manage().window().setSize(d);		
		Thread.sleep(5000);
		
		Point p=new Point(400,500);
		 Driver.manage().window().setPosition(p);
		Thread.sleep(5000);

		 Driver.close();
		
	}
}
