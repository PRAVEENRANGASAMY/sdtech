package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase14 {
	
	@FindBy(xpath="//*[@id=\"login-container\"]/div[1]/div/a/img")
	public static WebElement logo;

}
