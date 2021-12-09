package Com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.BaseLayer.BaseClass;
import Com.PageLayer.HomePage;
import Com.PageLayer.LoginPage1;

public class HomePageTest extends BaseClass{
	public HomePage homepage;
	public LoginPageTestPF login;
	
	
	
	@BeforeClass
	public void setup() {
	BaseClass.initialization();
	homepage=new HomePage();
	login=new LoginPageTestPF();
	
	}
	
	@Test(priority=1)
	public void validateLoginFunctionality() throws Exception {
		login.LoginFunctionality();
	}
	
	@Test(priority=2)
	public void validateLogo() {
		homepage.logoDisplay();
	}
	
	@Test(priority=3)
	public void validateDisplayName() {
		homepage.displayName();
	}
	
	@Test(priority=4)
	public void validateContactClick() {
		homepage.contactLinkClick();
	}
	
	
	@Test(priority=5)
	public void validateDealsClick() {
		homepage.dealsLinkClick();
	}
	
	@Test(priority=6)
	public void validateCalenderClick() {
		homepage.calenderLinkClick();
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
	
	
}
