package cucumberSteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	
	
	@Given("User navigate the application")
	public void navigation() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	
	
	@Given("User Enters the username as {string}")
	public void enterUserName(String username) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		
	}
	
	
	@Given("User Enters the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
			
	}
	

	@When("User clicks login button")
	
	public void clickLoginBtn() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	
	@Then("login should be success")
	
	public void loginSuccess() throws InterruptedException {
		System.out.println("Login Succesfull");
		Thread.sleep(2000);
		driver.quit();
	}
}























