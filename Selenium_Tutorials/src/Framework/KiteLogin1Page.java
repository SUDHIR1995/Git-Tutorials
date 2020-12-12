package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {

	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	@FindBy(xpath="//a[contains(text(),'Forgot ')]") private WebElement forgot;
	
	public  KiteLogin1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void setKiteLogin1PageUN() {
		UN.sendKeys("DV1510");
		
	}
	public void setKiteLogin1PagePWD() {
		PWD.sendKeys("Pass@123");
		
	}
	public void clickKiteLogin1PageButton() {
		login.click();
		
	}
	public void clickKiteLogin1PageForgotAcc() {
		forgot.click();
	}
	
	
}
