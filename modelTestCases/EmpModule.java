package modelTestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import webElementsClasses.EmpModuleElements;
import webElementsClasses.LoginElements;

public class EmpModule {
	
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
		
		//Login Page
		LoginElements.userName(driver).sendKeys("Admin");
		
		LoginElements.password(driver).sendKeys("admin123");
		
		LoginElements.loginButton(driver).click();
		
	}
	
	@Test(dependsOnMethods = "loginPage")
	public void empModule() throws InterruptedException, AWTException {
		
		//Click PIM Module
		EmpModuleElements.PIM_Module(driver).click();
		
		
		//Click Add button
		EmpModuleElements.addEmp(driver).click();
		Thread.sleep(1000);
		
		
		//Apload profile image
		String path = System.getProperty("user.dir");
		EmpModuleElements.aploadPhoto(driver).sendKeys(path + "/Images/laern.jpg");
		Thread.sleep(1000);
		
		
		//Enter First Name
		EmpModuleElements.firstName(driver).sendKeys("Kumar");
		Thread.sleep(1000);
		
		
		//Enter Last Name
		EmpModuleElements.lastName(driver).sendKeys("Bharat");
		Thread.sleep(1000);
		
		
		// Employee ID Section
		EmpModuleElements.empID(driver).click();
		Robot robot = new Robot();
		
		//Clearing text
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);
		
		//Entering Emp ID		
		EmpModuleElements.empID(driver).sendKeys("9876");
		Thread.sleep(2000);
		
		
		
		//Click Submit Button
		EmpModuleElements.saveBTN(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	@AfterTest
	public void QuitDriver() {
		driver.quit();
		
	}
	
	
}
























