package Basic_practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[starts-with(@name, 'firstname')]")).sendKeys("sudhir");
		//Using OR & AND: xpath
//		Xpath= //input[@type= ‘email’ or @name= ‘email’]
//		Xpath= //input[@type= ‘email’ and @name= ‘email’]
		
		//starts-with()----xpath
//		Xpath= =//input[starts-with(@name, ‘organization)]
		
//		Xpath= //div[@class= ’ col-sm-12 google-sign-form’]/input[2]
		
//		Xpath=//ul[@class=’nav navbar-nav navbar-right’]//li[@class=’sign-in’]
		
		//Following
//		Xpath=//input[@name=’ organization_name’]//following::input[1]
//		Xpath= //input[@name=’ organization_name’]//following::input
		
//		Xpath= //li[@class=’sign-in’]//following-sibling::li
		
//		Xpath=//input[@name=’password’]//preceding::input[1]
//		Xpath=//input[@name=’password’]//preceding::input
		
//		Xpath= //li[@class=’login’]//preceding-sibling::li[1]
		
		//Child---xpath
//		Xpath= //div[@class=’ col-sm-12 google-sign-form’]/child::input
//		Xpath= //div[@class=’ col-sm-12 google-sign-form’]/child::input[1]
		
		//parent----xpath
//		Xpath= //input[@name=’email’]//parent::div
		
		//descendant-----xpath
//		Xpath= //div[@class=’ col-lg-3 col-md-4 col-sm-6 sign-form’]//descendant:: input
		
		//Ancestor----xpath
//		Xpath= //input[@name=’email]//ancestor::div[1]
//		Xpath= //input[@name=’email]//ancestor::form
		
		
		 	 		  		
		
	}

}
