package Functionality;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.TestCase1;
import ObjectRepository.TestCase2;
import ObjectRepository.TestCase3;
import ObjectRepository.TestCase4;
import ObjectRepository.TestCase7;
import ObjectRepository.TestCase8;
import ObjectRepository.TestCase9;
import ObjectRepository.TestCase10;
import ObjectRepository.TestCase14;
import ObjectRepository.TestCase15;
import ObjectRepository.TestCase16;
import ObjectRepository.TestCase17;
import ObjectRepository.TestCase18;
import ObjectRepository.TestCase19;
import ObjectRepository.TestCase20;
import ObjectRepository.TestCase21;
import ObjectRepository.TestCase22;
import ObjectRepository.TestCase23;
import ObjectRepository.TestCase24;
import ObjectRepository.TestCase25;

public class FacilGoFunctionality {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://preview.facilgo.com/");
		driver.manage().window().maximize();
	}


	@Test(priority=1)
	public void TestCase1() throws InterruptedException, IOException {

		PageFactory.initElements(driver, TestCase1.class);
		boolean b1=TestCase1.un.isEnabled();
		if(b1==true) {
			System.out.println("Username functionality is working properly");	
		}else {
			System.out.println("Ussername functionality is failed");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc1-Screenshot1.png"));
			} finally {

			}
		}
		driver.navigate().refresh();
		Thread.sleep(3000);
	}


	@Test(priority=2)
	public void TestCase2() throws InterruptedException, IOException {	

		PageFactory.initElements(driver, TestCase2.class);
		TestCase2.un.click();
		TestCase2.pw.sendKeys("Praveen@12345");
		TestCase2.Signinbutton.click();
		Thread.sleep(4000);
		String errormessage=TestCase2.errornotification.getText();
		System.out.println();
		if(errormessage.isEmpty()) {
			System.out.println("Login Successful");
		}else {
			System.out.println(errormessage);
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc2-Screenshot2.png"));
			} finally {

			}
		}
		driver.navigate().refresh();
	}


	@Test(priority=3)
	public void TestCase3() throws InterruptedException, IOException {
		PageFactory.initElements(driver, TestCase3.class);
		TestCase3.un.sendKeys("praveenkumar@sdtech.io");
		TestCase3.pw.sendKeys("Praveen@12345");
		TestCase3.Signinbutton.click();
		Thread.sleep(4000);
		String errormessage=TestCase3.errornotification.getText();
		System.out.println();
		if(errormessage.isEmpty()) {
			System.out.println("Login Successful");
		}else {
			System.out.println(errormessage);
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc3-Screenshot3.png"));
			} finally {

			}
		}
		driver.navigate().refresh();
	}

	@Test(priority=4)
	public void TestCase4() throws InterruptedException, IOException {
		PageFactory.initElements(driver, TestCase4.class);
		TestCase4.un.sendKeys("praveenkumar@sdtech.io");
		TestCase4.pw.sendKeys("Praveen@12345");
		TestCase4.Signinbutton.click();
		Thread.sleep(4000);
		String errormessage=TestCase4.errornotification.getText();
		System.out.println();
		if(errormessage.isEmpty()) {
			System.out.println("Login Successful");
		}else {
			System.out.println(errormessage);
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc4-Screenshot4.png"));
			} finally {

			}
		}
		driver.navigate().refresh();
	}


	@Test(priority=7)
	public void TestCase7() throws InterruptedException, IOException {
		PageFactory.initElements(driver, TestCase7.class);
		Boolean b1=TestCase7.pw.isEnabled();
		if(b1==true) {
			System.out.println("Password functionality is working properly");	
		}else {
			System.out.println("Password functionality is failed");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc7-Screenshot7.png"));
			} finally {

			}
		}
		driver.navigate().refresh();
		Thread.sleep(3000);
	}


	@Test(priority=8)
	public void TestCase8() throws InterruptedException, IOException {	

		PageFactory.initElements(driver, TestCase8.class);
		TestCase8.un.sendKeys("praveenkumar@sdtech.io");
		TestCase8.pw.click();
		TestCase8.Signinbutton.click();
		Thread.sleep(4000);
		String errormessage=TestCase8.errornotification.getText();
		System.out.println();
		if(errormessage.isEmpty()) {
			System.out.println("Login Successful");
		}else {
			System.out.println(errormessage);
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc8-Screenshot8.png"));
			} finally {

			}
		}
		driver.navigate().refresh();
	}

	@Test(priority=9)
	public void TestCase9() throws InterruptedException, IOException {
		PageFactory.initElements(driver, TestCase9.class);
		TestCase9.un.sendKeys("praveenkumar@sdtech.io");
		TestCase9.pw.sendKeys("Praveen@12345");
		TestCase9.Signinbutton.click();
		Thread.sleep(4000);
		String errormessage=TestCase9.errornotification.getText();
		System.out.println();
		if(errormessage.isEmpty()) {
			System.out.println("Login Successful");
		}else {
			System.out.println(errormessage);
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc9-Screenshot9.png"));
			} finally {

			}
		}
		driver.navigate().refresh();
	}


	@Test(priority=10)
	public void TestCase10() throws InterruptedException, IOException {
		PageFactory.initElements(driver, TestCase10.class);
		TestCase10.un.sendKeys("praveenkumar@sdtech.io");
		TestCase10.pw.sendKeys("Praveen@12345");
		TestCase10.Signinbutton.click();
		Thread.sleep(4000);
		String errormessage=TestCase10.errornotification.getText();
		System.out.println();
		if(errormessage.isEmpty()) {
			System.out.println("Login Successful");
		}else {
			System.out.println(errormessage);
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc10-Screenshot10.png"));
			} finally {

			}
		}
		driver.navigate().refresh();
	}


	@Test(priority=14)
	public void TestCase14() throws IOException {
		PageFactory.initElements(driver, TestCase14.class);
		TestCase14.logo.click();
		String title=driver.getTitle();
		System.out.println();
		if(title.equalsIgnoreCase("FacilGo®")) {
			System.out.println("User redirected to FacilGo homepage");
		}else {
			System.out.println("logo fuctionality failed");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc14-Screenshot14.png"));
			} finally {

			}
		}

		driver.navigate().refresh();
	}


	@Test(priority=15)
	public void TestCase15() throws InterruptedException, IOException {

		PageFactory.initElements(driver, TestCase15.class);
		Actions a1=new Actions(driver);
		a1.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		Boolean bool1=TestCase15.errormessage.isDisplayed();
		System.out.println();
		if(bool1==true) {
			System.out.println(TestCase15.errormessage.getText());
		}else {
			System.out.println("Error message functionality is failed");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc15-Screenshot15.png"));
			} finally {

			}
		}
		driver.navigate().refresh();
	}


	@Test(priority=16)
	public void TestCase16() throws InterruptedException, IOException {

		PageFactory.initElements(driver, TestCase16.class);
		TestCase16.un.sendKeys("praveenkumar@sdtech.io");
		Actions s1=new Actions(driver);
		Thread.sleep(5000);
		s1.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		Boolean m1=TestCase16.pw.isEnabled();
		s1.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		s1.sendKeys(Keys.ENTER).build().perform();
		System.out.println();
		if(m1==true){
			System.out.println(" Tab key is working properly");
		}else {
			System.out.println("Tab key is not working");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc16-Screenshot16.png"));
			} finally {

			}
		}

		driver.navigate().refresh();

	}

	@Test(priority=17)
	public void TestCase17() throws InterruptedException, IOException {
		PageFactory.initElements(driver, TestCase17.class);
		TestCase17.un.sendKeys("praveenkumar@sdtech.io");
		Actions s1=new Actions(driver);
		Thread.sleep(5000);
		s1.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		TestCase17.pw.sendKeys("Praveen96");
		Thread.sleep(5000);
		s1.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		Boolean b1=TestCase17.signbutton.isEnabled();
		System.out.println();
		if(b1==true){
			System.out.println(" Enter key is working properly");
		}else {
			System.out.println("Enter key is not working");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc17-Screenshot17.png"));
			} finally {

			}
		}
		driver.navigate().refresh();
	}


	@Test(priority=18)
	public void TestCase18() throws IOException {
		PageFactory.initElements(driver, TestCase18.class);
		TestCase18.Solutionselement.click();
		String pagetitle=driver.getTitle();
		System.out.println();
		if(pagetitle.equals("Solutions - FacilGo")) {
			System.out.println("redirected to solutions page");
		}
		else {
			System.out.println("redirection is not happened");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc18-Screenshot18.png"));
			} finally {

			}
		}
	}


	@Test(priority=19)
	public void TestCase19() throws IOException {
		PageFactory.initElements(driver, TestCase19.class);
		TestCase19.marketselement.click();
		String title2=driver.getTitle();
		System.out.println();
		if(title2.equalsIgnoreCase("Markets - FacilGo")) {
			System.out.println("redirected to markets page");
		}
		else {
			System.out.println("redirection is not happened");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc19-Screenshot19.png"));
			} finally {

			}
		}
	}


	@Test(priority=20)
	public void TestCase20() throws IOException {

		PageFactory.initElements(driver, TestCase20.class);
		TestCase20.supplierelement.click();
		String title2=driver.getTitle();
		System.out.println();
		if(title2.equalsIgnoreCase("Suppliers - FacilGo")) {
			System.out.println("redirected to supplier page");
		}
		else {
			System.out.println("redirection is not happened");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc20-Screenshot20.png"));
			} finally {

			}
		}
	}


	@Test(priority=21)
	public void TestCase21() throws IOException {
		PageFactory.initElements(driver, TestCase21.class);	
		TestCase21.companyelement.click();
		String title4=driver.getTitle();
		System.out.println();
		if(title4.equalsIgnoreCase("Company - FacilGo")) {
			System.out.println("redirected to Company page");
		}
		else {
			System.out.println("redirection is not happened");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc21-Screenshot21.png"));
			} finally {

			}
		}
	}


	@Test(priority=22)
	public void TestCase22() throws IOException {
		PageFactory.initElements(driver, TestCase22.class);	
		TestCase22.Blogelement.click();
		String title5=driver.getTitle();
		System.out.println();
		if(title5.equalsIgnoreCase("Blog - FacilGo")) {
			System.out.println("redirected to blog page");
		}else {
			System.out.println("Redirection is not happened");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc22-Screenshot22.png"));
			} finally {

			}
		}
	}


	@Test(priority=23)
	public void TestCase23() throws IOException {
		PageFactory.initElements(driver, TestCase23.class);
		TestCase23.contactuselement.click();
		String title6=driver.getTitle();
		System.out.println();
		if(title6.equalsIgnoreCase("Contact Us - FacilGo")){
			System.out.println("redirected to contact page");
		}
		else {
			System.out.println("redirection is not happened");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc23-Screenshot23.png"));
			} finally {

			}
		}
	}


	@Test(priority=24)
	public void TestCase24() throws IOException {
		PageFactory.initElements(driver, TestCase24.class);
		TestCase24.signinelement.click();
		String title7=driver.getTitle();
		System.out.println();
		if(title7.equalsIgnoreCase("FacilGo®")) {
			System.out.println("Redirected to facilgo login page");
		}else {
			System.out.println("redirection is not happened");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc24-Screenshot24.png"));
			} finally {

			}
		}
	}



	@Test(priority=25)
	public void TestCase25() throws InterruptedException, IOException {

		Actions k1=new Actions(driver);
		Thread.sleep(5000);
		k1.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
		PageFactory.initElements(driver, TestCase25.class);
		String text=TestCase25.copyright.getText();
		System.out.println();
		if(text.equalsIgnoreCase("COPYRIGHT © 2014-2023 FACILGO INC")) {

			System.out.println("copy right information is properly mentioned ");
		}

		else
		{
			System.out.println("Copy right is not mentioned properly");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("//Users//apple//eclipse-workspace//FacilGo1//src/test//java//ScreenShot//tc25-Screenshot25.png"));
			} finally {

			}
		}
	}



	@AfterTest
	public void close() {

		driver.quit();
	}




}
