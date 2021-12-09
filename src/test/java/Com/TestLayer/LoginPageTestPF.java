package Com.TestLayer;


import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.BaseLayer.BaseClass;
import Com.PageLayer.LoginPage1;
import Com.UtilsLayer.UtilsClass;

public class LoginPageTestPF extends BaseClass{
		LoginPage1 loginPage;
		UtilsClass util;
		@BeforeClass
		public void setup() {
			BaseClass.initialization();
		}
		 @Test
		 public void LoginFunctionality() throws Exception {
			loginPage=new LoginPage1();
			loginPage.typeUsername(prop.getProperty("username"));
			loginPage.typePassword(prop.getProperty("password"));
			util.captureScreenshot();
			loginPage.LoginButton();
		 }
		 @AfterClass
			public void tearDown() {
				driver.close();
			}
	

}
