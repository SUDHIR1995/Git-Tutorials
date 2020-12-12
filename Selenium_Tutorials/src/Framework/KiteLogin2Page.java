package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement CNT;
	
	public KiteLogin2Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void setKiteLogin2PagePIN() {
		PIN.sendKeys("959594");
		
	}
	public void clickKiteLogin2PageCNT() {
		CNT.click();
		
	}

}
