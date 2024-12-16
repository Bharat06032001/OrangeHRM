package webElementsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElements {

	
	//User Name
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
	
	
	//Password
	public static WebElement password(WebDriver driver) {

		return driver.findElement(By.name("password"));

	}

	
	//login
	public static WebElement loginButton(WebDriver driver) {

		return driver.findElement(By.xpath("//button[normalize-space()='Login']"));

	}
}
