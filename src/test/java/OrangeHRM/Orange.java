package OrangeHRM;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {
	WebDriver driver;
	
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void test2() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//a[@ href=\"/web/index.php/admin/viewAdminModule\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]//input[@class='oxd-input oxd-input--active']")).sendKeys("Praveen Kumar");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void test3() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//a[@href=\"/web/index.php/pim/viewPimModule\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]//label[text()='Employee Name']")).sendKeys("Praveen");
		
		
		
	}
	@Test
	public void endbrowser() {
		driver.quit();
	}

}
