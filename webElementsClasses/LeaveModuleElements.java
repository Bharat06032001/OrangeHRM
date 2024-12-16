package webElementsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class LeaveModuleElements {
	
	//Apply leave
	public static WebElement leaveModule(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']"));
	}
	
	//Apply leave
		public static WebElement applyModule(WebDriver driver) {
			return driver.findElement(By.xpath("//a[normalize-space()='Apply']"));
		}
	
	//Leave Type
		public static WebElement leaveType(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div"));
		}
		
	//
		public static WebElement leaveTypeOption(WebDriver driver) {
			return driver.findElement(By.xpath("//*[contains(text(), 'CAN - FMLA')]"));

		}
	
	//Start Date
	public static WebElement fromtDate(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
	}
	
	//End Date
	public static WebElement toDate(WebDriver driver) {
		return driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
	}
	
	//Apply Leave Button
	public static WebElement applyBTN(WebDriver driver) {
		return driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
	}
	

}

















