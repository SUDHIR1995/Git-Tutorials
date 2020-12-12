package UserDefineWebDriver;



public class AmazonTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http:/www.amazon.com");
		driver.findElement("id");
		driver.close();
		
	}

}
