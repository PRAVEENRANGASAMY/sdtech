package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facilgo_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Desktop//Driver//edgedriver_mac64.exe");
		EdgeDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		//String URL="https://preview.facilgo.com/";
		//String UserName="sfrfkhpreviewpmc@yopmail.com";
		//String PassWord="asdfasdf";

		//driver.get("URL");

		driver.get("https://nasipadang:every1!day@staging.facilgo.com/");

		driver.navigate().refresh();

		WebElement username=driver.findElement(By.id("user_login"));
		username.sendKeys("pmcstagingtest2022@yopmail.com");

		WebElement passWord=driver.findElement(By.id("user_password"));
		passWord.sendKeys("Asdf!123");

		WebElement Login=driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/form/div/div/div[2]/input"));
		Login.click();

		//Thread.sleep(2000);

		//driver.navigate().refresh();








	}

}
