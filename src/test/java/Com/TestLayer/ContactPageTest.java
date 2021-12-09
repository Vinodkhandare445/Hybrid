package Com.TestLayer;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.BaseLayer.BaseClass;
import Com.PageLayer.ContactPage;
import Com.UtilsLayer.ExcelReader;
import Com.UtilsLayer.UtilsClass;

public class ContactPageTest extends BaseClass{
  public ContactPage contactpage;
	public HomePageTest homepagetest;
	public LoginPageTestPF loginpage;
	public ExcelReader excelreader;
	public UtilsClass util;
	@BeforeClass
	public void setup() {
		BaseClass.initialization();
		contactpage=new ContactPage();
		homepagetest=new HomePageTest();
		loginpage=new LoginPageTestPF();
		excelreader=new ExcelReader();
		util=new UtilsClass();
	}
	
	@Test(priority=1)
	public void validateLoginFuntionality() throws Exception {
		
		loginpage.LoginFunctionality();
		
		
		
	}
	@Test(priority=2)
	public void validateContactClick1() {
		contactpage.contactLinkClick();
	}
	
	@Test(priority=3)
	public void validateCreateButtonClick() throws Exception {
		contactpage.createButtonClick();
		util.captureScreenshot();
		
	}
	@Test(priority=4)
	public void TypeFirstName() {
		contactpage.firstNameType(excelreader.getData(0, 1, 0));
	}
	@Test(priority=5)
	public void typeMiddleName() {
		contactpage.middleNameType(excelreader.getData(0, 1, 1));
	}
	
	@Test(priority=6)
	public void typeLastName() {
		contactpage.lastNameType(excelreader.getData(0, 1, 2));
	}
	@Test(priority=7)
	public void typeCompanyName() {
		contactpage.companyNameType(excelreader.getData(0, 1, 3));
	}
	@Test(priority=8)
	public void CompanyTagClick() {
		contactpage.companyTagType();
	}@Test(priority=9)
	public void validateaccessButtonClick() {
		contactpage.accessButtonClick();
	}@Test(priority=10)
	public void typeDpText() {
		contactpage.dpTextType();
	}
	@Test(priority=11)
	public void validateDpTagClick() {
		contactpage.dpTagClick();
	}
	@Test(priority=12)
	public void validatesaveButtonClick() throws Exception  {
		util.captureScreenshot();
		contactpage.saveButtonClick();
		
	}
	@AfterTest
	public void tearDown()  {
		driver.close();
	}
	
	
}
