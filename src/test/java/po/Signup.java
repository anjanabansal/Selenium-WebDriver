 package po;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.utility;

public class Signup {

	private WebDriver driver;
	private By signup = By.xpath(utility.getObjectFromPropertiesFile("signupEmail"));
	private By signupPwd = By.xpath(utility.getObjectFromPropertiesFile("signupPwd"));
	private By signupSubmit = By.xpath(utility.getObjectFromPropertiesFile("signupSubmit"));
	private By signupbtn =  By.xpath(utility.getObjectFromPropertiesFile("signup"));
	private By signupError  =  By.xpath(utility.getObjectFromPropertiesFile("signupError"));
//	By signup = By.xpath(utility.getDataFromPropertiesFile("signupEmail"));
//	By signup = By.xpath(utility.getDataFromPropertiesFile("signupEmail"));
	
	public Signup(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean performSignup() {
		boolean error = false;
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(signupbtn).click();
		driver.findElement(signup).sendKeys(utility.getDataFromPropertiesFile("email"));
		driver.findElement(signupPwd).sendKeys(utility.getDataFromPropertiesFile("pwd"));
		driver.findElement(signupSubmit).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(signupError));
		System.out.println(driver.findElement(signupError).isDisplayed());
		try {
			if (driver.findElement(signupError).isDisplayed()) {
				System.out.println("Error while creating the user");
				error = true;
	//			return new Error()
			}
		}catch(Error e) {
			System.out.println(e);
			error = false;
			
		
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(signup));
		return error;
	}
	
}
