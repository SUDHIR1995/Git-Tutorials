package Basic_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class simple3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR NITNAWARE\\Desktop\\Newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
//		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("javatpoint");
		
		driver.manage().deleteAllCookies();
		
		
		Dimension d=new Dimension(200,3000); 
		driver.manage().window().setSize(d);
		
		
		Point p=new Point(200,300);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		
	
	
	try{
		FileInputStream file=new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\xyz.xlsx");
		String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(value);
		
		
		FileInputStream file1=new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\New_01.xlsx");
		double value1=WorkbookFactory.create(file1).getSheet("Sheet1").getRow(2).getCell(4).getNumericCellValue();
		
		System.out.println(value1);
		FileInputStream file2=new FileInputStream("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\xyz.xlsx");
		short value2=WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getLastCellNum();
		
		System.out.println(value2);
	}catch (Exception e) {
	System.out.println("Exception handler");
	}
	
	File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File output= new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\asd.png");
	FileHandler.copy(screenshot, output);
	
	File screenshot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File output1= new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\asd1.png");
	FileHandler.copy(screenshot1, output1);
	
	File screenshot2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File output2= new File("C:\\Users\\SUDHIR NITNAWARE\\Desktop\\selenium_file\\asd2.png");
	FileHandler.copy(screenshot2, output2);
	driver.close();
	}
}
