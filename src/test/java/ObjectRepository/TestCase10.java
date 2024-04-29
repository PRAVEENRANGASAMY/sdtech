package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase10 {
	
	@FindBy(xpath="//input[@id=\"user_login\"]")
	public static WebElement un;
	
	@FindBy(xpath="//input[@id='user_password']")
	public static WebElement pw;
	
	@FindBy(xpath="//input[@name='commit']")
	public static WebElement Signinbutton;
	
	@FindBy(xpath="//*[@id=\"js-react-Alert\"]/div")
	public static WebElement errornotification;


}
