package webElementsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmpModuleElements {
	
	//Finding PIM (Employee) Model
	public static WebElement PIM_Module(WebDriver driver) {
		return driver.findElement(By.xpath("//span[normalize-space()='PIM']"));
	}
	
	
	//Finding Add Button
	public static WebElement addEmp(WebDriver driver) {
		return driver.findElement(By.xpath("//button[normalize-space()='Add']"));
	}
	
	// Finding Photo Upload 
	public static WebElement aploadPhoto(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='file']"));
	}
	
	//First Name
	public static WebElement firstName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	}
	
	
	//Last Name
	public static WebElement lastName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	}
	
	
	//Emp ID
	public static WebElement empID(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
	}
	
	
	//Save Button
	public static WebElement saveBTN(WebDriver driver) {
		return driver.findElement(By.xpath("//button[normalize-space()='Save']"));
	}

}
