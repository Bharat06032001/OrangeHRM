package modelTestCases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import webElementsClasses.LoginElements;

public class LoginPage {

	@Test

	public void loginPage() {

		WebDriverManager.chromedriver().setup();

		// Creating Chrome driver object
		ChromeDriver driver = new ChromeDriver();

		// maximize chrome window
		driver.manage().window().maximize();

		// getting url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Login Page
		LoginElements.userName(driver).sendKeys("Admin");
		
		LoginElements.password(driver).sendKeys("admin123");
		
		LoginElements.loginButton(driver).click();
		
		//Quit Page
		driver.quit();
	}

}
