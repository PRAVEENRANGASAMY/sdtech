package Functionality2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.TestCase1;

public class TC1 {
	
	WebDriver driver;

	String path="///Users//apple//Desktop//DD.xlsx";
	FileInputStream fi;
	XSSFWorkbook w1;
	XSSFSheet s1;



	@BeforeTest
	public void setup() throws IOException {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://preview.facilgo.com/");
		driver.manage().window().maximize();
		fi=new FileInputStream(path);
		w1=new XSSFWorkbook(fi);
		s1=w1.getSheetAt(0);
	}


	@Test(priority=1)
	public void TestCase1() throws InterruptedException, IOException {

		PageFactory.initElements(driver, TestCase1.class);
		boolean b1=TestCase1.un.isEnabled();
		XSSFRow r=s1.getRow(1);
		XSSFCell c1=r.createCell(6);
		if(b1==true) {
			System.out.println("Username functionality is working properly");	
			c1.setCellValue("Pass");
			FileOutputStream fo=new FileOutputStream(path);
			w1.write(fo);
			fo.close();
		}else {
			System.out.println("Ussername functionality is failed");
			c1.setCellValue("Fail");
			FileOutputStream fo=new FileOutputStream(path);
			w1.write(fo);
			fo.close();
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc1-Screenshot1.png"));
			} finally {

			}
		}
		driver.navigate().refresh();
		Thread.sleep(3000);
	}


}
