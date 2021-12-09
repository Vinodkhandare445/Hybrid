package Com.TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	//POM without Page Factory
	By username=By.xpath("//*[@name='email']");
	
	By password=By.name("password");
	
	By loginButton=By.xpath("//div[text()='Login']");
	
	By forgotLink=By.xpath("//a[text()='Forgot your password?']");
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
	
}
