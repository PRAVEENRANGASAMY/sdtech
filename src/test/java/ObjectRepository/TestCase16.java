package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase16 {
	
	@FindBy(xpath="//input[@id='user_login']")
	public static WebElement un;
	
	@FindBy(xpath="//input[@id='user_password']")
	public static WebElement pw;

}
