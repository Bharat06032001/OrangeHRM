package crossBrowserTesting;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;
import webElementsClasses.LoginElements;

public class CrossBrowser {
	
	
	WebDriver driver;

	@Parameters("browser")
	@Test

	public void browserSet(String Browser) {

		String Browsers=Browser.toLowerCase();
		if (Browsers.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			 this.driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}

		else if (Browsers.equals("edge")) {

			WebDriverManager.chromedriver().setup();
			this.driver = new EdgeDriver();

			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}

//		else if (Browsers.equals("firefox")) {
//
//			WebDriverManager.chromedriver().setup();
//			this.driver = new FirefoxDriver();
//
//			driver.manage().window().maximize();
//			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		}

	}
	
	
	

	// Login Page
	@Test

	public void login() throws InterruptedException {

		//user Name
		LoginElements.userName(driver).sendKeys("Admin");

		//Pass word
		LoginElements.password(driver).sendKeys("admin123");

		//Click Login
		LoginElements.loginButton(driver).click();

		
		// Quit Page
//		driver.quit();

		

	}

}
