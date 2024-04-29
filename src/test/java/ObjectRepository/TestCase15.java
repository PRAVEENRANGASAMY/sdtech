package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase15 {
	
	@FindBy(xpath="//*[@id=\"js-react-Alert\"]/div/div")
	public static WebElement errormessage;

}
