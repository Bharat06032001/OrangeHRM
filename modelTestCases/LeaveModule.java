package modelTestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import webElementsClasses.LeaveModuleElements;
import webElementsClasses.LoginElements;

public class LeaveModule {

	WebDriver driver;

	@BeforeTest
	public void driverSetup() {

		WebDriverManager.chromedriver().setup();

		// Creating Chrome driver object
		this.driver = new ChromeDriver();

		// maximize chrome window
		driver.manage().window().maximize();

		// getting url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	
	
	@Test
	public void loginPage() {

		// Login Page
		LoginElements.userName(driver).sendKeys("Admin");

		LoginElements.password(driver).sendKeys("admin123");

		LoginElements.loginButton(driver).click();

	}

	@Test(dependsOnMethods = "loginPage")
	public void leavePage() throws InterruptedException, AWTException {

		// Click on Leave Module
		LeaveModuleElements.leaveModule(driver).click();
		Thread.sleep(1000);

		
		// Click on Apply Link
		LeaveModuleElements.applyModule(driver).click();
		Thread.sleep(1000);

		
		
		// Selecting leaveType
		WebElement type = LeaveModuleElements.leaveType(driver);
		type.click();
		Thread.sleep(1000);

		
		// Leave Type Option
		WebElement option = LeaveModuleElements.leaveTypeOption(driver);
		option.click();
		Thread.sleep(1000);

		
		
		// From Date
		LeaveModuleElements.fromtDate(driver).click();	
		LeaveModuleElements.fromtDate(driver).sendKeys("2024-12-01");
		Thread.sleep(1000);
		
		
		
		// To Date
		LeaveModuleElements.toDate(driver).click();
		Robot robot = new Robot();

		// Clearing text
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);

		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);
		
		//sending to date
		LeaveModuleElements.toDate(driver).sendKeys("2024-12-15");
		Thread.sleep(1000);

		// Apply Button
		LeaveModuleElements.applyBTN(driver).click();

	}

	
	
	@AfterTest
	public void QuitDriver() {
		driver.quit();
		
	}
	
}
