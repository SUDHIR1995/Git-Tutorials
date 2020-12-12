package ChromeDriver;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class simple3{

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.navigate().to("https://www.facebook.com/");
		
		
//		Driver.findElement(By.id("//button[@type='submit']"));
		
		Driver.findElement(By.xpath("//div[@class='_1lch']")).click();
		
		
		
		
		Thread.sleep(5000);
		Driver.close();
		
//		System.out.println(fb);
//		Driver.navigate().back();
//		Driver.navigate().forward();
//		String fbb=Driver.getTitle();
//		
//		boolean result=fb.equals(gg);
//		if(result==true) {System.out.println("pass");}else{System.out.println("fail");}
//		
//		boolean resultant=fb.equals(fbb);
//		if(resultant==true) {System.out.println("pass");}else{System.out.println("fail");}
	}
}