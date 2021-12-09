package Com.TestLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\Documents\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
	}
	
	@Test
	public void validateLoginFunctionality() {
		LoginPage abc=new LoginPage(driver);
		abc.typeUsername("praf002@gmail.com");
		abc.typePassword("Pr@ful0812");
		abc.clickOnLoginButton();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
