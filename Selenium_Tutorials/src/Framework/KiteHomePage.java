package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath="//div[@class='avatar']") private WebElement Profilename;
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void verifyKiteHomePageProfilename() {
		String act = Profilename.getText();
		String exp="KV";
		if (act.equals(exp)) {
			System.out.println("Pass");
		}else {
			System.out.println("False");
		}
	}

}
