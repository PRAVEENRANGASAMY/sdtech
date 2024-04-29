package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase7 {
	
	@FindBy(xpath="//input[@id='user_password']")
	public static WebElement pw;

}
